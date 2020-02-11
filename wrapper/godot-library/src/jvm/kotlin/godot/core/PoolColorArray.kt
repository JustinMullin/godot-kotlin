@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*

actual class PoolColorArray : JniType {
    companion object {
        fun fromRawMemory(pointer: Long): PoolColorArray {
            return PoolColorArray().apply { nativePointer = pointer }
        }
    }

    actual constructor() {
         nativePointer = godot_pool_color_array_new()
    }

    actual constructor(other: PoolColorArray) {
         nativePointer = godot_pool_color_array_new_copy(other)
    }

    actual constructor(other: GDArray) {
         nativePointer = godot_pool_color_array_new_with_array(other)
    }


    actual fun append(data: Color) {
        godot_pool_color_array_append(this, data)
    }

    actual fun appendArray(data: PoolColorArray) {
         godot_pool_color_array_append_array(this, data) 
    }

    actual fun insert(idx: Int, data: Color) {
        godot_pool_color_array_insert(this, idx, data)
    }

    actual fun invert() {
         godot_pool_color_array_invert(this) 
    }

    actual fun pushBack(data: Color) {
        godot_pool_color_array_push_back(this, data)
    }

    actual fun remove(idx: Int) {
         godot_pool_color_array_remove(this, idx) 
    }

    actual fun resize(size: Int) {
         godot_pool_color_array_resize(this, size) 
    }

    actual fun set(idx: Int, data: Color) {
        godot_pool_color_array_set(this, idx, data)
    }

    actual operator fun get(idx: Int): Color = godot_pool_color_array_get(this, idx)

    actual fun size(): Int = godot_pool_color_array_size(this)
}
