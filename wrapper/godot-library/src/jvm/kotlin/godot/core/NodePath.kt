@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*


actual class NodePath : JniType {
    companion object {
        @JvmStatic
        fun fromRawMemory(pointer: Long): NodePath {
            return NodePath().apply { rawMemory = pointer }
        }
    }

    actual constructor() {
        rawMemory = godot_node_path_new(String())
    }
    actual constructor(other: String){
        rawMemory = godot_node_path_new(other)
    }
    actual constructor(other: NodePath){
        rawMemory = godot_node_path_new(other.toString())
    }


    override fun toString(): String = godot_node_path_as_string(this)

    actual fun getName(idx: Int): String = godot_node_path_get_name(this, idx)

    actual fun getNameCount(): Int = godot_node_path_get_name_count(this)

    actual fun getSubname(idx: Int): String = godot_node_path_get_subname(this, idx)

    actual fun getSubnameCount(): Int = godot_node_path_get_subname_count(this)

    actual fun isAbsolute() : Boolean = godot_node_path_is_absolute(this)

    actual fun isEmpty(): Boolean = godot_node_path_is_empty(this)

    actual fun getAsPropertyPath() = NodePath(godot_node_path_get_as_property_path(this))

    actual fun getConcatenatedSubnames() = godot_node_path_get_concatenated_subnames(this)

    override fun equals(other: Any?): Boolean =
        if(other is NodePath) godot_node_path_operator_equal(this, other)
        else false

    override fun hashCode(): Int {
        return this.hashCode()
    }


}
