import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName

enum class GeneratorTarget(val sourceSetName: String,
                           val implementation: Boolean,
                           val pointerClass: (ClassName) -> TypeName,
                           val opaquePointerClass: TypeName,
                           val opaquePointerVarClass: TypeName) {
    Common("common",
            false,
            { throw Exception("No implementation should be affixed to common target.") },
            ClassName("???", "???"),
            ClassName("???", "???")
    ),
    Native("native",
            true,
            { ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(it) },
            ClassName("kotlinx.cinterop", "COpaquePointer"),
            ClassName("kotlinx.cinterop", "COpaquePointerVar")
    ),
    Jvm("jvm",
            true,
            { it },
            ClassName("kotlin", "Long"),
            ClassName("kotlin", "Long")
    )
}
