@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

actual class Plane: JniType {
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): Plane {
            return Plane().apply { rawMemory = pointer }
        }
    }

    actual enum class ClockDirection {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }

    actual var normal: Vector3
    actual var d: Double = 0.0


    actual constructor(normal: Vector3, d: Number) {
        this.normal = normal
        this.d = d.toDouble()
    }

    actual constructor(point: Vector3, normal: Vector3) {
        this.normal = normal
        this.d = normal.dot(point)
    }

    actual constructor(point1: Vector3, point2: Vector3, point3: Vector3, dir: ClockDirection) {
        normal = if (dir == ClockDirection.CLOCKWISE)
            (point1 - point3).cross(point1 - point2)
        else
            (point1 - point2).cross(point1 - point3)

        normal.normalize()
        d = normal.dot(point1)
    }

    actual constructor(p1: Number, p2: Number, p3: Number, p4: Number) :
        this(Vector3(p1, p2, p3), p4)

    actual constructor() :
            this(Vector3(0,0,0), 0)


    override fun toString(): String = ""

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Plane -> normal == other.normal && d == other.d
            else -> false
        }
    }

    override fun hashCode(): Int {
        var result = normal.hashCode()
        result = 31 * result + d.hashCode()
        return result
    }
}
