@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

actual class Color : Comparable<Color>, JniType {
    actual var r: Double = 0.0
    actual var g: Double = 0.0
    actual var b: Double = 0.0
    actual var a: Double = 0.0

    actual companion object {
        fun fromRawMemory(pointer: Long): Color {
            return Color().apply { nativePointer = pointer }
        }
    }

    actual constructor() :
            this(0.0, 0.0, 0.0, 1.0)

    actual constructor(r: Number, g: Number, b: Number, a: Number) :
            this(r.toDouble(), g.toDouble(), b.toDouble(), a.toDouble())

    actual constructor(r: Double, g: Double, b: Double, a: Double)


    override fun equals(other: Any?): Boolean =
            when (other) {
                is Color -> (r == other.r && g == other.g && b == other.b && a == other.a)
                else -> false
            }

    override fun compareTo(other: Color): Int {
        return when {
            r == other.r -> when {
                g == other.g -> when {
                    b == other.b -> when {
                        a < other.a -> -1
                        a == other.a -> 0
                        else -> 1
                    }
                    b < other.b -> -1
                    else -> 1
                }
                g < other.g -> -1
                else -> 1
            }
            r < other.r -> -1
            else -> 1
        }
    }

    override fun toString() = "$r, $g, $b, $a"

    override fun hashCode(): Int {
        var result = r.hashCode()
        result = 31 * result + g.hashCode()
        result = 31 * result + b.hashCode()
        result = 31 * result + a.hashCode()
        return result
    }
}
