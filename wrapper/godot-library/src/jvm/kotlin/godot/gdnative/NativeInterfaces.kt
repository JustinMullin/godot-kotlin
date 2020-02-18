package godot.gdnative

import godot.core.*
import godot.core.Vector2

interface godot_instance_binding_functions {
    var alloc_instance_binding_data: ((Any?, Any?, Any?) -> Any?)

    var data: Any?

    var free_func: ((Any?) -> Unit)

    var free_instance_binding_data: ((Any?, Any?) -> Unit)

    var refcount_decremented_instance_binding: ((Any?, Any?) -> Boolean)

    var refcount_incremented_instance_binding: ((Any?, Any?) -> Unit)
}

interface godot_instance_create_func {
    var create_func: ((Any?, Any?) -> Any?)

    var free_func: ((Any?) -> Unit)

    var method_data: Any?
}

interface godot_instance_destroy_func {
    var destroy_func: ((Any?, Any?, Any?) -> Unit)

    var free_func: ((Any?) -> Unit)

    var method_data: Any?
}

interface godot_instance_method {
    var free_func: ((Any?) -> Unit)

    var method: ((Any?, Any?, Any?, Int, Variant?) -> Variant)

    var method_data: Any?
}

interface godot_method_arg {
    var hint: godot_property_hint

    val hint_string: String

    val name: String

    var type: godot_variant_type
}

interface godot_method_attributes {
    var rpc_type: Int
}

typealias godot_method_bind = Long

class godot_pool_array_read_access

class godot_pool_array_write_access

interface godot_property_attributes {
    val default_value: Variant

    var hint: godot_property_hint

    val hint_string: String

    var rset_type: Int

    var type: Int

    var usage: Int
}

interface godot_property_get_func {
    var free_func: ((Any?) -> Unit)

    var get_func: ((Any?, Any?, Any?) -> Variant)

    var method_data: Any?
}

interface godot_property_set_func {
    var free_func: ((Any?) -> Unit)

    var method_data: Any?

    var set_func: ((Any?, Any?, Any?, Variant?) -> Unit)
}

interface godot_signal {
    var args: godot_signal_argument?

    var default_args: Variant?

    val name: String

    var num_args: Int

    var num_default_args: Int
}

interface godot_signal_argument {
    val default_value: Variant

    var hint: godot_property_hint

    val hint_string: String

    val name: String

    var type: Int

    var usage: Int
}

class godot_string_name

interface godot_variant_call_error {
    var argument: Int

    var error: godot_variant_call_error_error

    var expected: godot_variant_type
}

