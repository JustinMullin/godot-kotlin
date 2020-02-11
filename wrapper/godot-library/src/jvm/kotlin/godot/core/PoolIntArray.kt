@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*

actual class PoolIntArray : JniType {
    companion object {
        fun fromRawMemory(pointer: Long): PoolIntArray {
            return PoolIntArray().apply { nativePointer = pointer }
        }
    }

    actual constructor() {
         nativePointer = godot_pool_int_array_new()
    }

    actual constructor(other: PoolIntArray) {
         nativePointer = godot_pool_int_array_new_copy(other)
    }

    actual constructor(other: GDArray) {
         nativePointer = godot_pool_int_array_new_with_array(other)
    }



    actual fun append(data: Int) {
         godot_pool_int_array_append(this, data) 
    }

    actual fun appendArray(data: PoolIntArray) {
         godot_pool_int_array_append_array(this, data) 
    }

    actual fun insert(idx: Int, data: Int) {
         godot_pool_int_array_insert(this, idx, data) 
    }

    actual fun invert() {
         godot_pool_int_array_invert(this) 
    }

    actual fun pushBack(data: Int) {
         godot_pool_int_array_push_back(this, data) 
    }

    actual fun remove(idx: Int) {
         godot_pool_int_array_remove(this, idx) 
    }

    actual fun resize(size: Int) {
         godot_pool_int_array_resize(this, size) 
    }

    actual fun set(idx: Int, data: Int) {
         godot_pool_int_array_set(this, idx, data) 
    }

    actual operator fun get(idx: Int): Int = godot_pool_int_array_get(this, idx)

    actual fun size(): Int = godot_pool_int_array_size(this)
}
