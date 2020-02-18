package godot.registration

import godot.core.GD
import godot.core.Variant
import godot.gdnative.*

fun registerClass(className: String,
                  baseClass: String,
                  jvmName: String) {
    godot_wrapper_register_class(className, baseClass, jvmName)
}


fun registerMethod(className: String,
                   methodName: String,
                   jvmName: String,
                   signature: String,
                   rpcMode: RPCMode = RPCMode.Disabled) {
    godot_wrapper_register_method(className, methodName, jvmName, signature, rpcMode.value)
}


fun registerProperty(className: String,
                     jvmClassName: String,
                     visibleInEditor: Boolean,
                     propertyName: String,
                     defaultValue: Variant,
                     rpcMode: RPCMode = RPCMode.Disabled,
                     usageFlags: PropertyUsage = PropertyUsage.NoEditor,
                     propertyHint: PropertyHint = PropertyHint.None,
                     hintString: String = "") {
    var flags = usageFlags or PropertyUsage.ScriptVariable
    var hint = propertyHint
    var hintStr = hintString

    if (visibleInEditor) {
        flags = flags or PropertyUsage.Editor

        if (defaultValue.getType() == Variant.Type.OBJECT) {
            if (propertyHint == PropertyHint.None) {
                val res = Variant("Resource")
                val result = defaultValue.call("is_class", arrayOf(res))
                if (result.toBoolean()) {
                    hint = PropertyHint.ResourceType
                }
                res.dispose()
                result.dispose()
            }
            if (hintString.isEmpty()) {
                val result = defaultValue.call("get_class")
                hintStr = result.toString()
                result.dispose()
            }
        }
    }

    godot_wrapper_register_property(
        className,
        jvmClassName,
        propertyName,
        defaultValue,
        defaultValue.getType().id.toInt(),
        rpcMode.value,
        flags.value,
        hint.value.ordinal,
        hintStr
    )
}



fun registerSignal(className: String,
                   name: String,
                   arguments: Array<Pair<String, Variant.Type>> = arrayOf(),
                   defaultArguments: Array<Variant> = arrayOf()) {
    val convertedArguments = arguments.map { arg ->
        object : godot_signal_argument {
            override val default_value: Variant get() = Variant.from("")
            override var hint: godot_property_hint = godot_property_hint.GODOT_PROPERTY_HINT_NONE
            override val hint_string: String = ""
            override val name: String = arg.first
            override var type: Int = arg.second.id.toInt()
            override var usage: Int = 0
        }
    }

    godot_wrapper_register_signal(className, name, convertedArguments.toTypedArray(), defaultArguments)
}
