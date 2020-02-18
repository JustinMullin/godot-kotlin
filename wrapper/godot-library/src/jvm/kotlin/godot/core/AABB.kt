@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

actual class AABB: JniType {
    actual var position: Vector3
    actual var size: Vector3

    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): AABB {
            return AABB().apply { rawMemory = pointer }
        }
    }

    actual constructor(p_pos: Vector3, p_size: Vector3) {
        position = p_pos
        size = p_size
    }

    actual constructor() :
            this(Vector3(), Vector3())

    internal constructor(name: String) : this()

    override fun equals(other: Any?): Boolean =
        when (other) {
            is AABB -> (position == other.position && size == other.size)
            else -> false
        }

    override fun toString(): String =
            "$position - $size"

    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + size.hashCode()
        return result
    }
}
