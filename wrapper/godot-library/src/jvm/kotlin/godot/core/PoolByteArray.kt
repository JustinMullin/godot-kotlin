@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*

actual class PoolByteArray : JniType {
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): PoolByteArray {
            return PoolByteArray().apply { rawMemory = pointer }
        }
    }

    actual constructor() {
         rawMemory = godot_pool_byte_array_new()
    }

    actual constructor(other: PoolByteArray) {
         rawMemory = godot_pool_byte_array_new_copy(other)
    }

    actual constructor(other: GDArray) {
         rawMemory = godot_pool_byte_array_new_with_array(other)
    }


    actual fun append(data: UByte) {
         godot_pool_byte_array_append(this, data.toByte())
    }

    actual fun appendArray(data: PoolByteArray) {
         godot_pool_byte_array_append_array(this, data) 
    }

    actual fun insert(idx: Int, data: UByte) {
         godot_pool_byte_array_insert(this, idx, data.toByte())
    }

    actual fun invert() {
         godot_pool_byte_array_invert(this) 
    }

    actual fun pushBack(data: UByte) {
         godot_pool_byte_array_push_back(this, data.toByte())
    }

    actual fun remove(idx: Int) {
         godot_pool_byte_array_remove(this, idx) 
    }

    actual fun resize(size: Int) {
         godot_pool_byte_array_resize(this, size) 
    }

    actual fun set(idx: Int, data: UByte) {
         godot_pool_byte_array_set(this, idx, data.toByte())
    }

    actual operator fun get(idx: Int): UByte = godot_pool_byte_array_get(this, idx).toUByte()

    actual fun size(): Int = godot_pool_byte_array_size(this)
}
