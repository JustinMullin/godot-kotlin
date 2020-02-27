package godot.core

import godot.gdnative.place_boolean
import godot.gdnative.place_double
import godot.gdnative.place_long
import godot.gdnative.place_string

open class JniType {
    open var rawMemory: Long = 0
        internal set

    open fun isNull() = rawMemory == 0L
}

internal val String.rawMemory: Long get() = place_string(this)
internal val Long.rawMemory: Long get() = place_long(this)
internal val Double.rawMemory: Long get() = place_double(this)
internal val Boolean.rawMemory: Long get() = place_boolean(this)
