package godot.gdnative

import godot.core.*
import godot.core.Vector2

interface godot_arvr_interface_gdnative {
    var commit_for_eye: ((Any?, Int, RID?, Rect2?) -> Unit)

    var constructor: ((Any?) -> Any?)

    var destructor: ((Any?) -> Unit)

    var fill_projection_for_eye: ((Any?, Double?, Int, Double, Double, Double) -> Unit)

    var get_anchor_detection_is_enabled: ((Any?) -> Boolean)

    var get_camera_feed_id: ((Any?) -> Int)

    var get_capabilities: ((Any?) -> Int)

    var get_external_texture_for_eye: ((Any?, Int) -> Int)

    var get_name: ((Any?) -> String)

    var get_render_targetsize: ((Any?) -> Vector2)

    var get_transform_for_eye: ((Any?, Int, Transform?) -> Transform)

    var initialize: ((Any?) -> Boolean)

    var is_initialized: ((Any?) -> Boolean)

    var is_stereo: ((Any?) -> Boolean)

    var notification: ((Any?, Int) -> Unit)

    var process: ((Any?) -> Unit)

    var set_anchor_detection_is_enabled: ((Any?, Boolean) -> Unit)

    var uninitialize: ((Any?) -> Unit)

    val version: godot_gdnative_api_version
}

interface godot_gdnative_api_struct {
    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_api_version {
    var major: Int

    var minor: Int
}

interface godot_gdnative_core_1_1_api_struct {
    var godot_array_duplicate: ((GDArray?, Boolean) -> GDArray)

    var godot_array_max: ((GDArray?) -> Variant)

    var godot_array_min: ((GDArray?) -> Variant)

    var godot_array_shuffle: ((GDArray?) -> Unit)

    var godot_basis_get_quat: ((Basis?) -> Quat)

    var godot_basis_set_axis_angle_scale: ((Basis?, Vector3?, Double, Vector3?) -> Unit)

    var godot_basis_set_euler_scale: ((Basis?, Vector3?, Vector3?) -> Unit)

    var godot_basis_set_quat: ((Basis?, Quat?) -> Unit)

    var godot_basis_set_quat_scale: ((Basis?, Quat?, Vector3?) -> Unit)

    var godot_basis_slerp: ((Basis?, Basis?, Double) -> Basis)

    var godot_color_darkened: ((Color?, Double) -> Color)

    var godot_color_from_hsv: ((Color?, Double, Double, Double, Double) -> Color)

    var godot_color_lightened: ((Color?, Double) -> Color)

    var godot_color_to_abgr32: ((Color?) -> Int)

    var godot_color_to_abgr64: ((Color?) -> Int)

    var godot_color_to_argb64: ((Color?) -> Int)

    var godot_color_to_rgba64: ((Color?) -> Int)

    var godot_dictionary_erase_with_return: ((Dictionary?, Variant?) -> Boolean)

    var godot_dictionary_get_with_default: ((Dictionary?, Variant?, Variant?) -> Variant)

    var godot_is_instance_valid: ((Any?) -> Boolean)

    var godot_node_path_get_as_property_path: ((NodePath?) -> NodePath)

    var godot_quat_new_with_basis: ((Basis?) -> Long)

    var godot_quat_new_with_euler: ((Vector3?) -> Long)

    var godot_quat_set_axis_angle: ((Quat?, Vector3?, Double) -> Unit)

    var godot_rect2_abs: ((Rect2?) -> Rect2)

    var godot_rect2_grow_individual: ((Rect2?, Double, Double, Double, Double) -> Rect2)

    var godot_rect2_grow_margin: ((Rect2?, Int, Double) -> Rect2)

    var godot_string_dedent: ((String?) -> String)

    var godot_string_rsplit: ((String?, String?, Boolean, Int) -> PoolStringArray)

    var godot_string_rstrip: ((String?, String?) -> String)

    var godot_string_trim_prefix: ((String?, String?) -> String)

    var godot_string_trim_suffix: ((String?, String?) -> String)

    var godot_transform_new_with_quat: ((Quat?) -> Long)

    var godot_variant_evaluate: ((godot_variant_operator, Variant?, Variant?, Variant?, Boolean?) -> Unit)

    var godot_variant_get_operator_name: ((godot_variant_operator) -> String)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_core_1_2_api_struct {
    var godot_dictionary_duplicate: ((Dictionary?, Boolean) -> Dictionary)

    var godot_vector2_move_toward: ((Vector2?, Vector2?, Double) -> Vector2)

    var godot_vector3_move_toward: ((Vector3?, Vector3?, Double) -> Vector3)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_core_api_struct {
    var extensions: godot_gdnative_api_struct?

    var godot_aabb_as_string: ((AABB?) -> String)

    var godot_aabb_encloses: ((AABB?, AABB?) -> Boolean)

    var godot_aabb_expand: ((AABB?, Vector3?) -> AABB)

    var godot_aabb_get_area: ((AABB?) -> Double)

    var godot_aabb_get_endpoint: ((AABB?, Int) -> Vector3)

    var godot_aabb_get_longest_axis: ((AABB?) -> Vector3)

    var godot_aabb_get_longest_axis_index: ((AABB?) -> Int)

    var godot_aabb_get_longest_axis_size: ((AABB?) -> Double)

    var godot_aabb_get_position: ((AABB?) -> Vector3)

    var godot_aabb_get_shortest_axis: ((AABB?) -> Vector3)

    var godot_aabb_get_shortest_axis_index: ((AABB?) -> Int)

    var godot_aabb_get_shortest_axis_size: ((AABB?) -> Double)

    var godot_aabb_get_size: ((AABB?) -> Vector3)

    var godot_aabb_get_support: ((AABB?, Vector3?) -> Vector3)

    var godot_aabb_grow: ((AABB?, Double) -> AABB)

    var godot_aabb_has_no_area: ((AABB?) -> Boolean)

    var godot_aabb_has_no_surface: ((AABB?) -> Boolean)

    var godot_aabb_has_point: ((AABB?, Vector3?) -> Boolean)

    var godot_aabb_intersection: ((AABB?, AABB?) -> AABB)

    var godot_aabb_intersects: ((AABB?, AABB?) -> Boolean)

    var godot_aabb_intersects_plane: ((AABB?, Plane?) -> Boolean)

    var godot_aabb_intersects_segment: ((AABB?, Vector3?, Vector3?) -> Boolean)

    var godot_aabb_merge: ((AABB?, AABB?) -> AABB)

    var godot_aabb_new: ((Vector3?, Vector3?) -> Long)

    var godot_aabb_operator_equal: ((AABB?, AABB?) -> Boolean)

    var godot_aabb_set_position: ((AABB?, Vector3?) -> Unit)

    var godot_aabb_set_size: ((AABB?, Vector3?) -> Unit)

    var godot_alloc: ((Int) -> Any?)

    var godot_array_append: ((GDArray?, Variant?) -> Unit)

    var godot_array_back: ((GDArray?) -> Variant)

    var godot_array_bsearch: ((GDArray?, Variant?, Boolean) -> Int)

    var godot_array_bsearch_custom: ((GDArray?, Variant?, Any?, String?, Boolean) -> Int)

    var godot_array_clear: ((GDArray?) -> Unit)

    var godot_array_count: ((GDArray?, Variant?) -> Int)

    var godot_array_destroy: ((GDArray?) -> Unit)

    var godot_array_empty: ((GDArray?) -> Boolean)

    var godot_array_erase: ((GDArray?, Variant?) -> Unit)

    var godot_array_find: ((GDArray?, Variant?, Int) -> Int)

    var godot_array_find_last: ((GDArray?, Variant?) -> Int)

    var godot_array_front: ((GDArray?) -> Variant)

    var godot_array_get: ((GDArray?, Int) -> Variant)

    var godot_array_has: ((GDArray?, Variant?) -> Boolean)

    var godot_array_hash: ((GDArray?) -> Int)

    var godot_array_insert: ((GDArray?, Int, Variant?) -> Unit)

    var godot_array_invert: ((GDArray?) -> Unit)

    var godot_array_new: (() -> Long)

    var godot_array_new_pool_byte_array: ((PoolByteArray?) -> Long)

    var godot_array_new_pool_color_array: ((PoolColorArray?) -> Long)

    var godot_array_new_pool_int_array: ((PoolIntArray?) -> Long)

    var godot_array_new_pool_real_array: ((PoolRealArray?) -> Long)

    var godot_array_new_pool_string_array: ((PoolStringArray?) -> Long)

    var godot_array_new_pool_vector2_array: ((PoolVector2Array?) -> Long)

    var godot_array_new_pool_vector3_array: ((PoolVector3Array?) -> Long)

    var godot_array_operator_index: ((GDArray?, Int) -> Variant?)

    var godot_array_operator_index_const: ((GDArray?, Int) -> Variant?)

    var godot_array_pop_back: ((GDArray?) -> Variant)

    var godot_array_pop_front: ((GDArray?) -> Variant)

    var godot_array_push_back: ((GDArray?, Variant?) -> Unit)

    var godot_array_push_front: ((GDArray?, Variant?) -> Unit)

    var godot_array_remove: ((GDArray?, Int) -> Unit)

    var godot_array_resize: ((GDArray?, Int) -> Unit)

    var godot_array_rfind: ((GDArray?, Variant?, Int) -> Int)

    var godot_array_set: ((GDArray?, Int, Variant?) -> Unit)

    var godot_array_size: ((GDArray?) -> Int)

    var godot_array_sort: ((GDArray?) -> Unit)

    var godot_array_sort_custom: ((GDArray?, Any?, String?) -> Unit)

    var godot_basis_as_string: ((Basis?) -> String)

    var godot_basis_determinant: ((Basis?) -> Double)

    var godot_basis_get_axis: ((Basis?, Int) -> Vector3)

    var godot_basis_get_elements: ((Basis?, Vector3?) -> Unit)

    var godot_basis_get_euler: ((Basis?) -> Vector3)

    var godot_basis_get_orthogonal_index: ((Basis?) -> Int)

    var godot_basis_get_row: ((Basis?, Int) -> Vector3)

    var godot_basis_get_scale: ((Basis?) -> Vector3)

    var godot_basis_inverse: ((Basis?) -> Basis)

    var godot_basis_new: (() -> Long)

    var godot_basis_new_with_euler: ((Vector3?) -> Long)

    var godot_basis_new_with_euler_quat: ((Quat?) -> Long)

    var godot_basis_new_with_rows: ((Vector3?, Vector3?, Vector3?) -> Long)

    var godot_basis_operator_add: ((Basis?, Basis?) -> Basis)

    var godot_basis_operator_equal: ((Basis?, Basis?) -> Boolean)

    var godot_basis_operator_multiply_scalar: ((Basis?, Double) -> Basis)

    var godot_basis_operator_multiply_vector: ((Basis?, Basis?) -> Basis)

    var godot_basis_operator_subtract: ((Basis?, Basis?) -> Basis)

    var godot_basis_orthonormalized: ((Basis?) -> Basis)

    var godot_basis_rotated: ((Basis?, Vector3?, Double) -> Basis)

    var godot_basis_scaled: ((Basis?, Vector3?) -> Basis)

    var godot_basis_set_axis: ((Basis?, Int, Vector3?) -> Unit)

    var godot_basis_set_row: ((Basis?, Int, Vector3?) -> Unit)

    var godot_basis_tdotx: ((Basis?, Vector3?) -> Double)

    var godot_basis_tdoty: ((Basis?, Vector3?) -> Double)

    var godot_basis_tdotz: ((Basis?, Vector3?) -> Double)

    var godot_basis_transposed: ((Basis?) -> Basis)

    var godot_basis_xform: ((Basis?, Vector3?) -> Vector3)

    var godot_basis_xform_inv: ((Basis?, Vector3?) -> Vector3)

    var godot_char_string_destroy: ((Long?) -> Unit)

    var godot_char_string_get_data: ((Long?) -> String?)

    var godot_char_string_length: ((Long?) -> Int)

    var godot_color_as_string: ((Color?) -> String)

    var godot_color_blend: ((Color?, Color?) -> Color)

    var godot_color_contrasted: ((Color?) -> Color)

    var godot_color_get_a: ((Color?) -> Double)

    var godot_color_get_b: ((Color?) -> Double)

    var godot_color_get_g: ((Color?) -> Double)

    var godot_color_get_h: ((Color?) -> Double)

    var godot_color_get_r: ((Color?) -> Double)

    var godot_color_get_s: ((Color?) -> Double)

    var godot_color_get_v: ((Color?) -> Double)

    var godot_color_gray: ((Color?) -> Double)

    var godot_color_inverted: ((Color?) -> Color)

    var godot_color_linear_interpolate: ((Color?, Color?, Double) -> Color)

    var godot_color_new_rgb: ((Double, Double, Double) -> Long)

    var godot_color_new_rgba: ((Double, Double, Double, Double) -> Long)

    var godot_color_operator_equal: ((Color?, Color?) -> Boolean)

    var godot_color_operator_less: ((Color?, Color?) -> Boolean)

    var godot_color_set_a: ((Color?, Double) -> Unit)

    var godot_color_set_b: ((Color?, Double) -> Unit)

    var godot_color_set_g: ((Color?, Double) -> Unit)

    var godot_color_set_r: ((Color?, Double) -> Unit)

    var godot_color_to_argb32: ((Color?) -> Int)

    var godot_color_to_html: ((Color?, Boolean) -> String)

    var godot_color_to_rgba32: ((Color?) -> Int)

    var godot_dictionary_clear: ((Dictionary?) -> Unit)

    var godot_dictionary_destroy: ((Dictionary?) -> Unit)

    var godot_dictionary_empty: ((Dictionary?) -> Boolean)

    var godot_dictionary_erase: ((Dictionary?, Variant?) -> Unit)

    var godot_dictionary_get: ((Dictionary?, Variant?) -> Variant)

    var godot_dictionary_has: ((Dictionary?, Variant?) -> Boolean)

    var godot_dictionary_has_all: ((Dictionary?, GDArray?) -> Boolean)

    var godot_dictionary_hash: ((Dictionary?) -> Int)

    var godot_dictionary_keys: ((Dictionary?) -> GDArray)

    var godot_dictionary_new: (() -> Long)

    var godot_dictionary_next: ((Dictionary?, Variant?) -> Variant?)

    var godot_dictionary_operator_equal: ((Dictionary?, Dictionary?) -> Boolean)

    var godot_dictionary_operator_index: ((Dictionary?, Variant?) -> Variant?)

    var godot_dictionary_operator_index_const: ((Dictionary?, Variant?) -> Variant?)

    var godot_dictionary_set: ((Dictionary?, Variant?, Variant?) -> Unit)

    var godot_dictionary_size: ((Dictionary?) -> Int)

    var godot_dictionary_to_json: ((Dictionary?) -> String)

    var godot_dictionary_values: ((Dictionary?) -> GDArray)

    var godot_free: ((Any?) -> Unit)

    var godot_get_class_constructor: ((String?) -> Any?)

    var godot_get_global_constants: Any?

    var godot_global_get_singleton: ((String?) -> Any?)

    var godot_method_bind_call: ((godot_method_bind?, Any?, Array<Variant>?, Int, godot_variant_call_error?) -> Variant)

    var godot_method_bind_get_method: ((String?, String?) -> godot_method_bind?)

    var godot_method_bind_ptrcall: ((godot_method_bind?, Any?, Any?) -> Any?)

    var godot_node_path_as_string: ((NodePath?) -> String)

    var godot_node_path_destroy: ((NodePath?) -> Unit)

    var godot_node_path_get_concatenated_subnames: ((NodePath?) -> String)

    var godot_node_path_get_name: ((NodePath?, Int) -> String)

    var godot_node_path_get_name_count: ((NodePath?) -> Int)

    var godot_node_path_get_subname: ((NodePath?, Int) -> String)

    var godot_node_path_get_subname_count: ((NodePath?) -> Int)

    var godot_node_path_is_absolute: ((NodePath?) -> Boolean)

    var godot_node_path_is_empty: ((NodePath?) -> Boolean)

    var godot_node_path_new: ((String?) -> Long)

    var godot_node_path_new_copy: ((NodePath?) -> Long)

    var godot_node_path_operator_equal: ((NodePath?, NodePath?) -> Boolean)

    var godot_object_destroy: ((Any?) -> Unit)

    var godot_plane_as_string: ((Plane?) -> String)

    var godot_plane_center: ((Plane?) -> Vector3)

    var godot_plane_distance_to: ((Plane?, Vector3?) -> Double)

    var godot_plane_get_any_point: ((Plane?) -> Vector3)

    var godot_plane_get_d: ((Plane?) -> Double)

    var godot_plane_get_normal: ((Plane?) -> Vector3)

    var godot_plane_has_point: ((Plane?, Vector3?, Double) -> Boolean)

    var godot_plane_intersect_3: ((Plane?, Plane?, Plane?) -> Vector3?)

    var godot_plane_intersects_ray: ((Plane?, Vector3?, Vector3?) -> Vector3?)

    var godot_plane_intersects_segment: ((Plane?, Vector3?, Vector3?) -> Vector3?)

    var godot_plane_is_point_over: ((Plane?, Vector3?) -> Boolean)

    var godot_plane_new_with_normal: ((Vector3?, Double) -> Long)

    var godot_plane_new_with_reals: ((Double, Double, Double, Double) -> Long)

    var godot_plane_new_with_vectors: ((Vector3?, Vector3?, Vector3?) -> Long)

    var godot_plane_normalized: ((Plane?) -> Plane)

    var godot_plane_operator_equal: ((Plane?, Plane?) -> Boolean)

    var godot_plane_operator_neg: ((Plane?) -> Plane)

    var godot_plane_project: ((Plane?, Vector3?) -> Vector3)

    var godot_plane_set_d: ((Plane?, Double) -> Unit)

    var godot_plane_set_normal: ((Plane?, Vector3?) -> Unit)

    var godot_pool_byte_array_append: ((PoolByteArray?, Byte) -> Unit)

    var godot_pool_byte_array_append_array: ((PoolByteArray?, PoolByteArray?) -> Unit)

    var godot_pool_byte_array_destroy: ((PoolByteArray?) -> Unit)

    var godot_pool_byte_array_get: ((PoolByteArray?, Int) -> Byte)

    var godot_pool_byte_array_insert: ((PoolByteArray?, Int, Byte) -> godot_error)

    var godot_pool_byte_array_invert: ((PoolByteArray?) -> Unit)

    var godot_pool_byte_array_new: (() -> Long)

    var godot_pool_byte_array_new_with_array: ((GDArray?) -> Long)

    var godot_pool_byte_array_push_back: ((PoolByteArray?, Byte) -> Unit)

    var godot_pool_byte_array_read: ((PoolByteArray?) -> godot_pool_array_read_access?)

    var godot_pool_byte_array_read_access_copy: ((godot_pool_array_read_access?) -> godot_pool_array_read_access?)

    var godot_pool_byte_array_read_access_destroy: ((godot_pool_array_read_access?) -> Unit)

    var godot_pool_byte_array_read_access_operator_assign: ((godot_pool_array_read_access?, godot_pool_array_read_access?) -> Unit)

    var godot_pool_byte_array_read_access_ptr: ((godot_pool_array_read_access?) -> Long?)

    var godot_pool_byte_array_remove: ((PoolByteArray?, Int) -> Unit)

    var godot_pool_byte_array_resize: ((PoolByteArray?, Int) -> Unit)

    var godot_pool_byte_array_set: ((PoolByteArray?, Int, Byte) -> Unit)

    var godot_pool_byte_array_size: ((PoolByteArray?) -> Int)

    var godot_pool_byte_array_write: ((PoolByteArray?) -> godot_pool_array_write_access?)

    var godot_pool_byte_array_write_access_copy: ((godot_pool_array_write_access?) -> godot_pool_array_write_access?)

    var godot_pool_byte_array_write_access_destroy: ((godot_pool_array_write_access?) -> Unit)

    var godot_pool_byte_array_write_access_operator_assign: ((godot_pool_array_write_access?, godot_pool_array_write_access?) -> Unit)

    var godot_pool_byte_array_write_access_ptr: ((godot_pool_array_write_access?) -> Long?)

    var godot_pool_color_array_append: ((PoolColorArray?, Color?) -> Unit)

    var godot_pool_color_array_append_array: ((PoolColorArray?, PoolColorArray?) -> Unit)

    var godot_pool_color_array_destroy: ((PoolColorArray?) -> Unit)

    var godot_pool_color_array_get: ((PoolColorArray?, Int) -> Color)

    var godot_pool_color_array_insert: ((PoolColorArray?, Int, Color?) -> godot_error)

    var godot_pool_color_array_invert: ((PoolColorArray?) -> Unit)

    var godot_pool_color_array_new: (() -> Long)

    var godot_pool_color_array_new_with_array: ((GDArray?) -> Long)

    var godot_pool_color_array_push_back: ((PoolColorArray?, Color?) -> Unit)

    var godot_pool_color_array_read: ((PoolColorArray?) -> godot_pool_array_read_access?)

    var godot_pool_color_array_read_access_copy: ((godot_pool_array_read_access?) -> godot_pool_array_read_access?)

    var godot_pool_color_array_read_access_destroy: ((godot_pool_array_read_access?) -> Unit)

    var godot_pool_color_array_read_access_operator_assign: ((godot_pool_array_read_access?, godot_pool_array_read_access?) -> Unit)

    var godot_pool_color_array_read_access_ptr: ((godot_pool_array_read_access?) -> Long?)

    var godot_pool_color_array_remove: ((PoolColorArray?, Int) -> Unit)

    var godot_pool_color_array_resize: ((PoolColorArray?, Int) -> Unit)

    var godot_pool_color_array_set: ((PoolColorArray?, Int, Color?) -> Unit)

    var godot_pool_color_array_size: ((PoolColorArray?) -> Int)

    var godot_pool_color_array_write: ((PoolColorArray?) -> godot_pool_array_write_access?)

    var godot_pool_color_array_write_access_copy: ((godot_pool_array_write_access?) -> godot_pool_array_write_access?)

    var godot_pool_color_array_write_access_destroy: ((godot_pool_array_write_access?) -> Unit)

    var godot_pool_color_array_write_access_operator_assign: ((godot_pool_array_write_access?, godot_pool_array_write_access?) -> Unit)

    var godot_pool_color_array_write_access_ptr: ((godot_pool_array_write_access?) -> Long?)

    var godot_pool_int_array_append: ((PoolIntArray?, Int) -> Unit)

    var godot_pool_int_array_append_array: ((PoolIntArray?, PoolIntArray?) -> Unit)

    var godot_pool_int_array_destroy: ((PoolIntArray?) -> Unit)

    var godot_pool_int_array_get: ((PoolIntArray?, Int) -> Int)

    var godot_pool_int_array_insert: ((PoolIntArray?, Int, Int) -> godot_error)

    var godot_pool_int_array_invert: ((PoolIntArray?) -> Unit)

    var godot_pool_int_array_new: (() -> Long)

    var godot_pool_int_array_new_with_array: ((GDArray?) -> Long)

    var godot_pool_int_array_push_back: ((PoolIntArray?, Int) -> Unit)

    var godot_pool_int_array_read: ((PoolIntArray?) -> godot_pool_array_read_access?)

    var godot_pool_int_array_read_access_copy: ((godot_pool_array_read_access?) -> godot_pool_array_read_access?)

    var godot_pool_int_array_read_access_destroy: ((godot_pool_array_read_access?) -> Unit)

    var godot_pool_int_array_read_access_operator_assign: ((godot_pool_array_read_access?, godot_pool_array_read_access?) -> Unit)

    var godot_pool_int_array_read_access_ptr: ((godot_pool_array_read_access?) -> Long?)

    var godot_pool_int_array_remove: ((PoolIntArray?, Int) -> Unit)

    var godot_pool_int_array_resize: ((PoolIntArray?, Int) -> Unit)

    var godot_pool_int_array_set: ((PoolIntArray?, Int, Int) -> Unit)

    var godot_pool_int_array_size: ((PoolIntArray?) -> Int)

    var godot_pool_int_array_write: ((PoolIntArray?) -> godot_pool_array_write_access?)

    var godot_pool_int_array_write_access_copy: ((godot_pool_array_write_access?) -> godot_pool_array_write_access?)

    var godot_pool_int_array_write_access_destroy: ((godot_pool_array_write_access?) -> Unit)

    var godot_pool_int_array_write_access_operator_assign: ((godot_pool_array_write_access?, godot_pool_array_write_access?) -> Unit)

    var godot_pool_int_array_write_access_ptr: ((godot_pool_array_write_access?) -> Long?)

    var godot_pool_real_array_append: ((PoolRealArray?, Double) -> Unit)

    var godot_pool_real_array_append_array: ((PoolRealArray?, PoolRealArray?) -> Unit)

    var godot_pool_real_array_destroy: ((PoolRealArray?) -> Unit)

    var godot_pool_real_array_get: ((PoolRealArray?, Int) -> Double)

    var godot_pool_real_array_insert: ((PoolRealArray?, Int, Double) -> godot_error)

    var godot_pool_real_array_invert: ((PoolRealArray?) -> Unit)

    var godot_pool_real_array_new: (() -> Long)

    var godot_pool_real_array_new_with_array: ((GDArray?) -> Long)

    var godot_pool_real_array_push_back: ((PoolRealArray?, Double) -> Unit)

    var godot_pool_real_array_read: ((PoolRealArray?) -> godot_pool_array_read_access?)

    var godot_pool_real_array_read_access_copy: ((godot_pool_array_read_access?) -> godot_pool_array_read_access?)

    var godot_pool_real_array_read_access_destroy: ((godot_pool_array_read_access?) -> Unit)

    var godot_pool_real_array_read_access_operator_assign: ((godot_pool_array_read_access?, godot_pool_array_read_access?) -> Unit)

    var godot_pool_real_array_read_access_ptr: ((godot_pool_array_read_access?) -> Long?)

    var godot_pool_real_array_remove: ((PoolRealArray?, Int) -> Unit)

    var godot_pool_real_array_resize: ((PoolRealArray?, Int) -> Unit)

    var godot_pool_real_array_set: ((PoolRealArray?, Int, Double) -> Unit)

    var godot_pool_real_array_size: ((PoolRealArray?) -> Int)

    var godot_pool_real_array_write: ((PoolRealArray?) -> godot_pool_array_write_access?)

    var godot_pool_real_array_write_access_copy: ((godot_pool_array_write_access?) -> godot_pool_array_write_access?)

    var godot_pool_real_array_write_access_destroy: ((godot_pool_array_write_access?) -> Unit)

    var godot_pool_real_array_write_access_operator_assign: ((godot_pool_array_write_access?, godot_pool_array_write_access?) -> Unit)

    var godot_pool_real_array_write_access_ptr: ((godot_pool_array_write_access?) -> Long?)

    var godot_pool_string_array_append: ((PoolStringArray?, String?) -> Unit)

    var godot_pool_string_array_append_array: ((PoolStringArray?, PoolStringArray?) -> Unit)

    var godot_pool_string_array_destroy: ((PoolStringArray?) -> Unit)

    var godot_pool_string_array_get: ((PoolStringArray?, Int) -> String)

    var godot_pool_string_array_insert: ((PoolStringArray?, Int, String?) -> godot_error)

    var godot_pool_string_array_invert: ((PoolStringArray?) -> Unit)

    var godot_pool_string_array_new: (() -> Long)

    var godot_pool_string_array_new_with_array: ((GDArray?) -> Long)

    var godot_pool_string_array_push_back: ((PoolStringArray?, String?) -> Unit)

    var godot_pool_string_array_read: ((PoolStringArray?) -> godot_pool_array_read_access?)

    var godot_pool_string_array_read_access_copy: ((godot_pool_array_read_access?) -> godot_pool_array_read_access?)

    var godot_pool_string_array_read_access_destroy: ((godot_pool_array_read_access?) -> Unit)

    var godot_pool_string_array_read_access_operator_assign: ((godot_pool_array_read_access?, godot_pool_array_read_access?) -> Unit)

    var godot_pool_string_array_read_access_ptr: ((godot_pool_array_read_access?) -> Long?)

    var godot_pool_string_array_remove: ((PoolStringArray?, Int) -> Unit)

    var godot_pool_string_array_resize: ((PoolStringArray?, Int) -> Unit)

    var godot_pool_string_array_set: ((PoolStringArray?, Int, String?) -> Unit)

    var godot_pool_string_array_size: ((PoolStringArray?) -> Int)

    var godot_pool_string_array_write: ((PoolStringArray?) -> godot_pool_array_write_access?)

    var godot_pool_string_array_write_access_copy: ((godot_pool_array_write_access?) -> godot_pool_array_write_access?)

    var godot_pool_string_array_write_access_destroy: ((godot_pool_array_write_access?) -> Unit)

    var godot_pool_string_array_write_access_operator_assign: ((godot_pool_array_write_access?, godot_pool_array_write_access?) -> Unit)

    var godot_pool_string_array_write_access_ptr: ((godot_pool_array_write_access?) -> Long?)

    var godot_pool_vector2_array_append: ((PoolVector2Array?, Vector2?) -> Unit)

    var godot_pool_vector2_array_append_array: ((PoolVector2Array?, PoolVector2Array?) -> Unit)

    var godot_pool_vector2_array_destroy: ((PoolVector2Array?) -> Unit)

    var godot_pool_vector2_array_get: ((PoolVector2Array?, Int) -> Vector2)

    var godot_pool_vector2_array_insert: ((PoolVector2Array?, Int, Vector2?) -> godot_error)

    var godot_pool_vector2_array_invert: ((PoolVector2Array?) -> Unit)

    var godot_pool_vector2_array_new: (() -> Long)

    var godot_pool_vector2_array_new_with_array: ((GDArray?) -> Long)

    var godot_pool_vector2_array_push_back: ((PoolVector2Array?, Vector2?) -> Unit)

    var godot_pool_vector2_array_read: ((PoolVector2Array?) -> godot_pool_array_read_access?)

    var godot_pool_vector2_array_read_access_copy: ((godot_pool_array_read_access?) -> godot_pool_array_read_access?)

    var godot_pool_vector2_array_read_access_destroy: ((godot_pool_array_read_access?) -> Unit)

    var godot_pool_vector2_array_read_access_operator_assign: ((godot_pool_array_read_access?, godot_pool_array_read_access?) -> Unit)

    var godot_pool_vector2_array_read_access_ptr: ((godot_pool_array_read_access?) -> Long?)

    var godot_pool_vector2_array_remove: ((PoolVector2Array?, Int) -> Unit)

    var godot_pool_vector2_array_resize: ((PoolVector2Array?, Int) -> Unit)

    var godot_pool_vector2_array_set: ((PoolVector2Array?, Int, Vector2?) -> Unit)

    var godot_pool_vector2_array_size: ((PoolVector2Array?) -> Int)

    var godot_pool_vector2_array_write: ((PoolVector2Array?) -> godot_pool_array_write_access?)

    var godot_pool_vector2_array_write_access_copy: ((godot_pool_array_write_access?) -> godot_pool_array_write_access?)

    var godot_pool_vector2_array_write_access_destroy: ((godot_pool_array_write_access?) -> Unit)

    var godot_pool_vector2_array_write_access_operator_assign: ((godot_pool_array_write_access?, godot_pool_array_write_access?) -> Unit)

    var godot_pool_vector2_array_write_access_ptr: ((godot_pool_array_write_access?) -> Long?)

    var godot_pool_vector3_array_append: ((PoolVector3Array?, Vector3?) -> Unit)

    var godot_pool_vector3_array_append_array: ((PoolVector3Array?, PoolVector3Array?) -> Unit)

    var godot_pool_vector3_array_destroy: ((PoolVector3Array?) -> Unit)

    var godot_pool_vector3_array_get: ((PoolVector3Array?, Int) -> Vector3)

    var godot_pool_vector3_array_insert: ((PoolVector3Array?, Int, Vector3?) -> godot_error)

    var godot_pool_vector3_array_invert: ((PoolVector3Array?) -> Unit)

    var godot_pool_vector3_array_new: (() -> Long)

    var godot_pool_vector3_array_new_with_array: ((GDArray?) -> Long)

    var godot_pool_vector3_array_push_back: ((PoolVector3Array?, Vector3?) -> Unit)

    var godot_pool_vector3_array_read: ((PoolVector3Array?) -> godot_pool_array_read_access?)

    var godot_pool_vector3_array_read_access_copy: ((godot_pool_array_read_access?) -> godot_pool_array_read_access?)

    var godot_pool_vector3_array_read_access_destroy: ((godot_pool_array_read_access?) -> Unit)

    var godot_pool_vector3_array_read_access_operator_assign: ((godot_pool_array_read_access?, godot_pool_array_read_access?) -> Unit)

    var godot_pool_vector3_array_read_access_ptr: ((godot_pool_array_read_access?) -> Long?)

    var godot_pool_vector3_array_remove: ((PoolVector3Array?, Int) -> Unit)

    var godot_pool_vector3_array_resize: ((PoolVector3Array?, Int) -> Unit)

    var godot_pool_vector3_array_set: ((PoolVector3Array?, Int, Vector3?) -> Unit)

    var godot_pool_vector3_array_size: ((PoolVector3Array?) -> Int)

    var godot_pool_vector3_array_write: ((PoolVector3Array?) -> godot_pool_array_write_access?)

    var godot_pool_vector3_array_write_access_copy: ((godot_pool_array_write_access?) -> godot_pool_array_write_access?)

    var godot_pool_vector3_array_write_access_destroy: ((godot_pool_array_write_access?) -> Unit)

    var godot_pool_vector3_array_write_access_operator_assign: ((godot_pool_array_write_access?, godot_pool_array_write_access?) -> Unit)

    var godot_pool_vector3_array_write_access_ptr: ((godot_pool_array_write_access?) -> Long?)

    var godot_print: ((String?) -> Unit)

    var godot_print_error: ((String?, String?, String?, Int) -> Unit)

    var godot_print_warning: ((String?, String?, String?, Int) -> Unit)

    var godot_quat_as_string: ((Quat?) -> String)

    var godot_quat_cubic_slerp: ((Quat?, Quat?, Quat?, Quat?, Double) -> Quat)

    var godot_quat_dot: ((Quat?, Quat?) -> Double)

    var godot_quat_get_w: ((Quat?) -> Double)

    var godot_quat_get_x: ((Quat?) -> Double)

    var godot_quat_get_y: ((Quat?) -> Double)

    var godot_quat_get_z: ((Quat?) -> Double)

    var godot_quat_inverse: ((Quat?) -> Quat)

    var godot_quat_is_normalized: ((Quat?) -> Boolean)

    var godot_quat_length: ((Quat?) -> Double)

    var godot_quat_length_squared: ((Quat?) -> Double)

    var godot_quat_new: ((Double, Double, Double, Double) -> Long)

    var godot_quat_new_with_axis_angle: ((Vector3?, Double) -> Long)

    var godot_quat_normalized: ((Quat?) -> Quat)

    var godot_quat_operator_add: ((Quat?, Quat?) -> Quat)

    var godot_quat_operator_divide: ((Quat?, Double) -> Quat)

    var godot_quat_operator_equal: ((Quat?, Quat?) -> Boolean)

    var godot_quat_operator_multiply: ((Quat?, Double) -> Quat)

    var godot_quat_operator_neg: ((Quat?) -> Quat)

    var godot_quat_operator_subtract: ((Quat?, Quat?) -> Quat)

    var godot_quat_set_w: ((Quat?, Double) -> Unit)

    var godot_quat_set_x: ((Quat?, Double) -> Unit)

    var godot_quat_set_y: ((Quat?, Double) -> Unit)

    var godot_quat_set_z: ((Quat?, Double) -> Unit)

    var godot_quat_slerp: ((Quat?, Quat?, Double) -> Quat)

    var godot_quat_slerpni: ((Quat?, Quat?, Double) -> Quat)

    var godot_quat_xform: ((Quat?, Vector3?) -> Vector3)

    var godot_realloc: ((Any?, Int) -> Any?)

    var godot_rect2_as_string: ((Rect2?) -> String)

    var godot_rect2_clip: ((Rect2?, Rect2?) -> Rect2)

    var godot_rect2_encloses: ((Rect2?, Rect2?) -> Boolean)

    var godot_rect2_expand: ((Rect2?, Vector2?) -> Rect2)

    var godot_rect2_get_area: ((Rect2?) -> Double)

    var godot_rect2_get_position: ((Rect2?) -> Vector2)

    var godot_rect2_get_size: ((Rect2?) -> Vector2)

    var godot_rect2_grow: ((Rect2?, Double) -> Rect2)

    var godot_rect2_has_no_area: ((Rect2?) -> Boolean)

    var godot_rect2_has_point: ((Rect2?, Vector2?) -> Boolean)

    var godot_rect2_intersects: ((Rect2?, Rect2?) -> Boolean)

    var godot_rect2_merge: ((Rect2?, Rect2?) -> Rect2)

    var godot_rect2_new: ((Double, Double, Double, Double) -> Long)

    var godot_rect2_new_with_position_and_size: ((Vector2?, Vector2?) -> Long)

    var godot_rect2_operator_equal: ((Rect2?, Rect2?) -> Boolean)

    var godot_rect2_set_position: ((Rect2?, Vector2?) -> Unit)

    var godot_rect2_set_size: ((Rect2?, Vector2?) -> Unit)

    var godot_register_native_call_type: ((String?, ((Any?, GDArray?) -> Variant)?) -> Unit)?

    var godot_rid_get_id: ((RID?) -> Int)

    var godot_rid_new: (() -> Long)

    var godot_rid_operator_equal: ((RID?, RID?) -> Boolean)

    var godot_rid_operator_less: ((RID?, RID?) -> Boolean)

    var godot_string_ascii: ((String?) -> String)

    var godot_string_ascii_extended: ((String?) -> String)

    var godot_string_begins_with: ((String?, String?) -> Boolean)

    var godot_string_begins_with_char_array: ((String?, String?) -> Boolean)

    var godot_string_bigrams: ((String?) -> GDArray)

    var godot_string_c_escape: ((String?) -> String)

    var godot_string_c_escape_multiline: ((String?) -> String)

    var godot_string_c_unescape: ((String?) -> String)

    var godot_string_camelcase_to_underscore: ((String?) -> String)

    var godot_string_camelcase_to_underscore_lowercased: ((String?) -> String)

    var godot_string_capitalize: ((String?) -> String)

    var godot_string_casecmp_to: ((String?, String?) -> String)

    var godot_string_char_lowercase: ((Char) -> Char)

    var godot_string_char_to_double: ((String?) -> Double)

    var godot_string_char_to_int: ((String?) -> Int)

    var godot_string_char_to_int64_with_len: ((Char?, Int) -> Long)

    var godot_string_char_to_int_with_len: ((String?, Int) -> Int)

    var godot_string_char_uppercase: ((Char) -> Char)

    var godot_string_chars_to_utf8: ((String?) -> String)

    var godot_string_chars_to_utf8_with_len: ((String?, Int) -> String)

    var godot_string_chr: ((Char) -> String)

    var godot_string_destroy: ((String?) -> Unit)

    var godot_string_empty: ((String?) -> Boolean)

    var godot_string_ends_with: ((String?, String?) -> Boolean)

    var godot_string_erase: ((String?, Int, Int) -> Unit)

    var godot_string_find: ((String?, String) -> Int)

    var godot_string_find_from: ((String?, String, Int) -> Int)

    var godot_string_find_last: ((String?, String) -> Int)

    var godot_string_findmk: ((String?, GDArray?) -> Int)

    var godot_string_findmk_from: ((String?, GDArray?, Int) -> Int)

    var godot_string_findmk_from_in_place: ((String?, GDArray?, Int, Int?) -> Int)

    var godot_string_findn: ((String?, String) -> Int)

    var godot_string_findn_from: ((String?, String, Int) -> Int)

    var godot_string_format: ((String?, Variant?) -> String)

    var godot_string_format_with_custom_placeholder: ((String?, Variant?, String?) -> String)

    var godot_string_get_base_dir: ((String?) -> String)

    var godot_string_get_basename: ((String?) -> String)

    var godot_string_get_extension: ((String?) -> String)

    var godot_string_get_file: ((String?) -> String)

    var godot_string_get_slice: ((String?, String, Int) -> String)

    var godot_string_get_slice_count: ((String?, String) -> Int)

    var godot_string_get_slicec: ((String?, Char, Int) -> String)

    var godot_string_hash: ((String?) -> Int)

    var godot_string_hash64: ((String?) -> Long)

    var godot_string_hash_chars: ((String?) -> Int)

    var godot_string_hash_chars_with_len: ((String?, Int) -> Int)

    var godot_string_hash_utf8_chars: ((Char?) -> Int)

    var godot_string_hash_utf8_chars_with_len: ((Char?, Int) -> Int)

    var godot_string_hex_encode_buffer: ((Array<Byte>?, Int) -> String)

    var godot_string_hex_to_int: ((String?) -> Int)

    var godot_string_hex_to_int64: ((String?) -> Long)

    var godot_string_hex_to_int64_with_prefix: ((String?) -> Long)

    var godot_string_hex_to_int_without_prefix: ((String?) -> Int)

    var godot_string_http_escape: ((String?) -> String)

    var godot_string_http_unescape: ((String?) -> String)

    var godot_string_humanize_size: ((Int) -> String)

    var godot_string_insert: ((String?, Int, String) -> String)

    var godot_string_is_abs_path: ((String?) -> Boolean)

    var godot_string_is_numeric: ((String?) -> Boolean)

    var godot_string_is_rel_path: ((String?) -> Boolean)

    var godot_string_is_resource_file: ((String?) -> Boolean)

    var godot_string_is_subsequence_of: ((String?, String?) -> Boolean)

    var godot_string_is_subsequence_ofi: ((String?, String?) -> Boolean)

    var godot_string_is_valid_float: ((String?) -> Boolean)

    var godot_string_is_valid_hex_number: ((String?, Boolean) -> Boolean)

    var godot_string_is_valid_html_color: ((String?) -> Boolean)

    var godot_string_is_valid_identifier: ((String?) -> Boolean)

    var godot_string_is_valid_integer: ((String?) -> Boolean)

    var godot_string_is_valid_ip_address: ((String?) -> Boolean)

    var godot_string_json_escape: ((String?) -> String)

    var godot_string_left: ((String?, Int) -> String)

    var godot_string_length: ((String?) -> Int)

    var godot_string_lpad: ((String?, Int) -> String)

    var godot_string_lpad_with_custom_character: ((String?, Int, String?) -> String)

    var godot_string_match: ((String?, String?) -> Boolean)

    var godot_string_matchn: ((String?, String?) -> Boolean)

    var godot_string_md5: ((String?) -> String)

    var godot_string_md5_buffer: ((String?) -> PoolByteArray)

    var godot_string_md5_text: ((String?) -> String)

    var godot_string_name_destroy: ((godot_string_name?) -> Unit)

    var godot_string_name_get_data_unique_pointer: ((godot_string_name?) -> Any?)

    var godot_string_name_get_hash: ((godot_string_name?) -> Int)

    var godot_string_name_get_name: ((godot_string_name?) -> String)

    var godot_string_name_new: ((String?) -> Long)

    var godot_string_name_new_data: ((String?) -> Long)

    var godot_string_name_operator_equal: ((godot_string_name?, godot_string_name?) -> Boolean)

    var godot_string_name_operator_less: ((godot_string_name?, godot_string_name?) -> Boolean)

    var godot_string_naturalnocasecmp_to: ((String?, String?) -> String)

    var godot_string_new: (() -> Long)

    var godot_string_new_with_wide_string: ((Char?, Int) -> Long)

    var godot_string_nocasecmp_to: ((String?, String?) -> String)

    var godot_string_num: ((Double) -> String)

    var godot_string_num_int64: ((Long, Int) -> String)

    var godot_string_num_int64_capitalized: ((Long, Int, Boolean) -> String)

    var godot_string_num_real: ((Double) -> String)

    var godot_string_num_scientific: ((Double) -> String)

    var godot_string_num_with_decimals: ((Double, Int) -> String)

    var godot_string_operator_equal: ((String?, String?) -> Boolean)

    var godot_string_operator_index: ((String?, Int) -> Char?)

    var godot_string_operator_index_const: ((String?, Int) -> Char)

    var godot_string_operator_less: ((String?, String?) -> Boolean)

    var godot_string_operator_plus: ((String?, String?) -> String)

    var godot_string_ord_at: ((String?, Int) -> Char)

    var godot_string_pad_decimals: ((String?, Int) -> String)

    var godot_string_pad_zeros: ((String?, Int) -> String)

    var godot_string_parse_utf8: ((String?, String?) -> Boolean)

    var godot_string_parse_utf8_with_len: ((String?, String?, Int) -> Boolean)

    var godot_string_path_to: ((String?, String?) -> String)

    var godot_string_path_to_file: ((String?, String?) -> String)

    var godot_string_percent_decode: ((String?) -> String)

    var godot_string_percent_encode: ((String?) -> String)

    var godot_string_plus_file: ((String?, String?) -> String)

    var godot_string_replace: ((String?, String, String) -> String)

    var godot_string_replace_first: ((String?, String, String) -> String)

    var godot_string_replacen: ((String?, String, String) -> String)

    var godot_string_rfind: ((String?, String) -> Int)

    var godot_string_rfind_from: ((String?, String, Int) -> Int)

    var godot_string_rfindn: ((String?, String) -> Int)

    var godot_string_rfindn_from: ((String?, String, Int) -> Int)

    var godot_string_right: ((String?, Int) -> String)

    var godot_string_rpad: ((String?, Int) -> String)

    var godot_string_rpad_with_custom_character: ((String?, Int, String?) -> String)

    var godot_string_sha256_buffer: ((String?) -> PoolByteArray)

    var godot_string_sha256_text: ((String?) -> String)

    var godot_string_similarity: ((String?, String?) -> Double)

    var godot_string_simplify_path: ((String?) -> String)

    var godot_string_split: ((String?, String?) -> GDArray)

    var godot_string_split_allow_empty: ((String?, String?) -> GDArray)

    var godot_string_split_floats: ((String?, String?) -> GDArray)

    var godot_string_split_floats_allows_empty: ((String?, String?) -> GDArray)

    var godot_string_split_floats_mk: ((String?, GDArray?) -> GDArray)

    var godot_string_split_floats_mk_allows_empty: ((String?, GDArray?) -> GDArray)

    var godot_string_split_ints: ((String?, String?) -> GDArray)

    var godot_string_split_ints_allows_empty: ((String?, String?) -> GDArray)

    var godot_string_split_ints_mk: ((String?, GDArray?) -> GDArray)

    var godot_string_split_ints_mk_allows_empty: ((String?, GDArray?) -> GDArray)

    var godot_string_split_spaces: ((String?) -> GDArray)

    var godot_string_sprintf: ((String?, GDArray?, Boolean?) -> String)

    var godot_string_strip_edges: ((String?, Boolean, Boolean) -> String)

    var godot_string_strip_escapes: ((String?) -> String)

    var godot_string_substr: ((String?, Int, Int) -> String)

    var godot_string_to_double: ((String?) -> Double)

    var godot_string_to_float: ((String?) -> Double)

    var godot_string_to_int: ((String?) -> Int)

    var godot_string_to_int64: ((String?) -> Long)

    var godot_string_to_lower: ((String?) -> String)

    var godot_string_to_upper: ((String?) -> String)

    var godot_string_unicode_char_to_double: ((Char?, Char?) -> Double)

    var godot_string_utf8: ((String?) -> String)

    var godot_string_wchar_to_int: ((Char?) -> Long)

    var godot_string_wide_str: ((String?) -> Char?)

    var godot_string_word_wrap: ((String?, Int) -> String)

    var godot_string_xml_escape: ((String?) -> String)

    var godot_string_xml_escape_with_quotes: ((String?) -> String)

    var godot_string_xml_unescape: ((String?) -> String)

    var godot_transform2d_affine_inverse: ((Transform2D?) -> Transform2D)

    var godot_transform2d_as_string: ((Transform2D?) -> String)

    var godot_transform2d_basis_xform_inv_vector2: ((Transform2D?, Vector2?) -> Vector2)

    var godot_transform2d_basis_xform_vector2: ((Transform2D?, Vector2?) -> Vector2)

    var godot_transform2d_get_origin: ((Transform2D?) -> Vector2)

    var godot_transform2d_get_rotation: ((Transform2D?) -> Double)

    var godot_transform2d_get_scale: ((Transform2D?) -> Vector2)

    var godot_transform2d_interpolate_with: ((Transform2D?, Transform2D?, Double) -> Transform2D)

    var godot_transform2d_inverse: ((Transform2D?) -> Transform2D)

    var godot_transform2d_new: ((Double, Vector2?) -> Long)

    var godot_transform2d_new_axis_origin: ((Vector2?, Vector2?, Vector2?) -> Long)

    var godot_transform2d_new_identity: (() -> Long)

    var godot_transform2d_operator_equal: ((Transform2D?, Transform2D?) -> Boolean)

    var godot_transform2d_operator_multiply: ((Transform2D?, Transform2D?) -> Transform2D)

    var godot_transform2d_orthonormalized: ((Transform2D?) -> Transform2D)

    var godot_transform2d_rotated: ((Transform2D?, Double) -> Transform2D)

    var godot_transform2d_scaled: ((Transform2D?, Vector2?) -> Transform2D)

    var godot_transform2d_translated: ((Transform2D?, Vector2?) -> Transform2D)

    var godot_transform2d_xform_inv_rect2: ((Transform2D?, Rect2?) -> Rect2)

    var godot_transform2d_xform_inv_vector2: ((Transform2D?, Vector2?) -> Vector2)

    var godot_transform2d_xform_rect2: ((Transform2D?, Rect2?) -> Rect2)

    var godot_transform2d_xform_vector2: ((Transform2D?, Vector2?) -> Vector2)

    var godot_transform_affine_inverse: ((Transform?) -> Transform)

    var godot_transform_as_string: ((Transform?) -> String)

    var godot_transform_get_basis: ((Transform?) -> Basis)

    var godot_transform_get_origin: ((Transform?) -> Vector3)

    var godot_transform_inverse: ((Transform?) -> Transform)

    var godot_transform_looking_at: ((Transform?, Vector3?, Vector3?) -> Transform)

    var godot_transform_new: ((Basis?, Vector3?) -> Long)

    var godot_transform_new_identity: (() -> Long)

    var godot_transform_operator_equal: ((Transform?, Transform?) -> Boolean)

    var godot_transform_operator_multiply: ((Transform?, Transform?) -> Transform)

    var godot_transform_orthonormalized: ((Transform?) -> Transform)

    var godot_transform_rotated: ((Transform?, Vector3?, Double) -> Transform)

    var godot_transform_scaled: ((Transform?, Vector3?) -> Transform)

    var godot_transform_set_basis: ((Transform?, Basis?) -> Unit)

    var godot_transform_set_origin: ((Transform?, Vector3?) -> Unit)

    var godot_transform_translated: ((Transform?, Vector3?) -> Transform)

    var godot_transform_xform_aabb: ((Transform?, AABB?) -> AABB)

    var godot_transform_xform_inv_aabb: ((Transform?, AABB?) -> AABB)

    var godot_transform_xform_inv_plane: ((Transform?, Plane?) -> Plane)

    var godot_transform_xform_inv_vector3: ((Transform?, Vector3?) -> Vector3)

    var godot_transform_xform_plane: ((Transform?, Plane?) -> Plane)

    var godot_transform_xform_vector3: ((Transform?, Vector3?) -> Vector3)

    var godot_variant_as_aabb: ((Variant?) -> AABB)

    var godot_variant_as_array: ((Variant?) -> GDArray)

    var godot_variant_as_basis: ((Variant?) -> Basis)

    var godot_variant_as_bool: ((Variant?) -> Boolean)

    var godot_variant_as_color: ((Variant?) -> Color)

    var godot_variant_as_dictionary: ((Variant?) -> Dictionary)

    var godot_variant_as_int: ((Variant?) -> Long)

    var godot_variant_as_node_path: ((Variant?) -> NodePath)

    var godot_variant_as_object: ((Variant?) -> Any?)

    var godot_variant_as_plane: ((Variant?) -> Plane)

    var godot_variant_as_pool_byte_array: ((Variant?) -> PoolByteArray)

    var godot_variant_as_pool_color_array: ((Variant?) -> PoolColorArray)

    var godot_variant_as_pool_int_array: ((Variant?) -> PoolIntArray)

    var godot_variant_as_pool_real_array: ((Variant?) -> PoolRealArray)

    var godot_variant_as_pool_string_array: ((Variant?) -> PoolStringArray)

    var godot_variant_as_pool_vector2_array: ((Variant?) -> PoolVector2Array)

    var godot_variant_as_pool_vector3_array: ((Variant?) -> PoolVector3Array)

    var godot_variant_as_quat: ((Variant?) -> Quat)

    var godot_variant_as_real: ((Variant?) -> Double)

    var godot_variant_as_rect2: ((Variant?) -> Rect2)

    var godot_variant_as_rid: ((Variant?) -> RID)

    var godot_variant_as_string: ((Variant?) -> String)

    var godot_variant_as_transform: ((Variant?) -> Transform)

    var godot_variant_as_transform2d: ((Variant?) -> Transform2D)

    var godot_variant_as_uint: ((Variant?) -> Long)

    var godot_variant_as_vector2: ((Variant?) -> Vector2)

    var godot_variant_as_vector3: ((Variant?) -> Vector3)

    var godot_variant_booleanize: ((Variant?) -> Boolean)

    var godot_variant_call: ((Variant?, String?, Array<Variant>?, Int) -> Variant)

    var godot_variant_destroy: ((Variant?) -> Unit)

    var godot_variant_get_type: ((Variant?) -> Int)

    var godot_variant_has_method: ((Variant?, String?) -> Boolean)

    var godot_variant_hash_compare: ((Variant?, Variant?) -> Boolean)

    var godot_variant_new_aabb: ((AABB?) -> Long)

    var godot_variant_new_array: ((GDArray?) -> Long)

    var godot_variant_new_basis: ((Basis?) -> Long)

    var godot_variant_new_bool: ((Boolean) -> Long)

    var godot_variant_new_color: ((Color?) -> Long)

    var godot_variant_new_copy: ((Variant?) -> Long)

    var godot_variant_new_dictionary: ((Dictionary?) -> Long)

    var godot_variant_new_int: ((Long) -> Long)

    var godot_variant_new_nil: (() -> Long)

    var godot_variant_new_node_path: ((NodePath?) -> Long)

    var godot_variant_new_object: ((Any?) -> Long)

    var godot_variant_new_plane: ((Plane?) -> Long)

    var godot_variant_new_pool_byte_array: ((PoolByteArray?) -> Long)

    var godot_variant_new_pool_color_array: ((PoolColorArray?) -> Long)

    var godot_variant_new_pool_int_array: ((PoolIntArray?) -> Long)

    var godot_variant_new_pool_real_array: ((PoolRealArray?) -> Long)

    var godot_variant_new_pool_string_array: ((PoolStringArray?) -> Long)

    var godot_variant_new_pool_vector2_array: ((PoolVector2Array?) -> Long)

    var godot_variant_new_pool_vector3_array: ((PoolVector3Array?) -> Long)

    var godot_variant_new_quat: ((Quat?) -> Long)

    var godot_variant_new_real: ((Double) -> Long)

    var godot_variant_new_rect2: ((Rect2?) -> Long)

    var godot_variant_new_rid: ((RID?) -> Long)

    var godot_variant_new_string: ((String?) -> Long)

    var godot_variant_new_transform: ((Transform?) -> Long)

    var godot_variant_new_transform2d: ((Transform2D?) -> Long)

    var godot_variant_new_uint: ((Long) -> Long)

    var godot_variant_new_vector2: ((Vector2?) -> Long)

    var godot_variant_new_vector3: ((Vector3?) -> Long)

    var godot_variant_operator_equal: ((Long?, Long?) -> Boolean)

    var godot_variant_operator_less: ((Long?, Long?) -> Boolean)

    var godot_vector2_abs: ((Vector2?) -> Vector2)

    var godot_vector2_angle: ((Vector2?) -> Double)

    var godot_vector2_angle_to: ((Vector2?, Vector2?) -> Double)

    var godot_vector2_angle_to_point: ((Vector2?, Vector2?) -> Double)

    var godot_vector2_as_string: ((Vector2?) -> String)

    var godot_vector2_aspect: ((Vector2?) -> Double)

    var godot_vector2_bounce: ((Vector2?, Vector2?) -> Vector2)

    var godot_vector2_clamped: ((Vector2?, Double) -> Vector2)

    var godot_vector2_cubic_interpolate: ((Vector2?, Vector2?, Vector2?, Vector2?, Double) -> Vector2)

    var godot_vector2_distance_squared_to: ((Vector2?, Vector2?) -> Double)

    var godot_vector2_distance_to: ((Vector2?, Vector2?) -> Double)

    var godot_vector2_dot: ((Vector2?, Vector2?) -> Double)

    var godot_vector2_floor: ((Vector2?) -> Vector2)

    var godot_vector2_get_x: ((Vector2?) -> Double)

    var godot_vector2_get_y: ((Vector2?) -> Double)

    var godot_vector2_is_normalized: ((Vector2?) -> Boolean)

    var godot_vector2_length: ((Vector2?) -> Double)

    var godot_vector2_length_squared: ((Vector2?) -> Double)

    var godot_vector2_linear_interpolate: ((Vector2?, Vector2?, Double) -> Vector2)

    var godot_vector2_new: ((Double, Double) -> Long)

    var godot_vector2_normalized: ((Vector2?) -> Vector2)

    var godot_vector2_operator_add: ((Vector2?, Vector2?) -> Vector2)

    var godot_vector2_operator_divide_scalar: ((Vector2?, Double) -> Vector2)

    var godot_vector2_operator_divide_vector: ((Vector2?, Vector2?) -> Vector2)

    var godot_vector2_operator_equal: ((Vector2?, Vector2?) -> Boolean)

    var godot_vector2_operator_less: ((Vector2?, Vector2?) -> Boolean)

    var godot_vector2_operator_multiply_scalar: ((Vector2?, Double) -> Vector2)

    var godot_vector2_operator_multiply_vector: ((Vector2?, Vector2?) -> Vector2)

    var godot_vector2_operator_neg: ((Vector2?) -> Vector2)

    var godot_vector2_operator_subtract: ((Vector2?, Vector2?) -> Vector2)

    var godot_vector2_reflect: ((Vector2?, Vector2?) -> Vector2)

    var godot_vector2_rotated: ((Vector2?, Double) -> Vector2)

    var godot_vector2_set_x: ((Vector2?, Double) -> Unit)

    var godot_vector2_set_y: ((Vector2?, Double) -> Unit)

    var godot_vector2_slide: ((Vector2?, Vector2?) -> Vector2)

    var godot_vector2_snapped: ((Vector2?, Vector2?) -> Vector2)

    var godot_vector2_tangent: ((Vector2?) -> Vector2)

    var godot_vector3_abs: ((Vector3?) -> Vector3)

    var godot_vector3_angle_to: ((Vector3?, Vector3?) -> Double)

    var godot_vector3_as_string: ((Vector3?) -> String)

    var godot_vector3_bounce: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_ceil: ((Vector3?) -> Vector3)

    var godot_vector3_cross: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_cubic_interpolate: ((Vector3?, Vector3?, Vector3?, Vector3?, Double) -> Vector3)

    var godot_vector3_distance_squared_to: ((Vector3?, Vector3?) -> Double)

    var godot_vector3_distance_to: ((Vector3?, Vector3?) -> Double)

    var godot_vector3_dot: ((Vector3?, Vector3?) -> Double)

    var godot_vector3_floor: ((Vector3?) -> Vector3)

    var godot_vector3_get_axis: ((Vector3?, godot_vector3_axis) -> Double)

    var godot_vector3_inverse: ((Vector3?) -> Vector3)

    var godot_vector3_is_normalized: ((Vector3?) -> Boolean)

    var godot_vector3_length: ((Vector3?) -> Double)

    var godot_vector3_length_squared: ((Vector3?) -> Double)

    var godot_vector3_linear_interpolate: ((Vector3?, Vector3?, Double) -> Vector3)

    var godot_vector3_max_axis: ((Vector3?) -> Int)

    var godot_vector3_min_axis: ((Vector3?) -> Int)

    var godot_vector3_new: ((Double, Double, Double) -> Long)

    var godot_vector3_normalized: ((Vector3?) -> Vector3)

    var godot_vector3_operator_add: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_operator_divide_scalar: ((Vector3?, Double) -> Vector3)

    var godot_vector3_operator_divide_vector: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_operator_equal: ((Vector3?, Vector3?) -> Boolean)

    var godot_vector3_operator_less: ((Vector3?, Vector3?) -> Boolean)

    var godot_vector3_operator_multiply_scalar: ((Vector3?, Double) -> Vector3)

    var godot_vector3_operator_multiply_vector: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_operator_neg: ((Vector3?) -> Vector3)

    var godot_vector3_operator_subtract: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_outer: ((Vector3?, Vector3?) -> Basis)

    var godot_vector3_reflect: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_rotated: ((Vector3?, Vector3?, Double) -> Vector3)

    var godot_vector3_set_axis: ((Vector3?, godot_vector3_axis, Double) -> Unit)

    var godot_vector3_slide: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_snapped: ((Vector3?, Vector3?) -> Vector3)

    var godot_vector3_to_diagonal_matrix: ((Vector3?) -> Basis)

    var next: godot_gdnative_api_struct?

    var num_extensions: Int

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_ext_android_api_struct {
    var godot_android_get_activity: Any?

    var godot_android_get_env: Any?

    var godot_android_get_surface: Any?

    var godot_android_is_activity_resumed: Any?

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_ext_arvr_api_struct {
    var godot_arvr_add_controller: ((String?, Int, Boolean, Boolean) -> Int)

    var godot_arvr_blit: ((Int, RID?, Rect2?) -> Unit)

    var godot_arvr_get_controller_rumble: ((Int) -> Double)

    var godot_arvr_get_reference_frame: Any?

    var godot_arvr_get_texid: ((RID?) -> Int)

    var godot_arvr_get_worldscale: Any?

    var godot_arvr_register_interface: ((godot_arvr_interface_gdnative?) -> Unit)

    var godot_arvr_remove_controller: ((Int) -> Unit)

    var godot_arvr_set_controller_axis: ((Int, Int, Double, Boolean) -> Unit)

    var godot_arvr_set_controller_button: ((Int, Int, Boolean) -> Unit)

    var godot_arvr_set_controller_transform: ((Int, Transform?, Boolean, Boolean) -> Unit)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_ext_nativescript_1_1_api_struct {
    var godot_nativescript_get_global_type_tag: ((Int, String?) -> Any?)

    var godot_nativescript_get_instance_binding_data: ((Int, Any?) -> Any?)

    var godot_nativescript_get_type_tag: ((Any?) -> Any?)

    var godot_nativescript_profiling_add_data: ((String?, Long) -> Unit)

    var godot_nativescript_register_instance_binding_data_functions: ((godot_instance_binding_functions) -> Int)

    var godot_nativescript_set_class_documentation: ((Any?, String?, String) -> Unit)

    var godot_nativescript_set_global_type_tag: ((Int, String?, Any?) -> Unit)

    var godot_nativescript_set_method_argument_information: ((Any?, String?, String?, Int, godot_method_arg?) -> Unit)

    var godot_nativescript_set_method_documentation: ((Any?, String?, String?, String) -> Unit)

    var godot_nativescript_set_property_documentation: ((Any?, String?, String?, String) -> Unit)

    var godot_nativescript_set_signal_documentation: ((Any?, String?, String?, String) -> Unit)

    var godot_nativescript_set_type_tag: ((Any?, String?, Any?) -> Unit)

    var godot_nativescript_unregister_instance_binding_data_functions: ((Int) -> Unit)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_ext_nativescript_api_struct {
    var godot_nativescript_get_userdata: ((Any?) -> Any?)

    var godot_nativescript_register_class: ((Any?, String?, String?, godot_instance_create_func, godot_instance_destroy_func) -> Unit)

    var godot_nativescript_register_method: ((Any?, String?, String?, godot_method_attributes, godot_instance_method) -> Unit)

    var godot_nativescript_register_property: ((Any?, String?, String?, godot_property_attributes?, godot_property_set_func, godot_property_get_func) -> Unit)

    var godot_nativescript_register_signal: ((Any?, String?, godot_signal?) -> Unit)

    var godot_nativescript_register_tool_class: ((Any?, String?, String?, godot_instance_create_func, godot_instance_destroy_func) -> Unit)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_ext_net_3_2_api_struct {
    var godot_net_bind_webrtc_data_channel: ((Any?, godot_net_webrtc_data_channel?) -> Unit)

    var godot_net_bind_webrtc_peer_connection: ((Any?, godot_net_webrtc_peer_connection?) -> Unit)

    var godot_net_set_webrtc_library: ((godot_net_webrtc_library?) -> godot_error)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_ext_net_api_struct {
    var godot_net_bind_multiplayer_peer: ((Any?, godot_net_multiplayer_peer?) -> Unit)

    var godot_net_bind_packet_peer: ((Any?, godot_net_packet_peer?) -> Unit)

    var godot_net_bind_stream_peer: ((Any?, godot_net_stream_peer?) -> Unit)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_ext_pluginscript_api_struct {
    var godot_pluginscript_register_language: ((godot_pluginscript_language_desc?) -> Unit)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_ext_videodecoder_api_struct {
    var godot_videodecoder_file_read: ((Any?, Int?, Int) -> Int)

    var godot_videodecoder_file_seek: ((Any?, Long, Int) -> Long)

    var godot_videodecoder_register_decoder: ((godot_videodecoder_interface_gdnative?) -> Unit)

    var next: godot_gdnative_api_struct?

    var type: Int

    val version: godot_gdnative_api_version
}

interface godot_gdnative_init_options {
    var active_library_path: String?

    var api_struct: godot_gdnative_core_api_struct?

    var core_api_hash: Long

    var editor_api_hash: Long

    var gd_native_library: Any?

    var in_editor: Boolean

    var no_api_hash: Long

    var report_loading_error: ((Any?, String?) -> Unit)

    var report_version_mismatch: ((Any?, String?, godot_gdnative_api_version, godot_gdnative_api_version) -> Unit)
}

interface godot_gdnative_terminate_options {
    var in_editor: Boolean
}

interface godot_instance_binding_functions {
    var alloc_instance_binding_data: ((Any?, Any?, Any?) -> Any?)

    var data: Any?

    var free_func: ((Any?) -> Unit)

    var free_instance_binding_data: ((Any?, Any?) -> Unit)

    var refcount_decremented_instance_binding: ((Any?, Any?) -> Boolean)

    var refcount_incremented_instance_binding: ((Any?, Any?) -> Unit)
}

interface godot_instance_create_func {
    var create_func: ((Any?, Any?) -> Any?)

    var free_func: ((Any?) -> Unit)

    var method_data: Any?
}

interface godot_instance_destroy_func {
    var destroy_func: ((Any?, Any?, Any?) -> Unit)

    var free_func: ((Any?) -> Unit)

    var method_data: Any?
}

interface godot_instance_method {
    var free_func: ((Any?) -> Unit)

    var method: ((Any?, Any?, Any?, Int, Variant?) -> Variant)

    var method_data: Any?
}

interface godot_method_arg {
    var hint: godot_property_hint

    val hint_string: String

    val name: String

    var type: godot_variant_type
}

interface godot_method_attributes {
    var rpc_type: Int
}

class godot_method_bind

interface godot_net_multiplayer_peer {
    var data: Any?

    var get_available_packet_count: ((Any?) -> Int)

    var get_connection_status: ((Any?) -> Int)

    var get_max_packet_size: ((Any?) -> Int)

    var get_packet: ((Any?, Int?, Int?) -> godot_error)

    var get_packet_peer: ((Any?) -> Int)

    var get_transfer_mode: ((Any?) -> Int)

    var get_unique_id: ((Any?) -> Int)

    var is_refusing_new_connections: ((Any?) -> Boolean)

    var is_server: ((Any?) -> Boolean)

    var next: Any?

    var poll: ((Any?) -> Unit)

    var put_packet: ((Any?, Int?, Int) -> godot_error)

    var set_refuse_new_connections: ((Boolean) -> Long)

    var set_target_peer: ((Any?, Int) -> Unit)

    var set_transfer_mode: ((Any?, Int) -> Unit)

    val version: godot_gdnative_api_version
}

interface godot_net_packet_peer {
    var data: Any?

    var get_available_packet_count: ((Any?) -> Int)

    var get_max_packet_size: ((Any?) -> Int)

    var get_packet: ((Any?, Int?, Int?) -> godot_error)

    var next: Any?

    var put_packet: ((Any?, Int?, Int) -> godot_error)

    val version: godot_gdnative_api_version
}

interface godot_net_stream_peer {
    var data: Any?

    var get_available_bytes: ((Any?) -> Int)

    var get_data: ((Any?, Int?, Int) -> godot_error)

    var get_partial_data: ((Any?, Int?, Int, Int?) -> godot_error)

    var next: Any?

    var put_data: ((Any?, Int?, Int) -> godot_error)

    var put_partial_data: ((Any?, Int?, Int, Int?) -> godot_error)

    val version: godot_gdnative_api_version
}

interface godot_net_webrtc_data_channel {
    var close: ((Any?) -> Unit)

    var data: Any?

    var get_available_packet_count: ((Any?) -> Int)

    var get_id: ((Any?) -> Int)

    var get_label: ((Any?) -> String?)

    var get_max_packet_life_time: ((Any?) -> Int)

    var get_max_packet_size: ((Any?) -> Int)

    var get_max_retransmits: ((Any?) -> Int)

    var get_packet: ((Any?, Int?, Int?) -> godot_error)

    var get_protocol: ((Any?) -> String?)

    var get_ready_state: ((Any?) -> Int)

    var get_write_mode: ((Any?) -> Int)

    var is_negotiated: ((Any?) -> Boolean)

    var is_ordered: ((Any?) -> Boolean)

    var next: Any?

    var poll: ((Any?) -> godot_error)

    var put_packet: ((Any?, Int?, Int) -> godot_error)

    var set_write_mode: ((Any?, Int) -> Unit)

    val version: godot_gdnative_api_version

    var was_string_packet: ((Any?) -> Boolean)
}

interface godot_net_webrtc_library {
    var create_peer_connection: ((Any?) -> godot_error)

    var next: Any?

    var unregistered: Any?

    val version: godot_gdnative_api_version
}

interface godot_net_webrtc_peer_connection {
    var add_ice_candidate: ((Any?, String?, Int, String?) -> godot_error)

    var close: ((Any?) -> Unit)

    var create_answer: ((Any?) -> godot_error)

    var create_data_channel: ((Any?, String?, Dictionary?) -> Any?)

    var create_offer: ((Any?) -> godot_error)

    var data: Any?

    var get_connection_state: ((Any?) -> Int)

    var initialize: ((Any?, Dictionary?) -> godot_error)

    var next: Any?

    var poll: ((Any?) -> godot_error)

    var set_local_description: ((Any?, String?, String?) -> godot_error)

    var set_remote_description: ((Any?, String?, String?) -> godot_error)

    val version: godot_gdnative_api_version
}

interface godot_pluginscript_instance_desc {
    var call_method: ((Any?, godot_string_name?, Variant?, Int, godot_variant_call_error?) -> Variant)

    var finish: ((Any?) -> Unit)

    var get_prop: ((Any?, String?, Variant?) -> Boolean)

    var get_rpc_mode: ((Any?, String?) -> Int)

    var get_rset_mode: ((Any?, String?) -> Int)

    var init: ((Any?, Any?) -> Any?)

    var notification: ((Any?, Int) -> Unit)

    var refcount_decremented: ((Any?) -> Boolean)

    var refcount_incremented: ((Any?) -> Unit)

    var set_prop: ((Any?, String?, Variant?) -> Boolean)
}

interface godot_pluginscript_language_desc {
    var add_global_constant: ((Any?, String?, Variant?) -> Unit)

    var auto_indent_code: ((Any?, String?, Int, Int) -> Unit)

    var comment_delimiters: String?

    var complete_code: ((Any?, String?, String?, Any?, GDArray?, Boolean?, String?) -> godot_error)

    var debug_get_error: ((Any?) -> String)

    var debug_get_globals: ((Any?, PoolStringArray?, GDArray?, Int, Int) -> Unit)

    var debug_get_stack_level_count: ((Any?) -> Int)

    var debug_get_stack_level_function: ((Any?, Int) -> String)

    var debug_get_stack_level_line: ((Any?, Int) -> Int)

    var debug_get_stack_level_locals: ((Any?, Int, PoolStringArray?, GDArray?, Int, Int) -> Unit)

    var debug_get_stack_level_members: ((Any?, Int, PoolStringArray?, GDArray?, Int, Int) -> Unit)

    var debug_get_stack_level_source: ((Any?, Int) -> String)

    var debug_parse_stack_level_expression: ((Any?, Int, String?, Int, Int) -> String)

    var extension: String?

    var find_function: ((Any?, String?, String?) -> Int)

    var finish: ((Any?) -> Unit)

    var get_public_constants: ((Any?, Dictionary?) -> Unit)

    var get_public_functions: ((Any?, GDArray?) -> Unit)

    var get_template_source_code: ((Any?, String?, String?) -> String)

    var has_named_classes: Boolean

    var init: Any?

    var make_function: ((Any?, String?, String?, PoolStringArray?) -> String)

    var name: String?

    var profiling_frame: ((Any?) -> Unit)

    var profiling_get_accumulated_data: ((Any?, godot_pluginscript_profiling_data?, Int) -> Int)

    var profiling_get_frame_data: ((Any?, godot_pluginscript_profiling_data?, Int) -> Int)

    var profiling_start: ((Any?) -> Unit)

    var profiling_stop: ((Any?) -> Unit)

    var recognized_extensions: String?

    var reserved_words: String?

    val script_desc: godot_pluginscript_script_desc

    var string_delimiters: String?

    var supports_builtin_mode: Boolean

    var type: String?

    var validate: ((Any?, String?, Int?, Int?, String?, String?, PoolStringArray?) -> Boolean)
}

interface godot_pluginscript_profiling_data {
    var call_count: Int

    var self_time: Int

    val signature: godot_string_name

    var total_time: Int
}

interface godot_pluginscript_script_desc {
    var finish: ((Any?) -> Unit)

    var init: ((Any?, String?, String?, godot_error?) -> godot_pluginscript_script_manifest)

    val instance_desc: godot_pluginscript_instance_desc
}

interface godot_pluginscript_script_manifest {
    val base: godot_string_name

    var data: Any?

    var is_tool: Boolean

    val member_lines: Dictionary

    val methods: GDArray

    val name: godot_string_name

    val properties: GDArray

    val signals: GDArray
}

class godot_pool_array_read_access

class godot_pool_array_write_access

interface godot_property_attributes {
    val default_value: Variant

    var hint: godot_property_hint

    val hint_string: String

    var rset_type: Int

    var type: Int

    var usage: Int
}

interface godot_property_get_func {
    var free_func: ((Any?) -> Unit)

    var get_func: ((Any?, Any?, Any?) -> Variant)

    var method_data: Any?
}

interface godot_property_set_func {
    var free_func: ((Any?) -> Unit)

    var method_data: Any?

    var set_func: ((Any?, Any?, Any?, Variant?) -> Unit)
}

interface godot_signal {
    var args: godot_signal_argument?

    var default_args: Variant?

    val name: String

    var num_args: Int

    var num_default_args: Int
}

interface godot_signal_argument {
    val default_value: Variant

    var hint: godot_property_hint

    val hint_string: String

    val name: String

    var type: Int

    var usage: Int
}

class godot_string_name

interface godot_variant_call_error {
    var argument: Int

    var error: godot_variant_call_error_error

    var expected: godot_variant_type
}

interface godot_videodecoder_interface_gdnative {
    var constructor: ((Any?) -> Any?)?

    var destructor: (Any?) -> Unit?

    public var get_audioframe: ((Any?, Float?, Int) -> Int)

    public var get_channels: ((Any?) -> Int)

    public var get_length: ((Any?) -> Float)

    public var get_mix_rate: ((Any?) -> Int)

    public var get_playback_position: ((Any?) -> Float)

    public var get_plugin_name: (() -> String?)

    public var get_supported_extensions: ((Int?) -> String)?

    public var get_texture_size: ((Any?) -> Vector2)

    public var get_videoframe: ((Any?) -> PoolByteArray?)

    public var next: Any?

    public var open_file: ((Any?, Any?) -> Boolean)

    public var seek: ((Any?, Float) -> Unit)

    public var set_audio_track: ((Any?, Int) -> Unit)

    public var update: ((Any?, Float) -> Unit)

    public val version: godot_gdnative_api_version
}

