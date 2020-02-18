@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

actual class Transform: JniType {
    actual var basis: Basis
    actual var origin: Vector3

    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): Transform {
            return Transform().apply { rawMemory = pointer }
        }
    }

    actual constructor():
            this(Basis())

    actual constructor(basis: Basis, origin: Vector3) {
        this.basis = basis
        this.origin = origin
    }

    actual constructor(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number, tx: Number, ty: Number, tz: Number):
            this(Basis(Vector3(xx,xy,xz), Vector3(yx,yy,yz), Vector3(zx,zy,zz)), Vector3(tx,ty,tz))

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Transform -> basis == other.basis && origin == other.origin
            else -> false
        }
    }

    override fun toString(): String {
        return "$basis - $origin"
    }

    override fun hashCode(): Int {
        var result = basis.hashCode()
        result = 31 * result + origin.hashCode()
        return result
    }
}
