package godot

import godot.core.JniType
import godot.core.Variant
import godot.gdnative.godot_construct_class
import godot.gdnative.godot_variant_as_object
import kotlin.reflect.KFunction1

actual abstract class GodotObject : JniType {
    internal constructor(mem: Long) {
        rawMemory = mem
    }
    internal constructor(variant: Variant) {
        rawMemory = godot_variant_as_object(variant) as Long
    }
    internal constructor(name: String) {
        if (name != "") {
            rawMemory = godot_construct_class(name)
        }
    }

    actual var __yieldSignalFunction: KFunction1<Array<out Variant>, Unit>? = null
    actual fun __yieldSignalListener(vararg args: Variant) {
//        __yieldSignalFunction?.invoke(args) TODO: setup proper yields
    }
}
