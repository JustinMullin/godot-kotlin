package godot.gdnative

import godot.core.*

external fun godot_wrapper_register_class(class_name: String?, base_class_name: String?, jvm_name: String?)
external fun godot_wrapper_register_method(class_name: String?, name: String?, jvm_name: String, signature: String, rpc_type: Int)
external fun godot_wrapper_register_property(className: String, jvmClassName: String, propertyName: String, defaultValue: Variant, propertyType: Int, rpcMode: Int, usage: Int, propertyHint: Int, hintString: String)
external fun godot_wrapper_register_signal(class_name: String?, name: String, num_args: Int, args: Array<godot_signal_argument>?, num_default_args: Int, default_args: Array<Variant>?)
external fun godot_construct_class(p_classname: String?): Long
