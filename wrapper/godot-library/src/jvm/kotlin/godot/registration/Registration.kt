package godot.registration

import godot.core.Variant
import godot.core.VariantType
import godot.gdnative.*

private val registration = NativeHooks()

fun registerClass(className: String,
                  baseClass: String,
                  jvmName: String)
{
    registration.godot_wrapper_register_class(className, baseClass, jvmName)
}


fun registerMethod(className: String,
                   methodName: String,
                   jvmName: String,
                   signature: String,
                   rpcMode: RPCMode = RPCMode.Disabled)
{
    registration.godot_wrapper_register_method(className, methodName, jvmName, signature, rpcMode.value)
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

        if (defaultValue.getType() == VariantType.OBJECT) {
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

    registration.godot_wrapper_register_property(
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
                   arguments: Array<Pair<String, VariantType>> = arrayOf(),
                   defaultArguments: Array<Variant> = arrayOf())
{
//    registration.godot_wrapper_register_signal(className, name.toGDString(), arguments.size,
}
