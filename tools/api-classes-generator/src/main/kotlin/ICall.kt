import com.squareup.kotlinpoet.*

class ICall(
        var returnType: String,
        private val arguments: List<Argument>
) {
    private val returnTypeClass = createReturnTypeClass()
    val name: String = createICallName()

    fun iCallSpec(target: GeneratorTarget): FunSpec {
        return generateICall(target)
    }

    init {
        if (returnType.isEnum()) returnType = "Long"
    }

    private fun createICallName(): String {
        return buildString {
            append("_icall_${if (returnType.isEnum()) "Long" else returnType}")

            for (arg in arguments) {
                append('_')

                if (arg.nullable) {
                    append('n')
                }

                append(arg.type.convertTypeForICalls())
            }
        }
    }

    private fun createReturnTypeClass() = ClassName(
            if (returnType.isEnum()) "kotlin" else returnType.getPackage(),
            if (returnType.isEnum()) "Long" else returnType
    )

    private fun generateICall(target: GeneratorTarget): FunSpec {
        val spec = FunSpec
                .builder(name)
                .addModifiers(KModifier.INTERNAL)
                .addParameter(
                        ParameterSpec(
                                "mb",
                                when (target) {
                                    GeneratorTarget.Native -> target.pointerClass(ClassName("godot.gdnative", "godot_method_bind"))
                                    else -> ClassName("godot.gdnative", "godot_method_bind")
                                }
                        )
                )
                .addParameter("inst", target.opaquePointerClass)

        addArgumentsToICall(spec)


        val shouldReturn = returnType != "Unit"
        val isPrimitive = returnType.isPrimitive()

        addReturnTypeForICall(target, shouldReturn, spec, isPrimitive)
        generateICallMethodBlock(target, shouldReturn, isPrimitive, spec)

        return spec.build()
    }

    private fun generateICallMethodBlock(target: GeneratorTarget, shouldReturn: Boolean, isPrimitive: Boolean, spec: FunSpec.Builder) {
        val codeBlockBuilder = CodeBlock.builder()

        if (target == GeneratorTarget.Native) {
            codeBlockBuilder.add("%M {\n", MemberName("kotlinx.cinterop", "memScoped"))
        }

        generateArguments(target, codeBlockBuilder)

        generateCall(target, shouldReturn, isPrimitive, codeBlockBuilder)

        if (target == GeneratorTarget.Native) {
            codeBlockBuilder.add("}\n")
        }

        if (shouldReturn) {
            when (target) {
                GeneratorTarget.Native -> codeBlockBuilder.add("return ret")
                GeneratorTarget.Jvm -> codeBlockBuilder.add("return ret as %T", returnTypeClass)
                else -> Unit
            }
        }

        spec.addCode(codeBlockBuilder.build())
    }

    private fun generateArguments(target: GeneratorTarget, codeBlockBuilder: CodeBlock.Builder) {
        when (target) {
            GeneratorTarget.Native -> {
                codeBlockBuilder
                        .add(
                                "    val args = %M<%T>(${arguments.size + 1})\n",
                                MemberName("kotlinx.cinterop", "allocArray"),
                                target.opaquePointerVarClass
                        )
                        .add(
                                buildString {
                                    arguments.withIndex().forEach {
                                        val i = it.index
                                        appendln("    args[$i] = arg$i${if (it.value.nullable) "?.getRawMemory(memScope)" else ".getRawMemory(memScope)"}\n")
                                    }
                                }
                        )
                        .add("    args[${arguments.size}] = null\n")
            }
            GeneratorTarget.Jvm -> {
                codeBlockBuilder
                        .add(
                                "val args = longArrayOf("
                        )
                        .add(buildString {
                            append(arguments.withIndex().joinToString(", ") { e ->
                                "arg${e.index}${if (e.value.nullable) "?.rawMemory ?: 0" else ".rawMemory"}"
                            })
                            appendln(")")
                        })
            }
            else -> Unit
        }
    }

    private fun generateCall(target: GeneratorTarget, shouldReturn: Boolean, isPrimitive: Boolean, codeBlockBuilder: CodeBlock.Builder) {
        when (target) {
            GeneratorTarget.Native -> {
                if (shouldReturn) {
                    if (isPrimitive) {
                        codeBlockBuilder.add(
                                "    val retVar = %M<%T>()\n",
                                MemberName("kotlinx.cinterop", "alloc"),
                                ClassName("kotlinx.cinterop", "${returnType}Var")
                        )
                    } else {
                        codeBlockBuilder.add(
                                "    val retVar = %M<%T>(20)\n",
                                MemberName("kotlinx.cinterop", "allocArray"),
                                ClassName("kotlinx.cinterop", "ByteVar")
                        )
                    }
                }

                if (shouldReturn) {
                    if (isPrimitive) {
                        codeBlockBuilder.add(
                                "    %M(mb, inst, args, retVar.%M)\n",
                                MemberName("godot.gdnative", "godot_method_bind_ptrcall"),
                                MemberName("kotlinx.cinterop", "ptr")
                        )
                        codeBlockBuilder.add(
                                "    ret = retVar.%M\n",
                                MemberName("kotlinx.cinterop", "value")
                        )
                    } else {
                        codeBlockBuilder.add(
                                "    %M(mb, inst, args, retVar)\n",
                                MemberName("godot.gdnative", "godot_method_bind_ptrcall")
                        )
                        codeBlockBuilder.add(
                                "    ret = %T(retVar)\n",
                                returnTypeClass
                        )
                    }
                } else {
                    codeBlockBuilder.add(
                            "    %M(mb, inst, args, null)\n",
                            MemberName("godot.gdnative", "godot_method_bind_ptrcall")
                    )
                }
            }
            GeneratorTarget.Jvm -> {
                val callType = when {
                    !shouldReturn -> "void"
                    returnType == "String" -> "string"
                    returnType == "Long" -> "long"
                    returnType == "Double" -> "double"
                    returnType == "Boolean" -> "boolean"
                    else -> "object"
                }
                codeBlockBuilder.add(
                        if (shouldReturn) "val ret = " else "    \n"
                )
                codeBlockBuilder.add(
                        if (callType == "object") {
                            "%M(mb, inst, args, \"${if (returnType.isCoreType()) "godot/core/" else "godot/"}$returnType\")\n"
                        } else {
                            "%M(mb, inst, args)\n"
                        },
                        MemberName("godot.gdnative", "godot_method_bind_ptrcall_$callType")
                )
            }
            else -> Unit
        }
    }

    private fun addReturnTypeForICall(target: GeneratorTarget, shouldReturn: Boolean, spec: FunSpec.Builder, isPrimitive: Boolean) {
        spec.returns(returnTypeClass)
        when (target) {
            GeneratorTarget.Native -> {
                if (shouldReturn) {
                    if (isPrimitive) {
                        spec.addStatement("var ret: %N = ${returnType.defaultValue()}", returnTypeClass.simpleName)
                    } else {
                        spec.addStatement("lateinit var ret: %N", returnTypeClass.simpleName)
                    }
                }
            }
            else -> Unit
        }
    }

    private fun addArgumentsToICall(spec: FunSpec.Builder) {
        arguments.withIndex().forEach {
            val argument = it.value
            val argumentTypeAsString = argument.type.convertTypeForICalls()
            var argumentType: TypeName = ClassName(argumentTypeAsString.getPackage(), argumentTypeAsString)

            if (argument.nullable) {
                argumentType = argumentType.copy(nullable = true)
            }

            spec.addParameter("arg${it.index}", argumentType)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is ICall) return false

        return this.name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
