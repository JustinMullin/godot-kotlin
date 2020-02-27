package godot.gdnative

import godot.core.AABB
import godot.core.Vector2

external fun place_string(value: String): Long
external fun place_long(value: Long): Long
external fun place_boolean(value: Boolean): Long
external fun place_double(value: Double): Long

external fun place_vector2(pX: Double, pY: Double): Long
external fun place_vector3(pX: Double, pY: Double, pZ: Double): Long

external fun pull_vector2(pointer: Long): Vector2
external fun pull_vector3(pointer: Long): Vector2
