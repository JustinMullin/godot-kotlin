@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*


actual class Dictionary: JniType {
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): Dictionary {
            return Dictionary().apply { rawMemory = pointer }
        }
    }

    actual constructor() {
        rawMemory = godot_dictionary_new()
    }
    actual constructor(other: Dictionary) {
        rawMemory = godot_dictionary_new_copy(other)
    }


    actual fun clear(){
//        this = this.copy { godot_dictionary_clear(this) }
    }

    actual fun isEmpty(): Boolean = godot_dictionary_empty(this)

    override fun hashCode(): Int = godot_dictionary_hash(this)

    actual fun size(): Int = godot_dictionary_size(this)

    actual fun toJson(): String = godot_dictionary_to_json(this)

    actual fun hasAll(keys: GDArray): Boolean = godot_dictionary_has_all(this, keys)

    actual fun keys(): GDArray = GDArray(godot_dictionary_keys(this))

    actual fun values(): GDArray = GDArray(godot_dictionary_values(this))

    actual fun erase(key: Variant) { godot_dictionary_erase(this, key) }

    actual fun has(key: Variant): Boolean = godot_dictionary_has(this, key)

    actual fun get(key: Variant): Variant? = godot_dictionary_operator_index(this, key)


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other !is Dictionary)
            return false
        return this.hashCode() == other.hashCode()
    }
}
