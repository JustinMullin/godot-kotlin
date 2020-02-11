package godot.core

open class JniType {
    var nativePointer: Long = 0
        internal set

    open fun isNull(): Boolean = false
}
