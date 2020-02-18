@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*

actual class PoolVector2Array : JniType {
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): PoolVector2Array {
            return PoolVector2Array().apply { rawMemory = pointer }
        }
    }

    actual constructor() {
         rawMemory = godot_pool_vector2_array_new()
    }

    actual constructor(other: PoolVector2Array) {
         rawMemory = godot_pool_vector2_array_new_copy(other)
    }

    actual constructor(other: GDArray) {
         rawMemory = godot_pool_vector2_array_new_with_array(other)
    }


    actual fun append(data: Vector2) {
             godot_pool_vector2_array_append(this, data)
    }

    actual fun appendArray(data: PoolVector2Array) {
         godot_pool_vector2_array_append_array(this, data) 
    }

    actual fun insert(idx: Int, data: Vector2) {
             godot_pool_vector2_array_insert(this, idx, data)
    }

    actual fun invert() {
         godot_pool_vector2_array_invert(this) 
    }

    actual fun pushBack(data: Vector2) {
             godot_pool_vector2_array_push_back(this, data)
    }

    actual fun remove(idx: Int) {
         godot_pool_vector2_array_remove(this, idx) 
    }

    actual fun resize(size: Int) {
         godot_pool_vector2_array_resize(this, size) 
    }

    actual fun set(idx: Int, data: Vector2) {
             godot_pool_vector2_array_set(this, idx, data)
    }

    actual operator fun get(idx: Int): Vector2 = godot_pool_vector2_array_get(this, idx)

    actual fun size(): Int = godot_pool_vector2_array_size(this)
}
