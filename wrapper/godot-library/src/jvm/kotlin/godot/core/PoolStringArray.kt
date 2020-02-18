@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*


actual class PoolStringArray : JniType {
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): PoolStringArray {
            return PoolStringArray().apply { rawMemory = pointer }
        }
    }

    actual constructor() {
         rawMemory = godot_pool_string_array_new()
    }

    actual constructor(other: PoolStringArray) {
         rawMemory = godot_pool_string_array_new_copy(other)
    }

    actual constructor(other: GDArray) {
         rawMemory = godot_pool_string_array_new_with_array(other)
    }


    actual fun append(data: String) {
         godot_pool_string_array_append(this, data)
    }

    actual fun appendArray(data: GDArray) {
         rawMemory = godot_pool_string_array_new_with_array(data)
    }

    actual fun insert(idx: Int, data: String) {
         godot_pool_string_array_insert(this, idx, data)
    }

    actual fun invert() {
         godot_pool_string_array_invert(this) 
    }

    actual fun pushBack(data: String) {
         godot_pool_string_array_push_back(this, data)
    }

    actual fun remove(idx: Int) {
         godot_pool_string_array_remove(this, idx) 
    }

    actual fun resize(size: Int) {
         godot_pool_string_array_resize(this, size) 
    }

    actual fun set(idx: Int, data: String) {
         godot_pool_string_array_set(this, idx, data)
    }

    actual operator fun get(idx: Int): String = godot_pool_string_array_get(this, idx)

    actual fun size(): Int = godot_pool_string_array_size(this)
}
