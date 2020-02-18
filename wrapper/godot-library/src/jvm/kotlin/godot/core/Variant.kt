@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import godot.Object


actual class Variant: JniType {
    actual enum class Type(val id: Long) {
        NIL(0),

        BOOL(1),
        INT(2),
        REAL(3),
        STRING(4),

        VECTOR2(5), // 5
        RECT2(6),
        VECTOR3(7),
        TRANSFORM2D(8),
        PLANE(9),
        QUAT(10), // 10
        RECT3(11),
        BASIS(12),
        TRANSFORM(13),

        COLOR(14),
        NODE_PATH(15), // 15
        _RID(16),
        OBJECT(17),
        DICTIONARY(18),
        ARRAY(19),

        POOL_BYTE_ARRAY(20), // 20
        POOL_INT_ARRAY(21),
        POOL_REAL_ARRAY(22),
        POOL_STRING_ARRAY(23),
        POOL_VECTOR2_ARRAY(24),
        POOL_VECTOR3_ARRAY(25), // 25
        POOL_COLOR_ARRAY(26),

        VARIANT_MAX(27);

        actual companion object {
            actual fun fromInt(value: Long) = values().single { it.id == value }
        }
    }

    actual enum class Operator(val id: Long) {
        OP_EQUAL(0),
        OP_NOT_EQUAL(1),
        OP_LESS(2),
        OP_LESS_EQUAL(3),
        OP_GREATER(4),
        OP_GREATER_EQUAL(5),

        OP_ADD(6),
        OP_SUBSTRACT(7),
        OP_MULTIPLY(8),
        OP_DIVIDE(9),
        OP_NEGATE(10),
        OP_POSITIVE(11),
        OP_MODULE(12),
        OP_STRING_CONCAT(13),

        OP_SHIFT_LEFT(14),
        OP_SHIFT_RIGHT(15),
        OP_BIT_AND(16),
        OP_BIT_OR(17),
        OP_BIT_XOR(18),
        OP_BIT_NEGATE(19),

        OP_AND(20),
        OP_OR(21),
        OP_XOR(22),
        OP_NOT(23),

        OP_IN(24),
        OP_MAX(25);

        actual companion object {
            actual fun fromInt(value: Long) = values().single { it.id == value }
        }

    }

    actual companion object {
        internal val noInit = NoInit()

        @JvmStatic
        fun fromRawMemory(pointer: Long): Variant {
            return Variant(noInit).apply { rawMemory = pointer }
        }

        infix fun from(value: Any?): Variant = when (value) {
            null -> Variant()
            is Variant -> Variant(value)
            is Boolean -> Variant(value)
            is Byte -> Variant(value)
            is Long -> Variant(value)
            is Int -> Variant(value)
            is Short -> Variant(value)
            is Float -> Variant(value)
            is Double -> Variant(value)
            is String -> Variant(value)
            is GDArray -> Variant(value)
            is PoolByteArray -> Variant(value)
            is PoolIntArray -> Variant(value)
            is PoolColorArray -> Variant(value)
            is PoolRealArray -> Variant(value)
            is PoolStringArray -> Variant(value)
            is PoolVector2Array -> Variant(value)
            is PoolVector3Array -> Variant(value)
            is RID -> Variant(value)
            is Dictionary -> Variant(value)
            is NodePath -> Variant(value)
            is Basis -> Variant(value)
            is Color -> Variant(value)
            is Vector2 -> Variant(value)
            is Vector3 -> Variant(value)
            is Quat -> Variant(value)
            is AABB -> Variant(value)
            is Transform -> Variant(value)
            is Transform2D -> Variant(value)
            is Rect2 -> Variant(value)
            is Plane -> Variant(value)
            is Object -> Variant(value)
            else -> throw TypeCastException("Cannot create Variant from $value")
        }
    }

    actual constructor() {
        rawMemory = godot_variant_new_nil()
    }

    actual constructor(other: Variant) {
        GD.print("Invoking Variant copy constructor! Other variant is ${other.rawMemory}")
        rawMemory = godot_variant_new_copy(other)
    }

    actual constructor(other: Boolean) {
        rawMemory = godot_variant_new_bool(other)
    }

    actual constructor(other: Byte) {
        rawMemory = godot_variant_new_int(other.toLong())
    }

    actual constructor(other: Long) {
        rawMemory = godot_variant_new_int(other)
    }

    actual constructor(other: Int) {
        rawMemory = godot_variant_new_int(other.toLong())
    }

    actual constructor(other: Short) {
        rawMemory = godot_variant_new_int(other.toLong())
    }

    actual constructor(other: Double) {
        rawMemory = godot_variant_new_real(other)
    }

    actual constructor(other: Float) {
        rawMemory = godot_variant_new_real(other.toDouble())
    }

    actual constructor(other: String) {
        rawMemory = godot_variant_new_string(other)
    }

    actual constructor(other: GDArray) {
        rawMemory = godot_variant_new_array(other)
    }

    actual constructor(other: PoolByteArray) {
        rawMemory = godot_variant_new_pool_byte_array(other)
    }

    actual constructor(other: PoolIntArray) {
        rawMemory = godot_variant_new_pool_int_array(other)
    }

    actual constructor(other: PoolColorArray) {
        rawMemory = godot_variant_new_pool_color_array(other)
    }

    actual constructor(other: PoolRealArray) {
        rawMemory = godot_variant_new_pool_real_array(other)
    }

    actual constructor(other: PoolStringArray) {
        rawMemory = godot_variant_new_pool_string_array(other)
    }

    actual constructor(other: PoolVector2Array) {
        rawMemory = godot_variant_new_pool_vector2_array(other)
    }

    actual constructor(other: PoolVector3Array) {
        rawMemory = godot_variant_new_pool_vector3_array(other)
    }

    actual constructor(other: RID) {
        rawMemory = godot_variant_new_rid(other)
    }

    actual constructor(other: Dictionary) {
        rawMemory = godot_variant_new_dictionary(other)
    }

    actual constructor(other: NodePath) {
        rawMemory = godot_variant_new_node_path(other)
    }

    actual constructor(other: Basis) {
        rawMemory = godot_variant_new_basis(other)
    }

    actual constructor(other: Color) {
        rawMemory = godot_variant_new_color(other)
    }

    actual constructor(other: Vector2) {
        rawMemory = godot_variant_new_vector2(other)
    }

    actual constructor(other: Vector3) {
        rawMemory = godot_variant_new_vector3(other)
    }

    actual constructor(other: Quat) {
        rawMemory = godot_variant_new_quat(other)
    }

    actual constructor(other: AABB) {
        rawMemory = godot_variant_new_aabb(other)
    }

    actual constructor(other: Transform) {
        rawMemory = godot_variant_new_transform(other)
    }

    actual constructor(other: Transform2D) {
        rawMemory = godot_variant_new_transform2d(other)
    }

    actual constructor(other: Rect2) {
        rawMemory = godot_variant_new_rect2(other)
    }

    actual constructor(other: Plane) {
        rawMemory = godot_variant_new_plane(other)
    }

    actual constructor(other: Object?) {
        rawMemory = godot_variant_new_object(other)
    }

    internal class NoInit {}
    internal constructor(n: NoInit) // TODO: this is a weird hack to get around the shadowing of the no-arg constructor

    actual fun dispose() {
        godot_variant_destroy(this)
    }

    actual fun booleanize(): Boolean = godot_variant_booleanize(this)

    actual fun toBoolean(): Boolean = godot_variant_as_bool(this)

    actual fun toInt(): Int = this.toLong().toInt()

    actual fun toObject(): Object = throw Exception("toObject not supported currently")
    //Object("").apply { setRawMemory(godot_variant_as_object(this) ?: throw NullPointerException("godot_variant_as_object return null for ${this@Variant}")) }

    actual fun toLong(): Long = godot_variant_as_int(this)

    actual fun toFloat(): Float = this.toDouble().toFloat()

    actual fun toDouble(): Double = godot_variant_as_real(this)

    actual fun toDictionary(): Dictionary = Dictionary(godot_variant_as_dictionary(this))

    actual fun toGDArray(): GDArray = GDArray(godot_variant_as_array(this))

    actual fun toNodePath(): NodePath = NodePath(godot_variant_as_node_path(this))

    actual fun toPoolByteArray(): PoolByteArray = PoolByteArray(godot_variant_as_pool_byte_array(this))

    actual fun toPoolIntArray(): PoolIntArray = PoolIntArray(godot_variant_as_pool_int_array(this))

    actual fun toPoolColorArray(): PoolColorArray = PoolColorArray(godot_variant_as_pool_color_array(this))

    actual fun toPoolRealArray(): PoolRealArray = PoolRealArray(godot_variant_as_pool_real_array(this))

    actual fun toPoolStringArray(): PoolStringArray = PoolStringArray(godot_variant_as_pool_string_array(this))

    actual fun toPoolVector2Array(): PoolVector2Array = PoolVector2Array(godot_variant_as_pool_vector2_array(this))

    actual fun toPoolVector3Array(): PoolVector3Array = PoolVector3Array(godot_variant_as_pool_vector3_array(this))

    actual fun toBasis(): Basis = godot_variant_as_basis(this)

    actual fun toRID(): RID = godot_variant_as_rid(this)

    actual fun toQuat(): Quat = godot_variant_as_quat(this)

    actual fun toVector2(): Vector2 = godot_variant_as_vector2(this)

    actual fun toVector3(): Vector3 = godot_variant_as_vector3(this)

    actual fun toAABB(): AABB = godot_variant_as_aabb(this)

    actual fun toPlane(): Plane = godot_variant_as_plane(this)

    actual fun toRect2(): Rect2 = godot_variant_as_rect2(this)

    actual fun toTransform(): Transform = godot_variant_as_transform(this)

    actual fun toTransform2D(): Transform2D = godot_variant_as_transform2d(this)

    actual fun getType() = Type.fromInt(godot_variant_get_type(this).toLong())

    actual fun call(str: String, args: Array<Variant>): Variant {
        return godot_variant_call(this, str, args, args.size)
    }

    actual fun hashCompare(other: Variant): Boolean = godot_variant_hash_compare(this, other)

    actual fun hasMethod(method: String): Boolean = godot_variant_has_method(this, method)

    override fun equals(other: Any?): Boolean =
        if(other is Variant) godot_variant_operator_equal(this.rawMemory, other.rawMemory)
        else false

    override fun toString(): String = godot_variant_as_string(this)

    operator fun compareTo(other: Variant) =
        when {
            this == other -> 0
            godot_variant_operator_less(this.rawMemory, other.rawMemory) -> -1
            else -> 1
        }

    override fun hashCode(): Int {
        return this.hashCode()
    }
}
