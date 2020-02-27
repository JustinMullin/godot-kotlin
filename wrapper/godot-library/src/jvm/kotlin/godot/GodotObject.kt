package godot

import godot.core.GD
import godot.core.JniType
import godot.core.Variant
import godot.gdnative.godot_construct_class
import godot.gdnative.godot_variant_as_object
import java.io.PrintWriter
import java.io.StringWriter
import kotlin.reflect.KFunction1

// TODO: these should be proper thread locals
internal var nativeConstructorInvocationFlag: Boolean = true
internal var nonNativeConstructorRawMemory: Long = 0

actual abstract class GodotObject : JniType {
    internal constructor(mem: Long) {
        rawMemory = mem
    }
    internal constructor(variant: Variant) {
        rawMemory = godot_variant_as_object(variant) as Long
    }
    internal constructor(name: String) {
        if (nativeConstructorInvocationFlag) {
            if (name != "") {
                rawMemory = godot_construct_class(name)
                GD.print("Constructing GodotObject in native context with name '$name' at $rawMemory")
            } else {
                GD.print("Constructing GodotObject in native context with no name")
            }
        } else {
            nativeConstructorInvocationFlag = true
            rawMemory = nonNativeConstructorRawMemory
            GD.print("Constructing GodotObject in non-native context at $rawMemory")
        }
    }

    actual var __yieldSignalFunction: KFunction1<Array<out Variant>, Unit>? = null
    actual fun __yieldSignalListener(vararg args: Variant) {
//        __yieldSignalFunction?.invoke(args) TODO: setup proper yields
    }

    companion object {
        @JvmStatic
        fun prepConstructorMemory(mem: Long) {
            nativeConstructorInvocationFlag = false
            nonNativeConstructorRawMemory = mem
        }
    }
}
