package godot.core

open class JniType {
    var rawMemory: Long = 0
        internal set

    open fun isNull() = rawMemory == 0L
}
