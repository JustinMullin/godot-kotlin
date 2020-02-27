import com.beust.klaxon.Json
import com.squareup.kotlinpoet.*
import java.io.File
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy


class Class(
        @Json(name = "name")
        var name: String,
        @Json(name = "base_class")
        var baseClass: String,
        @Json(name = "singleton")
        val isSingleton: Boolean,
        @Json(name = "instanciable")
        val isInstanciable: Boolean,
        @Json(name = "constants")
        val constants: Map<String, Int>,
        @Json(name = "properties")
        val properties: List<Property>,
        @Json(name = "signals")
        val signals: List<Signal>,
        @Json(name = "methods")
        val methods: List<Method>,
        @Json(name = "enums")
        val enums: List<Enum>) {

    private val oldName: String = name
    private val shouldGenerate: Boolean
    val additionalImports = mutableListOf<Pair<String, String>>()

    init {
        name = name.escapeUnderscore()
        baseClass = baseClass.escapeUnderscore()

        shouldGenerate = name != "GlobalConstants"
    }


    fun generate(target: GeneratorTarget, path: String, tree: Graph<Class>, icalls: MutableSet<ICall>) {
        if (!shouldGenerate) return

        val outputDirectory = getPathForGeneratedFiles(path)
        val packageName = "godot"
        val className = ClassName(packageName, name)

        val classTypeBuilder = createTypeBuilder(className, packageName)
            .actualIfImplementation(target)
            .expectIfInterface(target)

        generateConstructors(target, classTypeBuilder)
        generateEnums(target, classTypeBuilder)
        generateSignals(target, classTypeBuilder)

        val baseCompanion = createBaseCompanion(target)
                .actualIfImplementation(target)
        generateCasts(target, tree, baseCompanion)
        generateConstants(target, baseCompanion)

        val propertiesReceiverType = if (isSingleton) baseCompanion else classTypeBuilder
        generateProperties(target, tree, icalls, propertiesReceiverType)
        generateMethods(target, propertiesReceiverType, tree, icalls)

        classTypeBuilder.addType(baseCompanion.build())

        //Build Type and create file
        val fileBuilder = FileSpec
                .builder(packageName, className.simpleName)
                .addType(classTypeBuilder.build())

        additionalImports.forEach {
            fileBuilder.addImport(it.first, it.second)
        }

        fileBuilder
                .build()
                .writeTo(outputDirectory)
    }

    fun applyGettersAndSettersForProperties(tree: Graph<Class>) {
        tree.getAllDescendingProperties(this).forEach { property ->
            methods.forEach { method ->
                property.applyGetterOrSetter(method)
            }
        }
    }

    private fun getPathForGeneratedFiles(path: String): File {
        val outputDir = File(path)
        outputDir.parentFile.mkdirs()
        return outputDir
    }

    private fun createTypeBuilder(className: ClassName, packageName: String): TypeSpec.Builder {
        return TypeSpec
                .classBuilder(className)
                .addModifiers(KModifier.OPEN)
                .superclass(ClassName(packageName, if (baseClass.isEmpty()) "GodotObject" else baseClass))
    }

    private fun generateConstructors(target: GeneratorTarget, typeBuilder: TypeSpec.Builder) {
        val superConstructorName = when {
            isInstanciable && name != "Thread" -> "\"$name\""
            isInstanciable && name == "Thread" -> "\"_Thread\""
            else -> ""
        }
        typeBuilder.addFunction(
                FunSpec.constructorBuilder()
                        .applyToImplementation(target) { callSuperConstructor(superConstructorName) }
                        .actualIfImplementation(target)
                        .build()
        )
        typeBuilder.addFunction(
                FunSpec.constructorBuilder()
                        .addParameter("variant", ClassName("godot.core", "Variant"))
                        .applyToImplementation(target) { callSuperConstructor("variant") }
                        .actualIfImplementation(target)
                        .build()
        )

        when (target) {
            GeneratorTarget.Native -> {
                typeBuilder.addFunction(
                    FunSpec.constructorBuilder()
                        .addModifiers(KModifier.INTERNAL)
                        .addParameter("mem", target.opaquePointerClass)
                        .callSuperConstructor("mem")
                        .build()
                )
                typeBuilder.addFunction(
                        FunSpec.constructorBuilder()
                                .addModifiers(KModifier.INTERNAL)
                                .addParameter("name", String::class)
                                .callSuperConstructor("name")
                                .build()
                )
            }
            GeneratorTarget.Jvm -> {
                typeBuilder.addFunction(
                    FunSpec.constructorBuilder()
                        .addModifiers(KModifier.INTERNAL)
                        .addParameter("mem", target.opaquePointerClass)
                        .callSuperConstructor("mem")
                        .build()
                )
                typeBuilder.addFunction(
                        FunSpec.constructorBuilder()
                                .addModifiers(KModifier.INTERNAL)
                                .addParameter("name", String::class)
                                .callSuperConstructor("name")
                                .build()
                )
            }
            else -> Unit
        }
    }

    private fun generateEnums(target: GeneratorTarget, typeBuilder: TypeSpec.Builder) {
        enums.forEach {
            typeBuilder.addType(it.generated(target))
        }
    }

    private fun generateSignals(target: GeneratorTarget, typeBuilder: TypeSpec.Builder) {
        val signalClassBuilder = TypeSpec.classBuilder("Signal").actualIfImplementation(target)
        val signalCompanionObjectBuilder = TypeSpec.companionObjectBuilder().actualIfImplementation(target)

        signals.forEach {
            signalCompanionObjectBuilder.addProperty(it.generated(target))
        }
        signalClassBuilder.addType(signalCompanionObjectBuilder.build())

        typeBuilder.addType(signalClassBuilder.build())
    }

    private fun createBaseCompanion(target: GeneratorTarget): TypeSpec.Builder {
        return TypeSpec.companionObjectBuilder().apply {
            if (isSingleton && target.implementation) {
                if (target == GeneratorTarget.Native) {
                    addAnnotation(ClassName("kotlin.native", "ThreadLocal"))
                }
                addProperty(createSingletonProperty(target))
            }
            if (target == GeneratorTarget.Jvm) {
                addFunction(FunSpec.builder("fromRawMemory")
                        .addAnnotation(AnnotationSpec.builder(JvmStatic::class).build())
                        .addParameter("pointer", Long::class)
                        .addStatement("return $name(pointer)")
                        .build())
            }
        }
    }

    private fun createSingletonProperty(target: GeneratorTarget): PropertySpec {
        return PropertySpec
                .builder(
                        "rawMemory",
                        target.opaquePointerClass,
                        KModifier.PRIVATE, KModifier.FINAL
                )
                .delegate("lazy·{ %M(\"$name\", \"$oldName\") }", MemberName("godot.utils", "getSingleton"))
                .build()
    }

    private fun generateCasts(target: GeneratorTarget, tree: Graph<Class>, baseCompanion: TypeSpec.Builder) {
        val funSpecs = mutableListOf<FunSpec>()
        var node = tree.nodes.find { it.value.name == name }!!.parent

        while (node != null) {
            funSpecs.add(
                    FunSpec.builder("from")
                            .addModifiers(KModifier.INFIX)
                            .actualIfImplementation(target)
                            .returns(ClassName("godot", name))
                            .addParameter("other", ClassName(if (node.value.name.isCoreType()) "godot.core" else "godot", node.value.name))
                            .addStatement(when (target) {
                                GeneratorTarget.Native -> "return $name(\"\").apply·{ setRawMemory(other.rawMemory) }"
                                else -> "return $name(\"\").apply·{ rawMemory·=·other.rawMemory }"
                            })
                            .build()
            )
            node = node.parent
        }
        funSpecs.add(
                FunSpec.builder("from")
                        .addModifiers(KModifier.INFIX)
                        .actualIfImplementation(target)
                        .returns(ClassName("godot", name))
                        .addParameter("other", ClassName("godot.core", "Variant"))
                        .addStatement(when (target) {
                            GeneratorTarget.Native -> "return %M($name(\"\"), other)"
                            else -> "return %M(other)"
                        }, MemberName("godot.utils", "fromVariant"))
                        .build()
        )

        funSpecs.forEach {
            baseCompanion.addFunction(it)
        }
    }

    private fun generateConstants(target: GeneratorTarget, baseCompanion: TypeSpec.Builder) {
        constants.forEach { (key, value) ->
            baseCompanion.addProperty(
                    PropertySpec
                            .builder(key, Long::class)
                            .actualIfImplementation(target)
                            .applyToImplementation(target) { initializer("%L", value) }
                            .build()
            )
        }
    }

    private fun generateProperties(target: GeneratorTarget, tree: Graph<Class>, icalls: MutableSet<ICall>, propertiesReceiverType: TypeSpec.Builder) {
        properties.forEach { property ->
            val propertySpec = property.generate(target, this, tree, icalls)
            if (propertySpec != null) {
                propertiesReceiverType.addProperty(propertySpec)

                if (target.implementation) {
                    val parameterType = property.type
                    val parameterTypeName = ClassName(if (parameterType.isCoreType()) "godot.core" else "godot", parameterType)

                    if (property.hasValidSetter && parameterType.isCoreTypeAdaptedForKotlin()) {
                        val parameterName = property.name
                        val propertyFunSpec = FunSpec.builder(parameterName)

                        if (!isSingleton) {
                            if (tree.doAncestorsHaveProperty(this, property)) {
                                propertyFunSpec.addModifiers(KModifier.OVERRIDE)
                            } else {
                                propertyFunSpec.addModifiers(KModifier.OPEN)
                            }
                        }

                        propertyFunSpec
                                .addParameter(
                                        ParameterSpec.builder(
                                                "schedule",
                                                LambdaTypeName.get(
                                                        receiver = parameterTypeName,
                                                        returnType = ClassName("kotlin", "Unit")
                                                )
                                        ).build()
                                )
                                .returns(parameterTypeName)
                                .addStatement(
                                        """return $parameterName.apply·{
                                                |    schedule(this)
                                                |    $parameterName = this
                                                |}
                                                |""".trimMargin()
                                )

                        propertiesReceiverType.addFunction(propertyFunSpec.build())
                    }
                }
            }
        }
    }

    private fun generateMethods(target: GeneratorTarget, propertiesReceiverType: TypeSpec.Builder, tree: Graph<Class>, icalls: MutableSet<ICall>) {
        methods.forEach { method ->
            if (!method.isVirtual) {
                when (target) {
                    GeneratorTarget.Native, GeneratorTarget.Jvm -> {
                        val propertySpec = PropertySpec.builder(
                            "${method.name}MethodBind",
                            when (target) {
                                GeneratorTarget.Native -> ClassName("kotlinx.cinterop", "CPointer")
                                        .parameterizedBy(ClassName("godot.gdnative", "godot_method_bind"))
                                else -> ClassName("godot.gdnative", "godot_method_bind")
                            }
                        )

                        propertiesReceiverType.addProperty(
                                propertySpec.delegate("%L%M(\"${oldName}\",\"${method.oldName}\")%L",
                                        "lazy·{ ",
                                        MemberName("godot.utils", "getMB"),
                                        " }"
                                ).addModifiers(if (method.isGetterOrSetter) KModifier.PROTECTED else KModifier.PRIVATE, KModifier.FINAL)
                                        .build())
                    }
                    else -> Unit
                }
            }

            val generated = method.generate(target, this, tree, icalls)
            if (generated != null) {
                propertiesReceiverType.addFunction(generated)
            }
        }
    }
}
