package godot

import godot.core.GD
import godot.core.JniType
import godot.core.Variant
import godot.gdnative.godot_construct_class
import godot.gdnative.godot_variant_as_object
import kotlin.reflect.KFunction1

internal var nativeConstructorInvocationFlag: Boolean = true
internal var nonNativeConstructorRawMemory: Long? = null

actual abstract class GodotObject : JniType {
    private var godotCoreMemory: Long? = 0L

    internal constructor(mem: Long) {
        godotCoreMemory = mem
    }
    internal constructor(variant: Variant) {
        godotCoreMemory = godot_variant_as_object(variant) as Long
    }
    internal constructor(name: String) {
        if (nativeConstructorInvocationFlag) {
            if (name != "") {
                godotCoreMemory = godot_construct_class(name)
            }
        } else {
            nativeConstructorInvocationFlag = true
            godotCoreMemory = nonNativeConstructorRawMemory!!
        }
    }

    override fun isNull(): Boolean = godotCoreMemory == null

    internal val rawMemory: Long
        get() = godotCoreMemory ?: throw NullPointerException("Attempt to use null object: $this")


    actual var __yieldSignalFunction: KFunction1<Array<out Variant>, Unit>? = null
    actual fun __yieldSignalListener(vararg args: Variant) {
//        __yieldSignalFunction?.invoke(args) TODO: setup proper yields
    }
}
