@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

actual class Rect2: JniType {
    companion object {
        fun fromRawMemory(pointer: Long): Rect2 {
            return Rect2().apply { nativePointer = pointer }
        }
    }

    actual var position = Vector2()
    actual var size = Vector2()

    actual constructor()

    actual constructor(x: Number, y: Number, width: Number, height: Number) {
        position = Vector2(x, y)
        size = Vector2(width, height)
    }

    actual constructor(position: Vector2, size: Vector2) {
        this.position = position
        this.size = size
    }


    override fun equals(other: Any?): Boolean =
            when (other) {
                is Rect2 -> position==other.position && size==other.size
                else     -> false
            }

    override fun toString(): String = "$position, $size"

    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + size.hashCode()
        return result
    }
}
