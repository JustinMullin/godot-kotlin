package godot.gdnative

import godot.core.*

external fun godot_wrapper_register_class(class_name: String?, base_class_name: String?)
external fun godot_wrapper_register_method(class_name: String?, name: String?, argumentTypes: String, returnType: String, rpc_type: Int)
external fun godot_wrapper_register_property(className: String, propertyName: String, propertyClass: String, defaultValue: Variant, propertyType: Int, rpcMode: Int, usage: Int, propertyHint: Int, hintString: String)
external fun godot_wrapper_register_signal(class_name: String?, name: String, args: Array<godot_signal_argument>?, default_args: Array<Variant>?)
external fun godot_construct_class(p_classname: String?): Long
