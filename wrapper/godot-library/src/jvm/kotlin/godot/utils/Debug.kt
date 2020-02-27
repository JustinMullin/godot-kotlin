package godot.utils

import godot.core.GD
import java.io.PrintWriter
import java.io.StringWriter

fun gdStackTrace(tag: String) {
    val stringWriter = StringWriter()
    Exception().printStackTrace(PrintWriter(stringWriter))
    GD.print("$tag\n$stringWriter")
}

fun gdStackTrace(e: Exception) {
    val stringWriter = StringWriter()
    e.printStackTrace(PrintWriter(stringWriter))
    GD.print("$e\n$stringWriter")
}
