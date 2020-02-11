@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import java.lang.Math.cos
import java.lang.Math.sin


actual class Basis: JniType {
    actual var x: Vector3 = Vector3()
    actual var y: Vector3 = Vector3()
    actual var z: Vector3 = Vector3()

    companion object {
        fun fromRawMemory(pointer: Long): Basis {
            return Basis().apply { nativePointer = pointer }
        }
    }

    actual constructor(x: Vector3, y: Vector3, z: Vector3) {
        this.x = x
        this.y = y
        this.z = z
    }

    actual constructor(euler: Vector3) {
        setEuler(euler)
    }

    actual constructor(quat: Quat) {
        x = Vector3()
        y = Vector3()
        z = Vector3()

        val d = quat.lengthSquared()
        val s = 2.0 / d
        val xs = quat.x * s
        val ys = quat.y * s
        val zs = quat.z * s
        val wx = quat.w * xs
        val wy = quat.w * ys
        val wz = quat.w * zs
        val xx = quat.x * xs
        val xy = quat.x * ys
        val xz = quat.x * zs
        val yy = quat.y * ys
        val yz = quat.y * zs
        val zz = quat.z * zs
        set(	1.0 - (yy + zz), xy - wz, xz + wy,
                xy + wz, 1.0 - (xx + zz), yz - wx,
                xz - wy, yz + wx, 1.0 - (xx + yy))
    }

    actual constructor(axis: Vector3, phi: Double) {
        x = Vector3()
        y = Vector3()
        z = Vector3()

        // Rotation matrix from axis and angle, see https://en.wikipedia.org/wiki/Rotation_matrix#Rotation_matrix_from_axis_and_angle
        val axisq = Vector3(axis.x*axis.x,axis.y*axis.y,axis.z*axis.z)

        val cosine: Double = cos(phi)
        val sine: Double = sin(phi)

        apply {
            x[0] = axisq.x + cosine * (1.0 - axisq.x)
            x[1] = axis.x * axis.y * (1.0 - cosine) - axis.z * sine
            x[2] = axis.z * axis.x * (1.0 - cosine) + axis.y * sine

            y[0] = axis.x * axis.y * (1.0 - cosine) + axis.z * sine
            y[1] = axisq.y + cosine * (1.0 - axisq.y)
            y[2] = axis.y * axis.z * (1.0 - cosine) - axis.x * sine

            z[0] = axis.z * axis.x * (1.0 - cosine) - axis.y * sine
            z[1] = axis.y * axis.z * (1.0 - cosine) + axis.x * sine
            z[2] = axisq.z + cosine * (1.0 - axisq.z)
        }
    }


    actual constructor(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number) :
            this(Vector3(xx,xy,xz), Vector3(yx,yy,yz), Vector3(zx,zy,zz))

    actual constructor():
            this(1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0)


    override fun toString(): String =
        "${this[0][0]}, ${this[0][1]}, ${this[0][2]}, " +
            "${this[1][0]}, ${this[1][1]}, ${this[1][2]}, " +
            "${this[2][0]}, ${this[2][1]}, ${this[2][2]}"


    override fun equals(other: Any?): Boolean =
        when (other) {
            is Basis -> (this[0][0] == other[0][0] && this[0][1] == other[0][1] && this[0][2] == other[0][2] &&
                this[1][0] == other[1][0] && this[1][1] == other[1][1] && this[1][2] == other[1][2] &&
                this[2][0] == other[2][0] && this[2][1] == other[2][1] && this[2][2] == other[2][2])
            else -> throw IllegalArgumentException()
        }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        result = 31 * result + z.hashCode()
        return result
    }
}
