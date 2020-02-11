package godot.registration

import godot.core.GD
import godot.core.Variant
import kotlin.system.exitProcess

const val EXIT_FAILURE = 1

inline fun <reified T: godot.GodotObject> invoke(name: String, ret: Any?, obj: Any?, numArgs: Int, args: Any?, shedule: (T, Int, Any?) -> Variant?) {
    if (obj == null) {
        GD.printError("Invoked method $name for null object", "$name invocation", "Entry.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    try {
        shedule(obj as T, numArgs, args)
    }
    catch (e: Throwable) {
        GD.printError(e.message.toString(), name, obj.toString(), 0)
        e.printStackTrace()
        exitProcess(EXIT_FAILURE)
    }
}
fun noMethodToInvoke(name: String, className: String, numArgs: Int) {
    GD.printError("No such method \"$name\" in $className with $numArgs arguments!", name, "", 0) // TODO: ???
    exitProcess(EXIT_FAILURE)
}
