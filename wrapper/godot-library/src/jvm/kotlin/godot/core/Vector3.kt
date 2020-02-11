@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

actual class Vector3(actual var x: Double, actual var y: Double, actual var z: Double) : Comparable<Vector3>, JniType() {
    actual enum class Axis(val id: Long) {
        AXIS_X(0),
        AXIS_Y(1),
        AXIS_Z(2);

        actual companion object {
            actual fun fromInt(value: Long) = values().single { it.id == value }
        }
    }

    companion object {
        fun fromRawMemory(pointer: Long): Vector3 {
            return Vector3().apply { nativePointer = pointer }
        }
    }

    actual constructor() : this(0.0, 0.0, 0.0)

    actual constructor(x: Number, y: Number, z: Number) :
        this(x.toDouble(), y.toDouble(), z.toDouble())

    override fun equals(other: Any?): Boolean =
            when (other) {
                is Vector3 -> (x == other.x && y == other.y && z == other.z)
                else -> false
            }

    override fun compareTo(other: Vector3): Int {
        if (x == other.x) {
            return if (y == other.y)
                when {
                    z < other.z -> -1
                    z == other.z -> 0
                    else -> 1
                }
            else
                when {
                    y < other.y -> -1
                    else -> 1
                }
        } else
            return when {
                x < other.x -> -1
                else -> 1
            }
    }

    override fun toString() = "$x, $y, $z"
    override fun hashCode(): Int = this.toString().hashCode()
}

