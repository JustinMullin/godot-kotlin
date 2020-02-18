@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.Object
import godot.gdnative.*


actual class GDArray: JniType { // FIXME: .copy
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): GDArray {
            return GDArray().apply { rawMemory = pointer }
        }
    }

    actual constructor(size: Int, init: (Int) -> Variant) {
        rawMemory = godot_array_new()

        for (i in 0 until size)
            append(init(i))
    }

    actual constructor(other: GDArray) {
        rawMemory = godot_array_new_copy(other)
    }

    actual constructor(other: Array<*>) : this() {
        for (arg in other)
            append(Variant from arg)
    }

    actual constructor(other: PoolByteArray) {
         rawMemory = godot_array_new_pool_byte_array(other) }

    actual constructor(other: PoolIntArray) {
         rawMemory = godot_array_new_pool_int_array(other) }

    actual constructor(other: PoolRealArray) {
         rawMemory = godot_array_new_pool_real_array(other) }

    actual constructor(other: PoolColorArray) {
         rawMemory = godot_array_new_pool_color_array(other) }

    actual constructor(other: PoolVector2Array) {
         rawMemory = godot_array_new_pool_vector2_array(other) }

    actual constructor(other: PoolVector3Array) {
         rawMemory = godot_array_new_pool_vector3_array(other) }

    actual constructor(other: PoolStringArray) {
         rawMemory = godot_array_new_pool_string_array(other) }



    actual fun toKotlinArray(): Array<Variant> {
        return Array(this.size()) { i -> this[i]!! }
    }



    actual operator fun iterator(): Iterator<Variant> = object: Iterator<Variant> {
        var idx: Int = 0
        val size = this@GDArray.size()

        override fun next(): Variant = this@GDArray[idx++]!!
        override fun hasNext(): Boolean = idx < size
    }

    actual fun withIndex(): Iterator<Pair<Int,Variant>> = object: Iterator<Pair<Int,Variant>> {
        var idx: Int = 0
        val size = this@GDArray.size()

        override fun next(): Pair<Int,Variant> = idx to this@GDArray[idx++]!!
        override fun hasNext(): Boolean = idx < size
    }

    actual val indices: Iterator<Int>
        get() = object: Iterator<Int> {
            var idx: Int = 0
            var size: Int = this@GDArray.size()

            override fun next(): Int = idx++
            override fun hasNext(): Boolean = idx < size
        }



    actual fun clear() {
         godot_array_clear(this) }

    actual fun isEmpty(): Boolean = godot_array_empty(this)

    actual override fun hashCode() : Int = godot_array_hash(this)

    actual fun invert() = godot_array_invert(this)

    actual fun remove(idx: Int) {
         godot_array_remove(this, idx) }

    actual fun size() = godot_array_size(this)

    actual fun resize(size: Int){
         godot_array_resize(this, size) }

    actual fun sort() {
         godot_array_sort(this) }

    actual operator fun get(idx: Int): Variant? = godot_array_operator_index(this, idx)

    actual fun append(v: Variant) {
         godot_array_append(this, v) }

    actual fun count(v: Variant): Int = godot_array_count(this, v)

    actual fun erase(v: Variant) {
         godot_array_erase(this, v) }

    actual fun front(): Variant = Variant(godot_array_front(this))

    actual fun back(): Variant = Variant(godot_array_back(this))

    actual fun find(v: Variant, from: Int): Int = godot_array_find(this, v, from)

    actual fun findLast(v: Variant) = godot_array_find_last(this, v)

    actual fun has(v: Variant) = godot_array_has(this, v)

    actual fun insert(pos: Int, v : Variant) {
         godot_array_insert(this, pos, v) }

    actual fun popBack(): Variant = Variant(godot_array_pop_back(this))

    actual fun pushBack(v : Variant) {
         godot_array_push_back(this, v) }

    actual fun popFront(): Variant = Variant(godot_array_pop_front(this))

    actual fun pushFront(v : Variant) {
         godot_array_push_front(this, v) }

    actual fun rfind(v: Variant, from: Int): Int = godot_array_rfind(this, v, from)

    actual fun sortCustom(obj: Object, func: String) {
        godot_array_sort_custom(this, obj, func)
    }

    actual fun bsearch(value: Variant, before: Boolean): Int = godot_array_bsearch(this, value, before)

    actual fun bsearchCustom(value: Variant, obj: Object, func: String, before: Boolean): Int {
        return godot_array_bsearch_custom(this, value, obj, func, before)
    }

    actual fun duplicate(deep: Boolean): GDArray = GDArray(godot_array_duplicate(this, deep))

    actual fun max() = Variant(godot_array_max(this))

    actual fun min() = Variant(godot_array_min(this))

    actual fun shuffle() {
        godot_array_shuffle(this)
    }


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other !is GDArray)
            return false
        return this.hashCode() == other.hashCode()
    }
}

