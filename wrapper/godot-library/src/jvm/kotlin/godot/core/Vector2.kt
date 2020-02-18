@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

actual class Vector2 : Comparable<Vector2>, JniType {
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): Vector2 {
            return Vector2().apply { rawMemory = pointer }
        }
    }

    actual var x: Double = 0.0
    actual var y: Double = 0.0

    actual constructor() : this(0.0, 0.0)

    actual constructor(x: Number, y: Number) {
        this.x = x.toDouble()
        this.y = y.toDouble()
    }

    actual var width: Double
        get() = x
        set(value) {
            x = value
        }
    actual var height: Double
        get() = y
        set(value) {
            y = value
        }

    override fun equals(other: Any?): Boolean =
            when (other) {
                is Vector2 -> (x == other.x && y == other.y)
                else -> false
            }

    override fun compareTo(other: Vector2): Int =
            if (x == other.x) {
                when {
                    y < other.y -> -1
                    y == other.y -> 0
                    else -> 1
                }
            } else {
                when {
                    x < other.x -> -1
                    else -> 1
                }
            }


    override fun toString() = "$x, $y"
    override fun hashCode(): Int = this.toString().hashCode()
}
