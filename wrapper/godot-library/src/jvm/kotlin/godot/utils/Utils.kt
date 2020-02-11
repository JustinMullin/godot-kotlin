package godot.utils

import godot.GodotObject
import godot.gdnative.godot_global_get_singleton
import godot.gdnative.godot_method_bind
import godot.gdnative.godot_method_bind_get_method
import godot.gdnative.godot_variant_as_object
import godot.core.Variant


internal fun getMB(cl: String, m: String): godot_method_bind {
    return godot_method_bind_get_method(cl, m) ?: throw NullPointerException("No method bind found for $cl::$m")
}


internal fun getSingleton(cl: String, clOld: String): Any {
    return godot_global_get_singleton(cl) ?: throw NullPointerException("Cannot get singleton instance for class $clOld")
}


internal fun <T: GodotObject> fromVariant(other: Variant): T {
    return godot_variant_as_object(other) as T
}
