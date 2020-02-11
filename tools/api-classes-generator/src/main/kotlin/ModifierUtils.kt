import com.squareup.kotlinpoet.*

fun FileSpec.Builder.applyIfTarget(actual: GeneratorTarget, expected: GeneratorTarget, f: FileSpec.Builder.() -> FileSpec.Builder): FileSpec.Builder {
    return if (actual == expected) this.f() else this
}

fun TypeSpec.Builder.actualIfImplementation(target: GeneratorTarget): TypeSpec.Builder {
    return if (target.implementation) addModifiers(KModifier.ACTUAL) else this
}

fun TypeSpec.Builder.expectIfInterface(target: GeneratorTarget): TypeSpec.Builder {
    return if (!target.implementation) addModifiers(KModifier.EXPECT) else this
}

fun TypeSpec.Builder.applyToImplementation(target: GeneratorTarget, f: TypeSpec.Builder.() -> TypeSpec.Builder): TypeSpec.Builder {
    return if (target.implementation) this.f() else this
}

fun TypeSpec.Builder.applyIfTarget(actual: GeneratorTarget, expected: GeneratorTarget, f: TypeSpec.Builder.() -> TypeSpec.Builder): TypeSpec.Builder {
    return if (actual == expected) this.f() else this
}

fun PropertySpec.Builder.actualIfImplementation(target: GeneratorTarget): PropertySpec.Builder {
    return if (target.implementation) addModifiers(KModifier.ACTUAL) else this
}

fun PropertySpec.Builder.applyToImplementation(target: GeneratorTarget, f: PropertySpec.Builder.() -> PropertySpec.Builder): PropertySpec.Builder {
    return if (target.implementation) this.f() else this
}

fun PropertySpec.Builder.applyIfTarget(actual: GeneratorTarget, expected: GeneratorTarget, f: PropertySpec.Builder.() -> PropertySpec.Builder): PropertySpec.Builder {
    return if (actual == expected) this.f() else this
}

fun FunSpec.Builder.actualIfImplementation(target: GeneratorTarget): FunSpec.Builder {
    return if (target.implementation) addModifiers(KModifier.ACTUAL) else this
}

fun FunSpec.Builder.applyToImplementation(target: GeneratorTarget, f: FunSpec.Builder.() -> FunSpec.Builder): FunSpec.Builder {
    return if (target.implementation) this.f() else this
}

fun FunSpec.Builder.applyIfTarget(actual: GeneratorTarget, expected: GeneratorTarget, f: FunSpec.Builder.() -> FunSpec.Builder): FunSpec.Builder {
    return if (actual == expected) this.f() else this
}
