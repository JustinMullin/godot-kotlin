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
        fun fromRawMemory(pointer: Long): Variant {
            return Variant().apply { nativePointer = pointer }
        }
    }

    actual constructor() {
        nativePointer = api?.godot_variant_new_nil!!()
    }

    actual constructor(other: Variant) {
        nativePointer = api?.godot_variant_new_copy!!(other)
    }

    actual constructor(other: Boolean) {
        nativePointer = api?.godot_variant_new_bool!!(other)
    }

    actual constructor(other: Byte) {
        nativePointer = api?.godot_variant_new_int!!(other.toLong())
    }

    actual constructor(other: Long) {
        nativePointer = api?.godot_variant_new_int!!(other)
    }

    actual constructor(other: Int) {
        nativePointer = api?.godot_variant_new_int!!(other.toLong())
    }

    actual constructor(other: Short) {
        nativePointer = api?.godot_variant_new_int!!(other.toLong())
    }

    actual constructor(other: Double) {
        nativePointer = api?.godot_variant_new_real!!(other)
    }

    actual constructor(other: Float) {
        nativePointer = api?.godot_variant_new_real!!(other.toDouble())
    }

    actual constructor(other: String) {
        nativePointer = api?.godot_variant_new_string!!(other)
    }

    actual constructor(other: GDArray) {
        nativePointer = api?.godot_variant_new_array!!(other)
    }

    actual constructor(other: PoolByteArray) {
        nativePointer = api?.godot_variant_new_pool_byte_array!!(other)
    }

    actual constructor(other: PoolIntArray) {
        nativePointer = api?.godot_variant_new_pool_int_array!!(other)
    }

    actual constructor(other: PoolColorArray) {
        nativePointer = api?.godot_variant_new_pool_color_array!!(other)
    }

    actual constructor(other: PoolRealArray) {
        nativePointer = api?.godot_variant_new_pool_real_array!!(other)
    }

    actual constructor(other: PoolStringArray) {
        nativePointer = api?.godot_variant_new_pool_string_array!!(other)
    }

    actual constructor(other: PoolVector2Array) {
        nativePointer = api?.godot_variant_new_pool_vector2_array!!(other)
    }

    actual constructor(other: PoolVector3Array) {
        nativePointer = api?.godot_variant_new_pool_vector3_array!!(other)
    }

    actual constructor(other: RID) {
        nativePointer = api?.godot_variant_new_rid!!(other)
    }

    actual constructor(other: Dictionary) {
        nativePointer = api?.godot_variant_new_dictionary!!(other)
    }

    actual constructor(other: NodePath) {
        nativePointer = api?.godot_variant_new_node_path!!(other)
    }

    actual constructor(other: Basis) {
        nativePointer = api?.godot_variant_new_basis!!(other)
    }

    actual constructor(other: Color) {
        nativePointer = api?.godot_variant_new_color!!(other)
    }

    actual constructor(other: Vector2) {
        nativePointer = api?.godot_variant_new_vector2!!(other)
    }

    actual constructor(other: Vector3) {
        nativePointer = api?.godot_variant_new_vector3!!(other)
    }

    actual constructor(other: Quat) {
        nativePointer = api?.godot_variant_new_quat!!(other)
    }

    actual constructor(other: AABB) {
        nativePointer = api?.godot_variant_new_aabb!!(other)
    }

    actual constructor(other: Transform) {
        nativePointer = api?.godot_variant_new_transform!!(other)
    }

    actual constructor(other: Transform2D) {
        nativePointer = api?.godot_variant_new_transform2d!!(other)
    }

    actual constructor(other: Rect2) {
        nativePointer = api?.godot_variant_new_rect2!!(other)
    }

    actual constructor(other: Plane) {
        nativePointer = api?.godot_variant_new_plane!!(other)
    }

    actual constructor(other: Object?) {
        nativePointer = api?.godot_variant_new_object!!(other)
    }

    actual fun dispose() {
        api?.godot_variant_destroy!!(this)
    }

    actual fun booleanize(): Boolean = api?.godot_variant_booleanize!!(this)

    actual fun toBoolean(): Boolean = api?.godot_variant_as_bool!!(this)

    actual fun toInt(): Int = this.toLong().toInt()

    actual fun toObject(): Object = throw Exception("toObject not supported currently")//Object("").apply { setRawMemory(godot_variant_as_object(this) ?: throw NullPointerException("godot_variant_as_object return null for ${this@Variant}")) }

    actual fun toLong(): Long = api?.godot_variant_as_int!!(this)

    actual fun toFloat(): Float = this.toDouble().toFloat()

    actual fun toDouble(): Double = api?.godot_variant_as_real!!(this)

    actual fun toDictionary(): Dictionary = Dictionary(api?.godot_variant_as_dictionary!!(this))

    actual fun toGDArray(): GDArray = GDArray(api?.godot_variant_as_array!!(this))

    actual fun toNodePath(): NodePath = NodePath(api?.godot_variant_as_node_path!!(this))

    actual fun toPoolByteArray(): PoolByteArray = PoolByteArray(api?.godot_variant_as_pool_byte_array!!(this))

    actual fun toPoolIntArray(): PoolIntArray = PoolIntArray(api?.godot_variant_as_pool_int_array!!(this))

    actual fun toPoolColorArray(): PoolColorArray = PoolColorArray(api?.godot_variant_as_pool_color_array!!(this))

    actual fun toPoolRealArray(): PoolRealArray = PoolRealArray(api?.godot_variant_as_pool_real_array!!(this))

    actual fun toPoolStringArray(): PoolStringArray = PoolStringArray(api?.godot_variant_as_pool_string_array!!(this))

    actual fun toPoolVector2Array(): PoolVector2Array = PoolVector2Array(api?.godot_variant_as_pool_vector2_array!!(this))

    actual fun toPoolVector3Array(): PoolVector3Array = PoolVector3Array(api?.godot_variant_as_pool_vector3_array!!(this))

    actual fun toBasis(): Basis = api?.godot_variant_as_basis!!(this)

    actual fun toRID(): RID = api?.godot_variant_as_rid!!(this)

    actual fun toQuat(): Quat = api?.godot_variant_as_quat!!(this)

    actual fun toVector2(): Vector2 = api?.godot_variant_as_vector2!!(this)

    actual fun toVector3(): Vector3 = api?.godot_variant_as_vector3!!(this)

    actual fun toAABB(): AABB = api?.godot_variant_as_aabb!!(this)

    actual fun toPlane(): Plane = api?.godot_variant_as_plane!!(this)

    actual fun toRect2(): Rect2 = api?.godot_variant_as_rect2!!(this)

    actual fun toTransform(): Transform = api?.godot_variant_as_transform!!(this)

    actual fun toTransform2D(): Transform2D = api?.godot_variant_as_transform2d!!(this)

    actual fun getType(): Variant.Type = Variant.Type.fromInt(api?.godot_variant_get_type!!(this).toLong())

    actual fun call(str: String, args: Array<Variant>): Variant {
        return api?.godot_variant_call!!(this, str, args, args.size)
    }

    actual fun hashCompare(other: Variant): Boolean = api?.godot_variant_hash_compare!!(this, other)

    actual fun hasMethod(method: String): Boolean = api?.godot_variant_has_method!!(this, method)

    override fun equals(other: Any?): Boolean =
        if(other is Variant) api?.godot_variant_operator_equal!!(this.nativePointer, other.nativePointer)
        else false

    override fun toString(): String = api?.godot_variant_as_string!!(this)

    operator fun compareTo(other: Variant) =
        when {
            this == other -> 0
            api?.godot_variant_operator_less!!(this.nativePointer, other.nativePointer) -> -1
            else -> 1
        }

    override fun hashCode(): Int {
        return this.hashCode()
    }
}
