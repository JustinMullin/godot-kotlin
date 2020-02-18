@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import godot.Object

actual class RID : JniType {
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): RID {
            return RID().apply { rawMemory = pointer }
        }
    }

    actual constructor() {
         rawMemory = godot_rid_new()
    }

    actual constructor(other: Object) {
        rawMemory = godot_rid_new_with_resource(other)
    }


    actual fun getID(): Int = godot_rid_get_id(this)

    override fun equals(other: Any?): Boolean =
        if(other is RID) godot_rid_operator_equal(this, other)
        else false

    operator fun compareTo(other: RID) =
            when {
                this == other -> 0
                godot_rid_operator_less(this, other) -> -1
                else -> 1
            }

    override fun hashCode(): Int {
        return this.hashCode()
    }

}
