package godot.gdnative

import godot.core.*

var api: godot_gdnative_core_api_struct? = null

external fun godot_array_new_pool_byte_array(p_pba: PoolByteArray?): Long

external fun godot_array_new_pool_color_array(p_pca: PoolColorArray?): Long

external fun godot_array_new_pool_int_array(p_pia: PoolIntArray?): Long

external fun godot_array_new_pool_real_array(p_pra: PoolRealArray?): Long

external fun godot_array_new_pool_string_array(p_psa: PoolStringArray?): Long

external fun godot_array_new_pool_vector2_array(p_pv2a: PoolVector2Array?): Long

external fun godot_array_new_pool_vector3_array(p_pv3a: PoolVector3Array?): Long

external fun godot_array_operator_index(p_self: GDArray?, p_idx: Int): Variant?

external fun godot_array_operator_index_const(p_self: GDArray?, p_idx: Int): Variant?

external fun godot_array_pop_back(p_self: GDArray?): Variant

external fun godot_array_pop_front(p_self: GDArray?): Variant

external fun godot_array_push_back(p_self: GDArray?, p_value: Variant?)

external fun godot_array_push_front(p_self: GDArray?, p_value: Variant?)

external fun godot_array_remove(p_self: GDArray?, p_idx: Int)

external fun godot_array_resize(p_self: GDArray?, p_size: Int)

external fun godot_array_rfind(p_self: GDArray?, p_what: Variant?, p_from: Int): Int

external fun godot_array_set(p_self: GDArray?, p_idx: Int, p_value: Variant?)

external fun godot_array_shuffle(p_self: GDArray?)

external fun godot_array_size(p_self: GDArray?): Int

external fun godot_array_sort(p_self: GDArray?)

external fun godot_array_sort_custom(p_self: GDArray?, p_obj: Any?, p_func: String?)

external fun godot_arvr_add_controller(p_device_name: String?, p_hand: Int, p_tracks_orientation: Boolean, p_tracks_position: Boolean): Int

external fun godot_arvr_blit(p_eye: Int, p_render_target: RID?, p_rect: Rect2?)

external fun godot_arvr_get_controller_rumble(p_controller_id: Int): Double

external fun godot_arvr_get_reference_frame(): Transform

external fun godot_arvr_get_texid(p_render_target: RID?): Int

external fun godot_arvr_get_worldscale(): Double

external fun godot_arvr_register_interface(p_interface: godot_arvr_interface_gdnative?)

external fun godot_arvr_remove_controller(p_controller_id: Int)

external fun godot_arvr_set_controller_axis(p_controller_id: Int, p_axis: Int, p_value: Double, p_can_be_negative: Boolean)

external fun godot_arvr_set_controller_button(p_controller_id: Int, p_button: Int, p_is_pressed: Boolean)

external fun godot_arvr_set_controller_transform(p_controller_id: Int, p_transform: Transform?, p_tracks_orientation: Boolean, p_tracks_position: Boolean)

external fun godot_basis_as_string(p_self: Basis?): String

external fun godot_basis_determinant(p_self: Basis?): Double

external fun godot_basis_get_axis(p_self: Basis?, p_axis: Int): Vector3

external fun godot_basis_get_elements(p_self: Basis?, p_elements: Vector3?)

external fun godot_basis_get_euler(p_self: Basis?): Vector3

external fun godot_basis_get_orthogonal_index(p_self: Basis?): Int

external fun godot_basis_get_quat(p_self: Basis?): Quat

external fun godot_basis_get_row(p_self: Basis?, p_row: Int): Vector3

external fun godot_basis_get_scale(p_self: Basis?): Vector3

external fun godot_basis_inverse(p_self: Basis?): Basis

external fun godot_basis_new(): Long

external fun godot_basis_new_with_axis_and_angle(p_axis: Vector3?, p_phi: Double): Long

external fun godot_basis_new_with_euler(p_euler: Vector3?): Long

external fun godot_basis_new_with_euler_quat(p_euler: Quat?): Long

external fun godot_basis_new_with_rows(p_x_axis: Vector3?, p_y_axis: Vector3?, p_z_axis: Vector3?): Long

external fun godot_basis_operator_add(p_self: Basis?, p_b: Basis?): Basis

external fun godot_basis_operator_equal(p_self: Basis?, p_b: Basis?): Boolean

external fun godot_basis_operator_multiply_scalar(p_self: Basis?, p_b: Double): Basis

external fun godot_basis_operator_multiply_vector(p_self: Basis?, p_b: Basis?): Basis

external fun godot_basis_operator_subtract(p_self: Basis?, p_b: Basis?): Basis

external fun godot_basis_orthonormalized(p_self: Basis?): Basis

external fun godot_basis_rotated(p_self: Basis?, p_axis: Vector3?, p_phi: Double): Basis

external fun godot_basis_scaled(p_self: Basis?, p_scale: Vector3?): Basis

external fun godot_basis_set_axis(p_self: Basis?, p_axis: Int, p_value: Vector3?)

external fun godot_basis_set_axis_angle_scale(p_self: Basis?, p_axis: Vector3?, p_phi: Double, p_scale: Vector3?)

external fun godot_basis_set_euler_scale(p_self: Basis?, p_euler: Vector3?, p_scale: Vector3?)

external fun godot_basis_set_quat(p_self: Basis?, p_quat: Quat?)

external fun godot_basis_set_quat_scale(p_self: Basis?, p_quat: Quat?, p_scale: Vector3?)

external fun godot_basis_set_row(p_self: Basis?, p_row: Int, p_value: Vector3?)

external fun godot_basis_slerp(p_self: Basis?, p_b: Basis?, p_t: Double): Basis

external fun godot_basis_tdotx(p_self: Basis?, p_with: Vector3?): Double

external fun godot_basis_tdoty(p_self: Basis?, p_with: Vector3?): Double

external fun godot_basis_tdotz(p_self: Basis?, p_with: Vector3?): Double

external fun godot_basis_transposed(p_self: Basis?): Basis

external fun godot_basis_xform(p_self: Basis?, p_v: Vector3?): Vector3

external fun godot_basis_xform_inv(p_self: Basis?, p_v: Vector3?): Vector3

external fun godot_char_string_destroy(p_cs: Long?)

external fun godot_char_string_get_data(p_cs: Long?): String?

external fun godot_char_string_length(p_cs: Long?): Int

external fun godot_color_as_string(p_self: Color?): String

external fun godot_color_blend(p_self: Color?, p_over: Color?): Color

external fun godot_color_contrasted(p_self: Color?): Color

external fun godot_color_darkened(p_self: Color?, p_amount: Double): Color

external fun godot_color_from_hsv(p_self: Color?, p_h: Double, p_s: Double, p_v: Double, p_a: Double): Color

external fun godot_color_get_a(p_self: Color?): Double

external fun godot_color_get_b(p_self: Color?): Double

external fun godot_color_get_g(p_self: Color?): Double

external fun godot_color_get_h(p_self: Color?): Double

external fun godot_color_get_r(p_self: Color?): Double

external fun godot_color_get_s(p_self: Color?): Double

external fun godot_color_get_v(p_self: Color?): Double

external fun godot_color_gray(p_self: Color?): Double

external fun godot_color_inverted(p_self: Color?): Color

external fun godot_color_lightened(p_self: Color?, p_amount: Double): Color

external fun godot_color_linear_interpolate(p_self: Color?, p_b: Color?, p_t: Double): Color

external fun godot_color_new_rgb(p_r: Double, p_g: Double, p_b: Double): Long

external fun godot_color_new_rgba(p_r: Double, p_g: Double, p_b: Double, p_a: Double): Long

external fun godot_color_operator_equal(p_self: Color?, p_b: Color?): Boolean

external fun godot_color_operator_less(p_self: Color?, p_b: Color?): Boolean

external fun godot_color_set_a(p_self: Color?, a: Double)

external fun godot_color_set_b(p_self: Color?, b: Double)

external fun godot_color_set_g(p_self: Color?, g: Double)

external fun godot_color_set_r(p_self: Color?, r: Double)

external fun godot_color_to_abgr32(p_self: Color?): Int

external fun godot_color_to_abgr64(p_self: Color?): Int

external fun godot_color_to_argb32(p_self: Color?): Int

external fun godot_color_to_argb64(p_self: Color?): Int

external fun godot_color_to_html(p_self: Color?, p_with_alpha: Boolean): String

external fun godot_color_to_rgba32(p_self: Color?): Int

external fun godot_color_to_rgba64(p_self: Color?): Int

external fun godot_dictionary_clear(p_self: Dictionary?)

external fun godot_dictionary_destroy(p_self: Dictionary?)

external fun godot_dictionary_duplicate(p_self: Dictionary?, p_deep: Boolean): Dictionary

external fun godot_dictionary_empty(p_self: Dictionary?): Boolean

external fun godot_dictionary_erase(p_self: Dictionary?, p_key: Variant?)

external fun godot_dictionary_erase_with_return(p_self: Dictionary?, p_key: Variant?): Boolean

external fun godot_dictionary_get(p_self: Dictionary?, p_key: Variant?): Variant

external fun godot_dictionary_get_with_default(p_self: Dictionary?, p_key: Variant?, p_default: Variant?): Variant

external fun godot_dictionary_has(p_self: Dictionary?, p_key: Variant?): Boolean

external fun godot_dictionary_has_all(p_self: Dictionary?, p_keys: GDArray?): Boolean

external fun godot_dictionary_hash(p_self: Dictionary?): Int

external fun godot_dictionary_keys(p_self: Dictionary?): GDArray

external fun godot_dictionary_new(): Long

external fun godot_dictionary_new_copy(p_src: Dictionary?): Long

external fun godot_dictionary_next(p_self: Dictionary?, p_key: Variant?): Variant?

external fun godot_dictionary_operator_equal(p_self: Dictionary?, p_b: Dictionary?): Boolean

external fun godot_dictionary_operator_index(p_self: Dictionary?, p_key: Variant?): Variant?

external fun godot_dictionary_operator_index_const(p_self: Dictionary?, p_key: Variant?): Variant?

external fun godot_dictionary_set(p_self: Dictionary?, p_key: Variant?, p_value: Variant?)

external fun godot_dictionary_size(p_self: Dictionary?): Int

external fun godot_dictionary_to_json(p_self: Dictionary?): String

external fun godot_dictionary_values(p_self: Dictionary?): GDArray

external fun godot_free(p_ptr: Any?)

external fun godot_get_global_constants(): Dictionary

external fun godot_global_get_singleton(p_name: String?): Any?

external fun godot_variant_as_pool_real_array(p_self: Variant?): PoolRealArray

external fun godot_variant_as_pool_string_array(p_self: Variant?): PoolStringArray

external fun godot_variant_as_pool_vector2_array(p_self: Variant?): PoolVector2Array

external fun godot_variant_as_pool_vector3_array(p_self: Variant?): PoolVector3Array

external fun godot_variant_as_quat(p_self: Variant?): Quat

external fun godot_variant_as_real(p_self: Variant?): Double

external fun godot_variant_as_rect2(p_self: Variant?): Rect2

external fun godot_variant_as_rid(p_self: Variant?): RID

external fun godot_variant_as_string(p_self: Variant?): String

external fun godot_variant_as_transform(p_self: Variant?): Transform

external fun godot_variant_as_transform2d(p_self: Variant?): Transform2D

external fun godot_variant_as_uint(p_self: Variant?): Long

external fun godot_variant_as_vector2(p_self: Variant?): Vector2

external fun godot_variant_as_vector3(p_self: Variant?): Vector3

external fun godot_variant_booleanize(p_self: Variant?): Boolean

external fun godot_variant_call(p_self: Variant?, p_method: String?, p_args: Array<Variant>, p_argcount: Int): Variant

external fun godot_variant_destroy(p_self: Variant?)

external fun godot_variant_evaluate(p_op: godot_variant_operator, p_a: Variant?, p_b: Variant?, r_ret: Variant?, r_valid: Boolean?)

external fun godot_variant_get_operator_name(p_op: godot_variant_operator): String

external fun godot_variant_get_type(p_v: Variant?): Int

external fun godot_variant_has_method(p_self: Variant?, p_method: String?): Boolean

external fun godot_variant_hash_compare(p_self: Variant?, p_other: Variant?): Boolean

external fun godot_variant_new_aabb(p_aabb: AABB?): Long

external fun godot_variant_new_array(p_arr: GDArray?): Long

external fun godot_variant_new_basis(p_basis: Basis?): Long

external fun godot_variant_new_bool(p_b: Boolean ): Long

external fun godot_variant_new_color(p_color: Color?): Long

external fun godot_variant_new_copy(p_src: Variant?): Long

external fun godot_variant_new_dictionary(p_dict: Dictionary?): Long

external fun godot_variant_new_int(p_i: Long): Long

external fun godot_variant_new_nil(): Long

external fun godot_variant_new_node_path(p_np: NodePath?): Long

external fun godot_variant_new_object(p_obj: Any?): Long

external fun godot_variant_new_plane(p_plane: Plane?): Long

external fun godot_variant_new_pool_byte_array(p_pba: PoolByteArray?): Long

external fun godot_variant_new_pool_color_array(p_pca: PoolColorArray?): Long

external fun godot_variant_new_pool_int_array(p_pia: PoolIntArray?): Long

external fun godot_variant_new_pool_real_array(p_pra: PoolRealArray?): Long

external fun godot_variant_new_pool_string_array(p_psa: PoolStringArray?): Long

external fun godot_variant_new_pool_vector2_array(p_pv2a: PoolVector2Array?): Long

external fun godot_variant_new_pool_vector3_array(p_pv3a: PoolVector3Array?): Long

external fun godot_variant_new_quat(p_quat: Quat?): Long

external fun godot_variant_new_real(p_r: Double): Long

external fun godot_variant_new_rect2(p_rect2: Rect2?): Long

external fun godot_variant_new_rid(p_rid: RID?): Long

external fun godot_variant_new_string(p_s: String?): Long

external fun godot_variant_new_transform(p_trans: Transform?): Long

external fun godot_variant_new_transform2d(p_t2d: Transform2D?): Long

external fun godot_variant_new_uint(p_i: Long): Long

external fun godot_variant_new_vector2(p_v2: Vector2?): Long

external fun godot_variant_new_vector3(p_v3: Vector3?): Long

external fun godot_variant_operator_equal(p_self: Long?, p_other: Long?): Boolean

external fun godot_variant_operator_less(p_self: Long?, p_other: Long?): Boolean

external fun godot_vector2_abs(p_self: Vector2?): Vector2

external fun godot_vector2_angle(p_self: Vector2?): Double

external fun godot_vector2_angle_to(p_self: Vector2?, p_to: Vector2?): Double

external fun godot_vector2_angle_to_point(p_self: Vector2?, p_to: Vector2?): Double

external fun godot_vector2_as_string(p_self: Vector2?): String

external fun godot_vector2_aspect(p_self: Vector2?): Double

external fun godot_vector2_bounce(p_self: Vector2?, p_n: Vector2?): Vector2

external fun godot_vector2_clamped(p_self: Vector2?, p_length: Double ): Vector2

external fun godot_vector2_cubic_interpolate(p_self: Vector2?, p_b: Vector2?, p_pre_a: Vector2?, p_post_b: Vector2?, p_t: Double ): Vector2

external fun godot_vector2_distance_squared_to(p_self: Vector2?, p_to: Vector2?): Double

external fun godot_vector2_distance_to(p_self: Vector2?, p_to: Vector2?): Double

external fun godot_vector2_dot(p_self: Vector2?, p_with: Vector2?): Double

external fun godot_vector2_floor(p_self: Vector2?): Vector2

external fun godot_vector2_get_x(p_self: Vector2?): Double

external fun godot_vector2_get_y(p_self: Vector2?): Double

external fun godot_vector2_is_normalized(p_self: Vector2?): Boolean

external fun godot_vector2_length(p_self: Vector2?): Double

external fun godot_vector2_length_squared(p_self: Vector2?): Double

external fun godot_vector2_linear_interpolate(p_self: Vector2?, p_b: Vector2?, p_t: Double ): Vector2

external fun godot_vector2_move_toward(p_self: Vector2?, p_to: Vector2?, p_delta: Double ): Vector2

external fun godot_vector2_new(p_x: Double , p_y: Double ): Long

external fun godot_vector2_normalized(p_self: Vector2?): Vector2

external fun godot_vector2_operator_add(p_self: Vector2?, p_b: Vector2?): Vector2

external fun godot_vector2_operator_divide_scalar(p_self: Vector2?, p_b: Double ): Vector2

external fun godot_vector2_operator_divide_vector(p_self: Vector2?, p_b: Vector2?): Vector2

external fun godot_vector2_operator_equal(p_self: Vector2?, p_b: Vector2?): Boolean

external fun godot_vector2_operator_less(p_self: Vector2?, p_b: Vector2?): Boolean

external fun godot_vector2_operator_multiply_scalar(p_self: Vector2?, p_b: Double ): Vector2

external fun godot_vector2_operator_multiply_vector(p_self: Vector2?, p_b: Vector2?): Vector2

external fun godot_vector2_operator_neg(p_self: Vector2?): Vector2

external fun godot_vector2_operator_subtract(p_self: Vector2?, p_b: Vector2?): Vector2

external fun godot_vector2_reflect(p_self: Vector2?, p_n: Vector2?): Vector2

external fun godot_vector2_rotated(p_self: Vector2?, p_phi: Double ): Vector2

external fun godot_vector2_set_x(p_self: Vector2?, p_x: Double )

external fun godot_vector2_set_y(p_self: Vector2?, p_y: Double )

external fun godot_vector2_slide(p_self: Vector2?, p_n: Vector2?): Vector2

external fun godot_vector2_snapped(p_self: Vector2?, p_by: Vector2?): Vector2

external fun godot_vector2_tangent(p_self: Vector2?): Vector2

external fun godot_vector3_abs(p_self: Vector3?): Vector3

external fun godot_vector3_angle_to(p_self: Vector3?, p_to: Vector3?): Double

external fun godot_vector3_as_string(p_self: Vector3?): String

external fun godot_vector3_bounce(p_self: Vector3?, p_n: Vector3?): Vector3

external fun godot_vector3_ceil(p_self: Vector3?): Vector3

external fun godot_vector3_cross(p_self: Vector3?, p_b: Vector3?): Vector3

external fun godot_vector3_cubic_interpolate(p_self: Vector3?, p_b: Vector3?, p_pre_a: Vector3?, p_post_b: Vector3?, p_t: Double ): Vector3

external fun godot_vector3_distance_squared_to(p_self: Vector3?, p_b: Vector3?): Double

external fun godot_vector3_distance_to(p_self: Vector3?, p_b: Vector3?): Double

external fun godot_vector3_dot(p_self: Vector3?, p_b: Vector3?): Double

external fun godot_vector3_floor(p_self: Vector3?): Vector3

external fun godot_vector3_get_axis(p_self: Vector3?, p_axis: godot_vector3_axis): Double

external fun godot_vector3_inverse(p_self: Vector3?): Vector3

external fun godot_vector3_is_normalized(p_self: Vector3?): Boolean

external fun godot_vector3_length(p_self: Vector3?): Double

external fun godot_vector3_length_squared(p_self: Vector3?): Double

external fun godot_vector3_linear_interpolate(p_self: Vector3?, p_b: Vector3?, p_t: Double ): Vector3

external fun godot_vector3_max_axis(p_self: Vector3?): Int

external fun godot_vector3_min_axis(p_self: Vector3?): Int

external fun godot_vector3_move_toward(p_self: Vector3?, p_to: Vector3?, p_delta: Double ): Vector3

external fun godot_vector3_new(p_x: Double , p_y: Double , p_z: Double ): Long

external fun godot_vector3_normalized(p_self: Vector3?): Vector3

external fun godot_vector3_operator_add(p_self: Vector3?, p_b: Vector3?): Vector3

external fun godot_vector3_operator_divide_scalar(p_self: Vector3?, p_b: Double ): Vector3

external fun godot_vector3_operator_divide_vector(p_self: Vector3?, p_b: Vector3?): Vector3

external fun godot_vector3_operator_equal(p_self: Vector3?, p_b: Vector3?): Boolean

external fun godot_vector3_operator_less(p_self: Vector3?, p_b: Vector3?): Boolean

external fun godot_vector3_operator_multiply_scalar(p_self: Vector3?, p_b: Double ): Vector3

external fun godot_vector3_operator_multiply_vector(p_self: Vector3?, p_b: Vector3?): Vector3

external fun godot_vector3_operator_neg(p_self: Vector3?): Vector3

external fun godot_vector3_operator_subtract(p_self: Vector3?, p_b: Vector3?): Vector3

external fun godot_vector3_outer(p_self: Vector3?, p_b: Vector3?): Basis

external fun godot_vector3_reflect(p_self: Vector3?, p_n: Vector3?): Vector3

external fun godot_vector3_rotated(p_self: Vector3?, p_axis: Vector3?, p_phi: Double ): Vector3

external fun godot_vector3_set_axis(p_self: Vector3?, p_axis: godot_vector3_axis, p_val: Double )

external fun godot_vector3_slide(p_self: Vector3?, p_n: Vector3?): Vector3

external fun godot_vector3_snapped(p_self: Vector3?, p_by: Vector3?): Vector3
external fun godot_string_nocasecmp_to(p_self: String?, p_str: String?): String

external fun godot_string_num(p_num: Double): String

external fun godot_string_num_int64(p_num: Long, p_base: Int): String

external fun godot_string_num_int64_capitalized(p_num: Long, p_base: Int, p_capitalize_hex: Boolean): String

external fun godot_string_num_real(p_num: Double): String

external fun godot_string_num_scientific(p_num: Double): String

external fun godot_string_num_with_decimals(p_num: Double, p_decimals: Int): String

external fun godot_string_operator_equal(p_self: String?, p_b: String?): Boolean

external fun godot_string_operator_index(p_self: String?, p_idx: Int): Char?

external fun godot_string_operator_index_const(p_self: String?, p_idx: Int): Char

external fun godot_string_operator_less(p_self: String?, p_b: String?): Boolean

external fun godot_string_operator_plus(p_self: String?, p_b: String?): String

external fun godot_string_ord_at(p_self: String?, p_idx: Int): Char

external fun godot_string_pad_decimals(p_self: String?, p_digits: Int): String

external fun godot_string_pad_zeros(p_self: String?, p_digits: Int): String

external fun godot_string_parse_utf8(p_self: String?, p_utf8: String?): Boolean

external fun godot_string_parse_utf8_with_len(p_self: String?, p_utf8: String?, p_len: Int): Boolean

external fun godot_string_path_to(p_self: String?, p_path: String?): String

external fun godot_string_path_to_file(p_self: String?, p_path: String?): String

external fun godot_string_percent_decode(p_self: String?): String

external fun godot_string_percent_encode(p_self: String?): String

external fun godot_string_plus_file(p_self: String?, p_file: String?): String

external fun godot_string_replace(p_self: String?, p_key: String, p_with: String): String

external fun godot_string_replace_first(p_self: String?, p_key: String, p_with: String): String

external fun godot_string_replacen(p_self: String?, p_key: String, p_with: String): String

external fun godot_string_rfind(p_self: String?, p_what: String): Int

external fun godot_string_rfind_from(p_self: String?, p_what: String, p_from: Int): Int

external fun godot_string_rfindn(p_self: String?, p_what: String): Int

external fun godot_string_rfindn_from(p_self: String?, p_what: String, p_from: Int): Int

external fun godot_string_right(p_self: String?, p_pos: Int): String

external fun godot_string_rpad(p_self: String?, p_min_length: Int): String

external fun godot_string_rpad_with_custom_character(p_self: String?, p_min_length: Int, p_character: String?): String

external fun godot_string_rsplit(p_self: String?, p_divisor: String?, p_allow_empty: Boolean, p_maxsplit: Int): PoolStringArray

external fun godot_string_rstrip(p_self: String?, p_chars: String?): String

external fun godot_string_sha256_buffer(p_self: String?): PoolByteArray

external fun godot_string_sha256_text(p_self: String?): String

external fun godot_string_similarity(p_self: String?, p_string: String?): Double

external fun godot_string_simplify_path(p_self: String?): String

external fun godot_string_split(p_self: String?, p_splitter: String?): GDArray

external fun godot_string_split_allow_empty(p_self: String?, p_splitter: String?): GDArray

external fun godot_string_split_floats(p_self: String?, p_splitter: String?): GDArray

external fun godot_string_split_floats_allows_empty(p_self: String?, p_splitter: String?): GDArray

external fun godot_string_split_floats_mk(p_self: String?, p_splitters: GDArray?): GDArray

external fun godot_string_split_floats_mk_allows_empty(p_self: String?, p_splitters: GDArray?): GDArray

external fun godot_string_split_ints(p_self: String?, p_splitter: String?): GDArray

external fun godot_string_split_ints_allows_empty(p_self: String?, p_splitter: String?): GDArray

external fun godot_string_split_ints_mk(p_self: String?, p_splitters: GDArray?): GDArray

external fun godot_string_split_ints_mk_allows_empty(p_self: String?, p_splitters: GDArray?): GDArray

external fun godot_string_split_spaces(p_self: String?): GDArray

external fun godot_string_sprintf(p_self: String?, p_values: GDArray?, p_error: Boolean?): String

external fun godot_string_strip_edges(p_self: String?, p_left: Boolean, p_right: Boolean): String

external fun godot_string_strip_escapes(p_self: String?): String

external fun godot_string_substr(p_self: String?, p_from: Int, p_chars: Int): String

external fun godot_string_to_double(p_self: String?): Double

external fun godot_string_to_float(p_self: String?): Double

external fun godot_string_to_int(p_self: String?): Int

external fun godot_string_to_int64(p_self: String?): Long

external fun godot_string_to_lower(p_self: String?): String

external fun godot_string_to_upper(p_self: String?): String

external fun godot_string_trim_prefix(p_self: String?, p_prefix: String?): String

external fun godot_string_trim_suffix(p_self: String?, p_suffix: String?): String

external fun godot_string_unicode_char_to_double(p_str: Char?, r_end: Char?): Double

external fun godot_string_utf8(p_self: String?): String

external fun godot_string_wchar_to_int(p_str: Char?): Long

external fun godot_string_wide_str(p_self: String?): Char?

external fun godot_string_word_wrap(p_self: String?, p_chars_per_line: Int): String

external fun godot_string_xml_escape(p_self: String?): String

external fun godot_string_xml_escape_with_quotes(p_self: String?): String

external fun godot_string_xml_unescape(p_self: String?): String

external fun godot_transform2d_affine_inverse(p_self: Transform2D?): Transform2D

external fun godot_transform2d_as_string(p_self: Transform2D?): String

external fun godot_transform2d_basis_xform_inv_vector2(p_self: Transform2D?, p_v: Vector2?): Vector2

external fun godot_transform2d_basis_xform_vector2(p_self: Transform2D?, p_v: Vector2?): Vector2

external fun godot_transform2d_get_origin(p_self: Transform2D?): Vector2

external fun godot_transform2d_get_rotation(p_self: Transform2D?): Double

external fun godot_transform2d_get_scale(p_self: Transform2D?): Vector2

external fun godot_transform2d_interpolate_with(p_self: Transform2D?, p_m: Transform2D?, p_c: Double): Transform2D

external fun godot_transform2d_inverse(p_self: Transform2D?): Transform2D

external fun godot_transform2d_new(p_rot: Double, p_pos: Vector2?): Long

external fun godot_transform2d_new_axis_origin(p_x_axis: Vector2?, p_y_axis: Vector2?, p_origin: Vector2?): Long

external fun godot_transform2d_new_identity(): Long

external fun godot_transform2d_operator_equal(p_self: Transform2D?, p_b: Transform2D?): Boolean

external fun godot_transform2d_operator_multiply(p_self: Transform2D?, p_b: Transform2D?): Transform2D

external fun godot_transform2d_orthonormalized(p_self: Transform2D?): Transform2D

external fun godot_transform2d_rotated(p_self: Transform2D?, p_phi: Double): Transform2D

external fun godot_transform2d_scaled(p_self: Transform2D?, p_scale: Vector2?): Transform2D

external fun godot_transform2d_translated(p_self: Transform2D?, p_offset: Vector2?): Transform2D

external fun godot_transform2d_xform_inv_rect2(p_self: Transform2D?, p_v: Rect2?): Rect2

external fun godot_transform2d_xform_inv_vector2(p_self: Transform2D?, p_v: Vector2?): Vector2

external fun godot_transform2d_xform_rect2(p_self: Transform2D?, p_v: Rect2?): Rect2

external fun godot_transform2d_xform_vector2(p_self: Transform2D?, p_v: Vector2?): Vector2

external fun godot_transform_affine_inverse(p_self: Transform?): Transform

external fun godot_transform_as_string(p_self: Transform?): String

external fun godot_transform_get_basis(p_self: Transform?): Basis

external fun godot_transform_get_origin(p_self: Transform?): Vector3

external fun godot_transform_inverse(p_self: Transform?): Transform

external fun godot_transform_looking_at(p_self: Transform?, p_target: Vector3?, p_up: Vector3?): Transform

external fun godot_transform_new(p_basis: Basis?, p_origin: Vector3?): Long

external fun godot_transform_new_identity(): Long

external fun godot_transform_new_with_axis_origin(p_x_axis: Vector3?, p_y_axis: Vector3?, p_z_axis: Vector3?, p_origin: Vector3?): Long

external fun godot_transform_new_with_quat(p_quat: Quat?): Long

external fun godot_transform_operator_equal(p_self: Transform?, p_b: Transform?): Boolean

external fun godot_transform_operator_multiply(p_self: Transform?, p_b: Transform?): Transform

external fun godot_transform_orthonormalized(p_self: Transform?): Transform

external fun godot_transform_rotated(p_self: Transform?, p_axis: Vector3?, p_phi: Double): Transform

external fun godot_transform_scaled(p_self: Transform?, p_scale: Vector3?): Transform

external fun godot_transform_set_basis(p_self: Transform?, p_v: Basis?)

external fun godot_transform_set_origin(p_self: Transform?, p_v: Vector3?)

external fun godot_transform_translated(p_self: Transform?, p_ofs: Vector3?): Transform

external fun godot_transform_xform_aabb(p_self: Transform?, p_v: AABB?): AABB

external fun godot_transform_xform_inv_aabb(p_self: Transform?, p_v: AABB?): AABB

external fun godot_transform_xform_inv_plane(p_self: Transform?, p_v: Plane?): Plane

external fun godot_transform_xform_inv_vector3(p_self: Transform?, p_v: Vector3?): Vector3

external fun godot_transform_xform_plane(p_self: Transform?, p_v: Plane?): Plane

external fun godot_transform_xform_vector3(p_self: Transform?, p_v: Vector3?): Vector3

external fun godot_variant_as_aabb(p_self: Variant?): AABB

external fun godot_variant_as_array(p_self: Variant?): GDArray

external fun godot_variant_as_basis(p_self: Variant?): Basis

external fun godot_variant_as_bool(p_self: Variant?): Boolean

external fun godot_variant_as_color(p_self: Variant?): Color

external fun godot_variant_as_dictionary(p_self: Variant?): Dictionary

external fun godot_variant_as_int(p_self: Variant?): Long

external fun godot_variant_as_node_path(p_self: Variant?): NodePath

external fun godot_variant_as_object(p_self: Variant?): Any?

external fun godot_variant_as_plane(p_self: Variant?): Plane

external fun godot_variant_as_pool_byte_array(p_self: Variant?): PoolByteArray

external fun godot_variant_as_pool_color_array(p_self: Variant?): PoolColorArray

external fun godot_variant_as_pool_int_array(p_self: Variant?): PoolIntArray

external fun godot_quat_operator_subtract(p_self: Quat?, p_b: Quat?): Quat

external fun godot_quat_set_axis_angle(p_self: Quat?, p_axis: Vector3?, p_angle: Double)

external fun godot_quat_set_w(p_self: Quat?, `val`: Double)

external fun godot_quat_set_x(p_self: Quat?, `val`: Double)

external fun godot_quat_set_y(p_self: Quat?, `val`: Double)

external fun godot_quat_set_z(p_self: Quat?, `val`: Double)

external fun godot_quat_slerp(p_self: Quat?, p_b: Quat?, p_t: Double): Quat

external fun godot_quat_slerpni(p_self: Quat?, p_b: Quat?, p_t: Double): Quat

external fun godot_quat_xform(p_self: Quat?, p_v: Vector3?): Vector3

external fun godot_realloc(p_ptr: Any?, p_bytes: Int): Any?

external fun godot_rect2_abs(p_self: Rect2?): Rect2

external fun godot_rect2_as_string(p_self: Rect2?): String

external fun godot_rect2_clip(p_self: Rect2?, p_b: Rect2?): Rect2

external fun godot_rect2_encloses(p_self: Rect2?, p_b: Rect2?): Boolean

external fun godot_rect2_expand(p_self: Rect2?, p_to: Vector2?): Rect2

external fun godot_rect2_get_area(p_self: Rect2?): Double

external fun godot_rect2_get_position(p_self: Rect2?): Vector2

external fun godot_rect2_get_size(p_self: Rect2?): Vector2

external fun godot_rect2_grow(p_self: Rect2?, p_by: Double): Rect2

external fun godot_rect2_grow_individual(p_self: Rect2?, p_left: Double, p_top: Double, p_right: Double, p_bottom: Double): Rect2

external fun godot_rect2_grow_margin(p_self: Rect2?, p_margin: Int, p_by: Double): Rect2

external fun godot_rect2_has_no_area(p_self: Rect2?): Boolean

external fun godot_rect2_has_point(p_self: Rect2?, p_point: Vector2?): Boolean

external fun godot_rect2_intersects(p_self: Rect2?, p_b: Rect2?): Boolean

external fun godot_rect2_merge(p_self: Rect2?, p_b: Rect2?): Rect2

external fun godot_rect2_new(p_x: Double, p_y: Double, p_width: Double, p_height: Double): Long

external fun godot_rect2_new_with_position_and_size(p_pos: Vector2?, p_size: Vector2?): Long

external fun godot_rect2_operator_equal(p_self: Rect2?, p_b: Rect2?): Boolean

external fun godot_rect2_set_position(p_self: Rect2?, p_pos: Vector2?)

external fun godot_rect2_set_size(p_self: Rect2?, p_size: Vector2?)

external fun godot_register_native_call_type(p_call_type: String?, p_callback: ((Any?, GDArray?) -> Variant)?)

external fun godot_rid_get_id(p_self: RID?): Int

external fun godot_rid_new(): Long

external fun godot_rid_new_with_resource(p_from: Any?): Long

external fun godot_rid_operator_equal(p_self: RID?, p_b: RID?): Boolean

external fun godot_rid_operator_less(p_self: RID?, p_b: RID?): Boolean

external fun godot_string_ascii(p_self: String?): String

external fun godot_string_ascii_extended(p_self: String?): String

external fun godot_string_begins_with(p_self: String?, p_string: String?): Boolean

external fun godot_string_begins_with_char_array(p_self: String?, p_char_array: String?): Boolean

external fun godot_string_bigrams(p_self: String?): GDArray

external fun godot_string_c_escape(p_self: String?): String

external fun godot_string_c_escape_multiline(p_self: String?): String

external fun godot_string_c_unescape(p_self: String?): String

external fun godot_string_camelcase_to_underscore(p_self: String?): String

external fun godot_string_camelcase_to_underscore_lowercased(p_self: String?): String

external fun godot_string_capitalize(p_self: String?): String

external fun godot_string_casecmp_to(p_self: String?, p_str: String?): String

external fun godot_string_char_lowercase(p_char: Char): Char

external fun godot_string_char_to_double(p_what: String?): Double

external fun godot_string_char_to_int(p_what: String?): Int

external fun godot_string_char_to_int64_with_len(p_str: Char?, p_len: Int): Long

external fun godot_string_char_to_int_with_len(p_what: String?, p_len: Int): Int

external fun godot_string_char_uppercase(p_char: Char): Char

external fun godot_string_chars_to_utf8(p_utf8: String?): String

external fun godot_string_chars_to_utf8_with_len(p_utf8: String?, p_len: Int): String

external fun godot_string_chr(p_character: Char): String

external fun godot_string_dedent(p_self: String?): String

external fun godot_string_destroy(p_self: String?)

external fun godot_string_empty(p_self: String?): Boolean

external fun godot_string_ends_with(p_self: String?, p_string: String?): Boolean

external fun godot_string_erase(p_self: String?, p_pos: Int, p_chars: Int)

external fun godot_string_find(p_self: String?, p_what: String): Int

external fun godot_string_find_from(p_self: String?, p_what: String, p_from: Int): Int

external fun godot_string_find_last(p_self: String?, p_what: String): Int

external fun godot_string_findmk(p_self: String?, p_keys: GDArray?): Int

external fun godot_string_findmk_from(p_self: String?, p_keys: GDArray?, p_from: Int): Int

external fun godot_string_findmk_from_in_place(p_self: String?, p_keys: GDArray?, p_from: Int, r_key: Int?): Int

external fun godot_string_findn(p_self: String?, p_what: String): Int

external fun godot_string_findn_from(p_self: String?, p_what: String, p_from: Int): Int

external fun godot_string_format(p_self: String?, p_values: Variant?): String

external fun godot_string_format_with_custom_placeholder(p_self: String?, p_values: Variant?, p_placeholder: String?): String

external fun godot_string_get_base_dir(p_self: String?): String

external fun godot_string_get_basename(p_self: String?): String

external fun godot_string_get_extension(p_self: String?): String

external fun godot_string_get_file(p_self: String?): String

external fun godot_string_get_slice(p_self: String?, p_splitter: String, p_slice: Int): String

external fun godot_string_get_slice_count(p_self: String?, p_splitter: String): Int

external fun godot_string_get_slicec(p_self: String?, p_splitter: Char, p_slice: Int): String

external fun godot_string_hash(p_self: String?): Int

external fun godot_string_hash64(p_self: String?): Long

external fun godot_string_hash_chars(p_cstr: String?): Int

external fun godot_string_hash_chars_with_len(p_cstr: String?, p_len: Int): Int

external fun godot_string_hash_utf8_chars(p_str: Char?): Int

external fun godot_string_hash_utf8_chars_with_len(p_str: Char?, p_len: Int): Int

external fun godot_string_hex_encode_buffer(p_buffer: Array<Byte>?, p_len: Int): String

external fun godot_string_hex_to_int(p_self: String?): Int

external fun godot_string_hex_to_int64(p_self: String?): Long

external fun godot_string_hex_to_int64_with_prefix(p_self: String?): Long

external fun godot_string_hex_to_int_without_prefix(p_self: String?): Int

external fun godot_string_http_escape(p_self: String?): String

external fun godot_string_http_unescape(p_self: String?): String

external fun godot_string_humanize_size(p_size: Int): String

external fun godot_string_insert(p_self: String?, p_at_pos: Int, p_string: String): String

external fun godot_string_is_abs_path(p_self: String?): Boolean

external fun godot_string_is_numeric(p_self: String?): Boolean

external fun godot_string_is_rel_path(p_self: String?): Boolean

external fun godot_string_is_resource_file(p_self: String?): Boolean

external fun godot_string_is_subsequence_of(p_self: String?, p_string: String?): Boolean

external fun godot_string_is_subsequence_ofi(p_self: String?, p_string: String?): Boolean

external fun godot_string_is_valid_float(p_self: String?): Boolean

external fun godot_string_is_valid_hex_number(p_self: String?, p_with_prefix: Boolean): Boolean

external fun godot_string_is_valid_html_color(p_self: String?): Boolean

external fun godot_string_is_valid_identifier(p_self: String?): Boolean

external fun godot_string_is_valid_integer(p_self: String?): Boolean

external fun godot_string_is_valid_ip_address(p_self: String?): Boolean

external fun godot_string_json_escape(p_self: String?): String

external fun godot_string_left(p_self: String?, p_pos: Int): String

external fun godot_string_length(p_self: String?): Int

external fun godot_string_lpad(p_self: String?, p_min_length: Int): String

external fun godot_string_lpad_with_custom_character(p_self: String?, p_min_length: Int, p_character: String?): String

external fun godot_string_match(p_self: String?, p_wildcard: String?): Boolean

external fun godot_string_matchn(p_self: String?, p_wildcard: String?): Boolean

external fun godot_string_md5(p_md5: String?): String

external fun godot_string_md5_buffer(p_self: String?): PoolByteArray

external fun godot_string_md5_text(p_self: String?): String

external fun godot_string_name_destroy(p_self: godot_string_name?)

external fun godot_string_name_get_data_unique_pointer(p_self: godot_string_name?): Any?

external fun godot_string_name_get_hash(p_self: godot_string_name?): Int

external fun godot_string_name_get_name(p_self: godot_string_name?): String

external fun godot_string_name_new(p_name: String?): Long

external fun godot_string_name_new_data(p_name: String?): Long

external fun godot_string_name_operator_equal(p_self: godot_string_name?, p_other: godot_string_name?): Boolean

external fun godot_string_name_operator_less(p_self: godot_string_name?, p_other: godot_string_name?): Boolean

external fun godot_string_naturalnocasecmp_to(p_self: String?, p_str: String?): String

external fun godot_string_new(): Long

external fun godot_string_new_copy(p_src: String?): Long

external fun godot_string_new_with_wide_string(p_contents: Char?, p_size: Int): Long

external fun godot_pool_int_array_resize(p_self: PoolIntArray?, p_size: Int)

external fun godot_pool_int_array_set(p_self: PoolIntArray?, p_idx: Int, p_data: Int)

external fun godot_pool_int_array_size(p_self: PoolIntArray?): Int

external fun godot_pool_int_array_write(p_self: PoolIntArray?): godot_pool_array_write_access?

external fun godot_pool_int_array_write_access_copy(p_other: godot_pool_array_write_access?): godot_pool_array_write_access?

external fun godot_pool_int_array_write_access_destroy(p_write: godot_pool_array_write_access?)

external fun godot_pool_int_array_write_access_operator_assign(p_write: godot_pool_array_write_access?, p_other: godot_pool_array_write_access?)

external fun godot_pool_int_array_write_access_ptr(p_write: godot_pool_array_write_access?): Long?

external fun godot_pool_real_array_append(p_self: PoolRealArray?, p_data: Double)

external fun godot_pool_real_array_append_array(p_self: PoolRealArray?, p_array: PoolRealArray?)

external fun godot_pool_real_array_destroy(p_self: PoolRealArray?)

external fun godot_pool_real_array_get(p_self: PoolRealArray?, p_idx: Int): Double

external fun godot_pool_real_array_insert(p_self: PoolRealArray?, p_idx: Int, p_data: Double): godot_error

external fun godot_pool_real_array_invert(p_self: PoolRealArray?)

external fun godot_pool_real_array_new(): Long

external fun godot_pool_real_array_new_copy(p_src: PoolRealArray?): Long

external fun godot_pool_real_array_new_with_array(p_a: GDArray?): Long

external fun godot_pool_real_array_push_back(p_self: PoolRealArray?, p_data: Double)

external fun godot_pool_real_array_read(p_self: PoolRealArray?): godot_pool_array_read_access?

external fun godot_pool_real_array_read_access_copy(p_other: godot_pool_array_read_access?): godot_pool_array_read_access?

external fun godot_pool_real_array_read_access_destroy(p_read: godot_pool_array_read_access?)

external fun godot_pool_real_array_read_access_operator_assign(p_read: godot_pool_array_read_access?, p_other: godot_pool_array_read_access?)

external fun godot_pool_real_array_read_access_ptr(p_read: godot_pool_array_read_access?): Long?

external fun godot_pool_real_array_remove(p_self: PoolRealArray?, p_idx: Int)

external fun godot_pool_real_array_resize(p_self: PoolRealArray?, p_size: Int)

external fun godot_pool_real_array_set(p_self: PoolRealArray?, p_idx: Int, p_data: Double)

external fun godot_pool_real_array_size(p_self: PoolRealArray?): Int

external fun godot_pool_real_array_write(p_self: PoolRealArray?): godot_pool_array_write_access?

external fun godot_pool_real_array_write_access_copy(p_other: godot_pool_array_write_access?): godot_pool_array_write_access?

external fun godot_pool_real_array_write_access_destroy(p_write: godot_pool_array_write_access?)

external fun godot_pool_real_array_write_access_operator_assign(p_write: godot_pool_array_write_access?, p_other: godot_pool_array_write_access?)

external fun godot_pool_real_array_write_access_ptr(p_write: godot_pool_array_write_access?): Long?

external fun godot_pool_string_array_append(p_self: PoolStringArray?, p_data: String?)

external fun godot_pool_string_array_append_array(p_self: PoolStringArray?, p_array: PoolStringArray?)

external fun godot_pool_string_array_destroy(p_self: PoolStringArray?)

external fun godot_pool_string_array_get(p_self: PoolStringArray?, p_idx: Int): String

external fun godot_pool_string_array_insert(p_self: PoolStringArray?, p_idx: Int, p_data: String?): godot_error

external fun godot_pool_string_array_invert(p_self: PoolStringArray?)

external fun godot_pool_string_array_new(): Long

external fun godot_pool_string_array_new_copy(p_src: PoolStringArray?): Long

external fun godot_pool_string_array_new_with_array(p_a: GDArray?): Long

external fun godot_pool_string_array_push_back(p_self: PoolStringArray?, p_data: String?)

external fun godot_pool_string_array_read(p_self: PoolStringArray?): godot_pool_array_read_access?

external fun godot_pool_string_array_read_access_copy(p_other: godot_pool_array_read_access?): godot_pool_array_read_access?

external fun godot_pool_string_array_read_access_destroy(p_read: godot_pool_array_read_access?)

external fun godot_pool_string_array_read_access_operator_assign(p_read: godot_pool_array_read_access?, p_other: godot_pool_array_read_access?)

external fun godot_pool_string_array_read_access_ptr(p_read: godot_pool_array_read_access?): Long?

external fun godot_pool_string_array_remove(p_self: PoolStringArray?, p_idx: Int)

external fun godot_pool_string_array_resize(p_self: PoolStringArray?, p_size: Int)

external fun godot_pool_string_array_set(p_self: PoolStringArray?, p_idx: Int, p_data: String?)

external fun godot_pool_string_array_size(p_self: PoolStringArray?): Int

external fun godot_pool_string_array_write(p_self: PoolStringArray?): godot_pool_array_write_access?

external fun godot_pool_string_array_write_access_copy(p_other: godot_pool_array_write_access?): godot_pool_array_write_access?

external fun godot_pool_string_array_write_access_destroy(p_write: godot_pool_array_write_access?)

external fun godot_pool_string_array_write_access_operator_assign(p_write: godot_pool_array_write_access?, p_other: godot_pool_array_write_access?)

external fun godot_pool_string_array_write_access_ptr(p_write: godot_pool_array_write_access?): Long?

external fun godot_pool_vector2_array_append(p_self: PoolVector2Array?, p_data: Vector2?)

external fun godot_pool_vector2_array_append_array(p_self: PoolVector2Array?, p_array: PoolVector2Array?)

external fun godot_pool_vector2_array_destroy(p_self: PoolVector2Array?)

external fun godot_pool_vector2_array_get(p_self: PoolVector2Array?, p_idx: Int): Vector2

external fun godot_pool_vector2_array_insert(p_self: PoolVector2Array?, p_idx: Int, p_data: Vector2?): godot_error

external fun godot_pool_vector2_array_invert(p_self: PoolVector2Array?)

external fun godot_pool_vector2_array_new(): Long

external fun godot_pool_vector2_array_new_copy(p_src: PoolVector2Array?): Long

external fun godot_pool_vector2_array_new_with_array(p_a: GDArray?): Long

external fun godot_pool_vector2_array_push_back(p_self: PoolVector2Array?, p_data: Vector2?)

external fun godot_pool_vector2_array_read(p_self: PoolVector2Array?): godot_pool_array_read_access?

external fun godot_pool_vector2_array_read_access_copy(p_other: godot_pool_array_read_access?): godot_pool_array_read_access?

external fun godot_pool_vector2_array_read_access_destroy(p_read: godot_pool_array_read_access?)

external fun godot_pool_vector2_array_read_access_operator_assign(p_read: godot_pool_array_read_access?, p_other: godot_pool_array_read_access?)

external fun godot_pool_vector2_array_read_access_ptr(p_read: godot_pool_array_read_access?): Long?

external fun godot_pool_vector2_array_remove(p_self: PoolVector2Array?, p_idx: Int)

external fun godot_pool_vector2_array_resize(p_self: PoolVector2Array?, p_size: Int)

external fun godot_pool_vector2_array_set(p_self: PoolVector2Array?, p_idx: Int, p_data: Vector2?)

external fun godot_pool_vector2_array_size(p_self: PoolVector2Array?): Int

external fun godot_pool_vector2_array_write(p_self: PoolVector2Array?): godot_pool_array_write_access?

external fun godot_pool_vector2_array_write_access_copy(p_other: godot_pool_array_write_access?): godot_pool_array_write_access?

external fun godot_pool_vector2_array_write_access_destroy(p_write: godot_pool_array_write_access?)

external fun godot_pool_vector2_array_write_access_operator_assign(p_write: godot_pool_array_write_access?, p_other: godot_pool_array_write_access?)

external fun godot_pool_vector2_array_write_access_ptr(p_write: godot_pool_array_write_access?): Long?

external fun godot_pool_vector3_array_append(p_self: PoolVector3Array?, p_data: Vector3?)

external fun godot_pool_vector3_array_append_array(p_self: PoolVector3Array?, p_array: PoolVector3Array?)

external fun godot_pool_vector3_array_destroy(p_self: PoolVector3Array?)

external fun godot_pool_vector3_array_get(p_self: PoolVector3Array?, p_idx: Int): Vector3

external fun godot_pool_vector3_array_insert(p_self: PoolVector3Array?, p_idx: Int, p_data: Vector3?): godot_error

external fun godot_pool_vector3_array_invert(p_self: PoolVector3Array?)

external fun godot_pool_vector3_array_new(): Long

external fun godot_pool_vector3_array_new_copy(p_src: PoolVector3Array?): Long

external fun godot_pool_vector3_array_new_with_array(p_a: GDArray?): Long

external fun godot_pool_vector3_array_push_back(p_self: PoolVector3Array?, p_data: Vector3?)

external fun godot_pool_vector3_array_read(p_self: PoolVector3Array?): godot_pool_array_read_access?

external fun godot_pool_vector3_array_read_access_copy(p_other: godot_pool_array_read_access?): godot_pool_array_read_access?

external fun godot_pool_vector3_array_read_access_destroy(p_read: godot_pool_array_read_access?)

external fun godot_pool_vector3_array_read_access_operator_assign(p_read: godot_pool_array_read_access?, p_other: godot_pool_array_read_access?)

external fun godot_pool_vector3_array_read_access_ptr(p_read: godot_pool_array_read_access?): Long?

external fun godot_pool_vector3_array_remove(p_self: PoolVector3Array?, p_idx: Int)

external fun godot_pool_vector3_array_resize(p_self: PoolVector3Array?, p_size: Int)

external fun godot_pool_vector3_array_set(p_self: PoolVector3Array?, p_idx: Int, p_data: Vector3?)

external fun godot_pool_vector3_array_size(p_self: PoolVector3Array?): Int

external fun godot_pool_vector3_array_write(p_self: PoolVector3Array?): godot_pool_array_write_access?

external fun godot_pool_vector3_array_write_access_copy(p_other: godot_pool_array_write_access?): godot_pool_array_write_access?

external fun godot_pool_vector3_array_write_access_destroy(p_write: godot_pool_array_write_access?)

external fun godot_pool_vector3_array_write_access_operator_assign(p_write: godot_pool_array_write_access?, p_other: godot_pool_array_write_access?)

external fun godot_pool_vector3_array_write_access_ptr(p_write: godot_pool_array_write_access?): Long?

external fun godot_print(p_message: String?)

external fun godot_print_error(p_description: String?, p_function: String?, p_file: String?, p_line: Int)

external fun godot_print_warning(p_description: String?, p_function: String?, p_file: String?, p_line: Int)

external fun godot_quat_as_string(p_self: Quat?): String

external fun godot_quat_cubic_slerp(p_self: Quat?, p_b: Quat?, p_pre_a: Quat?, p_post_b: Quat?, p_t: Double): Quat

external fun godot_quat_dot(p_self: Quat?, p_b: Quat?): Double

external fun godot_quat_get_w(p_self: Quat?): Double

external fun godot_quat_get_x(p_self: Quat?): Double

external fun godot_quat_get_y(p_self: Quat?): Double

external fun godot_quat_get_z(p_self: Quat?): Double

external fun godot_quat_inverse(p_self: Quat?): Quat

external fun godot_quat_is_normalized(p_self: Quat?): Boolean

external fun godot_quat_length(p_self: Quat?): Double

external fun godot_quat_length_squared(p_self: Quat?): Double

external fun godot_quat_new(p_x: Double, p_y: Double, p_z: Double, p_w: Double): Long

external fun godot_quat_new_with_axis_angle(p_axis: Vector3?, p_angle: Double): Long

external fun godot_quat_new_with_basis(p_basis: Basis?): Long

external fun godot_quat_new_with_euler(p_euler: Vector3?): Long

external fun godot_quat_normalized(p_self: Quat?): Quat

external fun godot_quat_operator_add(p_self: Quat?, p_b: Quat?): Quat

external fun godot_quat_operator_divide(p_self: Quat?, p_b: Double): Quat

external fun godot_quat_operator_equal(p_self: Quat?, p_b: Quat?): Boolean

external fun godot_quat_operator_multiply(p_self: Quat?, p_b: Double): Quat

external fun godot_quat_operator_neg(p_self: Quat?): Quat

external fun godot_is_instance_valid(p_object: Any?): Boolean

external fun godot_method_bind_call(p_method_bind: godot_method_bind?, p_instance: Any?, p_args: Array<Variant>?, p_arg_count: Int, p_call_error: godot_variant_call_error?): Variant

external fun godot_method_bind_get_method(p_classname: String?, p_methodname: String?): godot_method_bind?

external fun godot_method_bind_ptrcall(p_method_bind: godot_method_bind?, p_instance: Any?, p_args: Any?, p_return_type: String?): Any?

external fun godot_nativescript_get_global_type_tag(p_idx: Int, p_name: String?): Any?

external fun godot_nativescript_get_instance_binding_data(p_idx: Int, p_object: Any?): Any?

external fun godot_nativescript_get_type_tag(p_object: Any?): Any?

external fun godot_nativescript_get_userdata(p_instance: Any?): Any?

external fun godot_nativescript_profiling_add_data(p_signature: String?, p_time: Long)

external fun godot_nativescript_register_class(p_gdnative_handle: Any?, p_name: String?, p_base: String?, p_create_func: godot_instance_create_func, p_destroy_func: godot_instance_destroy_func)

external fun godot_nativescript_register_instance_binding_data_functions(p_binding_functions: godot_instance_binding_functions): Int

external fun godot_nativescript_register_method(p_gdnative_handle: Any?, p_name: String?, p_function_name: String?, p_attr: godot_method_attributes, p_method: godot_instance_method)

external fun godot_nativescript_register_property(p_gdnative_handle: Any?, p_name: String?, p_path: String?, p_attr: godot_property_attributes?, p_set_func: godot_property_set_func, p_get_func: godot_property_get_func)

external fun godot_nativescript_register_signal(p_gdnative_handle: Any?, p_name: String?, p_signal: godot_signal?)

external fun godot_nativescript_register_tool_class(p_gdnative_handle: Any?, p_name: String?, p_base: String?, p_create_func: godot_instance_create_func, p_destroy_func: godot_instance_destroy_func)

external fun godot_nativescript_set_class_documentation(p_gdnative_handle: Any?, p_name: String?, p_documentation: String)

external fun godot_nativescript_set_global_type_tag(p_idx: Int, p_name: String?, p_type_tag: Any?)

external fun godot_nativescript_set_method_argument_information(p_gdnative_handle: Any?, p_name: String?, p_function_name: String?, p_num_args: Int, p_args: godot_method_arg?)

external fun godot_nativescript_set_method_documentation(p_gdnative_handle: Any?, p_name: String?, p_function_name: String?, p_documentation: String)

external fun godot_nativescript_set_property_documentation(p_gdnative_handle: Any?, p_name: String?, p_path: String?, p_documentation: String)

external fun godot_nativescript_set_signal_documentation(p_gdnative_handle: Any?, p_name: String?, p_signal_name: String?, p_documentation: String)

external fun godot_nativescript_set_type_tag(p_gdnative_handle: Any?, p_name: String?, p_type_tag: Any?)

external fun godot_nativescript_unregister_instance_binding_data_functions(p_idx: Int)

external fun godot_net_bind_multiplayer_peer(p_obj: Any?, arg1: godot_net_multiplayer_peer?)

external fun godot_net_bind_packet_peer(p_obj: Any?, arg1: godot_net_packet_peer?)

external fun godot_net_bind_stream_peer(p_obj: Any?, p_interface: godot_net_stream_peer?)

external fun godot_net_bind_webrtc_data_channel(p_obj: Any?, arg1: godot_net_webrtc_data_channel?)

external fun godot_net_bind_webrtc_peer_connection(p_obj: Any?, arg1: godot_net_webrtc_peer_connection?)

external fun godot_net_set_webrtc_library(arg0: godot_net_webrtc_library?): godot_error

external fun godot_node_path_as_string(p_self: NodePath?): String

external fun godot_node_path_destroy(p_self: NodePath?)

external fun godot_node_path_get_as_property_path(p_self: NodePath?): NodePath

external fun godot_node_path_get_concatenated_subnames(p_self: NodePath?): String

external fun godot_node_path_get_name(p_self: NodePath?, p_idx: Int): String

external fun godot_node_path_get_name_count(p_self: NodePath?): Int

external fun godot_node_path_get_subname(p_self: NodePath?, p_idx: Int): String

external fun godot_node_path_get_subname_count(p_self: NodePath?): Int

external fun godot_node_path_is_absolute(p_self: NodePath?): Boolean

external fun godot_node_path_is_empty(p_self: NodePath?): Boolean

external fun godot_node_path_new(p_from: String?): Long

external fun godot_node_path_new_copy(p_src: NodePath?): Long

external fun godot_node_path_operator_equal(p_self: NodePath?, p_b: NodePath?): Boolean

external fun godot_object_destroy(p_o: Any?)

external fun godot_plane_as_string(p_self: Plane?): String

external fun godot_plane_center(p_self: Plane?): Vector3

external fun godot_plane_distance_to(p_self: Plane?, p_point: Vector3?): Double

external fun godot_plane_get_any_point(p_self: Plane?): Vector3

external fun godot_plane_get_d(p_self: Plane?): Double

external fun godot_plane_get_normal(p_self: Plane?): Vector3

external fun godot_plane_has_point(p_self: Plane?, p_point: Vector3?, p_epsilon: Double): Boolean

external fun godot_plane_intersect_3(p_self: Plane?, p_b: Plane?, p_c: Plane?): Vector3?

external fun godot_plane_intersects_ray(p_self: Plane?, p_from: Vector3?, p_dir: Vector3?): Vector3?

external fun godot_plane_intersects_segment(p_self: Plane?, p_begin: Vector3?, p_end: Vector3?): Vector3

external fun godot_plane_is_point_over(p_self: Plane?, p_point: Vector3?): Boolean

external fun godot_plane_new_with_normal(p_normal: Vector3?, p_d: Double): Long

external fun godot_plane_new_with_reals(p_a: Double, p_b: Double, p_c: Double, p_d: Double): Long

external fun godot_plane_new_with_vectors(p_v1: Vector3?, p_v2: Vector3?, p_v3: Vector3?): Long

external fun godot_plane_normalized(p_self: Plane?): Plane

external fun godot_plane_operator_equal(p_self: Plane?, p_b: Plane?): Boolean

external fun godot_plane_operator_neg(p_self: Plane?): Plane

external fun godot_plane_project(p_self: Plane?, p_point: Vector3?): Vector3

external fun godot_plane_set_d(p_self: Plane?, p_d: Double)

external fun godot_plane_set_normal(p_self: Plane?, p_normal: Vector3?)

external fun godot_pluginscript_register_language(language_desc: godot_pluginscript_language_desc?)

external fun godot_pool_byte_array_append(p_self: PoolByteArray?, p_data: Byte)

external fun godot_pool_byte_array_append_array(p_self: PoolByteArray?, p_array: PoolByteArray?)

external fun godot_pool_byte_array_destroy(p_self: PoolByteArray?)

external fun godot_pool_byte_array_get(p_self: PoolByteArray?, p_idx: Int): Byte

external fun godot_pool_byte_array_insert(p_self: PoolByteArray?, p_idx: Int, p_data: Byte): godot_error

external fun godot_pool_byte_array_invert(p_self: PoolByteArray?)

external fun godot_pool_byte_array_new(): Long

external fun godot_pool_byte_array_new_copy(p_src: PoolByteArray?): Long

external fun godot_pool_byte_array_new_with_array(p_a: GDArray?): Long

external fun godot_pool_byte_array_push_back(p_self: PoolByteArray?, p_data: Byte)

external fun godot_pool_byte_array_read(p_self: PoolByteArray?): godot_pool_array_read_access?

external fun godot_pool_byte_array_read_access_copy(p_other: godot_pool_array_read_access?): godot_pool_array_read_access?

external fun godot_pool_byte_array_read_access_destroy(p_read: godot_pool_array_read_access?)

external fun godot_pool_byte_array_read_access_operator_assign(p_read: godot_pool_array_read_access?, p_other: godot_pool_array_read_access?)

external fun godot_pool_byte_array_read_access_ptr(p_read: godot_pool_array_read_access?): Long?

external fun godot_pool_byte_array_remove(p_self: PoolByteArray?, p_idx: Int)

external fun godot_pool_byte_array_resize(p_self: PoolByteArray?, p_size: Int)

external fun godot_pool_byte_array_set(p_self: PoolByteArray?, p_idx: Int, p_data: Byte)

external fun godot_pool_byte_array_size(p_self: PoolByteArray?): Int

external fun godot_pool_byte_array_write(p_self: PoolByteArray?): godot_pool_array_write_access?

external fun godot_pool_byte_array_write_access_copy(p_other: godot_pool_array_write_access?): godot_pool_array_write_access?

external fun godot_pool_byte_array_write_access_destroy(p_write: godot_pool_array_write_access?)

external fun godot_pool_byte_array_write_access_operator_assign(p_write: godot_pool_array_write_access?, p_other: godot_pool_array_write_access?)

external fun godot_pool_byte_array_write_access_ptr(p_write: godot_pool_array_write_access?): Long?

external fun godot_pool_color_array_append(p_self: PoolColorArray?, p_data: Color?)

external fun godot_pool_color_array_append_array(p_self: PoolColorArray?, p_array: PoolColorArray?)

external fun godot_pool_color_array_destroy(p_self: PoolColorArray?)

external fun godot_pool_color_array_get(p_self: PoolColorArray?, p_idx: Int): Color

external fun godot_pool_color_array_insert(p_self: PoolColorArray?, p_idx: Int, p_data: Color?): godot_error

external fun godot_pool_color_array_invert(p_self: PoolColorArray?)

external fun godot_pool_color_array_new(): Long

external fun godot_pool_color_array_new_copy(p_src: PoolColorArray?): Long

external fun godot_pool_color_array_new_with_array(p_a: GDArray?): Long

external fun godot_pool_color_array_push_back(p_self: PoolColorArray?, p_data: Color?)

external fun godot_pool_color_array_read(p_self: PoolColorArray?): godot_pool_array_read_access?

external fun godot_pool_color_array_read_access_copy(p_other: godot_pool_array_read_access?): godot_pool_array_read_access?

external fun godot_pool_color_array_read_access_destroy(p_read: godot_pool_array_read_access?)

external fun godot_pool_color_array_read_access_operator_assign(p_read: godot_pool_array_read_access?, p_other: godot_pool_array_read_access?)

external fun godot_pool_color_array_read_access_ptr(p_read: godot_pool_array_read_access?): Long?

external fun godot_pool_color_array_remove(p_self: PoolColorArray?, p_idx: Int)

external fun godot_pool_color_array_resize(p_self: PoolColorArray?, p_size: Int)

external fun godot_pool_color_array_set(p_self: PoolColorArray?, p_idx: Int, p_data: Color?)

external fun godot_pool_color_array_size(p_self: PoolColorArray?): Int

external fun godot_pool_color_array_write(p_self: PoolColorArray?): godot_pool_array_write_access?

external fun godot_pool_color_array_write_access_copy(p_other: godot_pool_array_write_access?): godot_pool_array_write_access?

external fun godot_pool_color_array_write_access_destroy(p_write: godot_pool_array_write_access?)

external fun godot_pool_color_array_write_access_operator_assign(p_write: godot_pool_array_write_access?, p_other: godot_pool_array_write_access?)

external fun godot_pool_color_array_write_access_ptr(p_write: godot_pool_array_write_access?): Long?

external fun godot_pool_int_array_append(p_self: PoolIntArray?, p_data: Int)

external fun godot_pool_int_array_append_array(p_self: PoolIntArray?, p_array: PoolIntArray?)

external fun godot_pool_int_array_destroy(p_self: PoolIntArray?)

external fun godot_pool_int_array_get(p_self: PoolIntArray?, p_idx: Int): Int

external fun godot_pool_int_array_insert(p_self: PoolIntArray?, p_idx: Int, p_data: Int): godot_error

external fun godot_pool_int_array_invert(p_self: PoolIntArray?)

external fun godot_pool_int_array_new(): Long

external fun godot_pool_int_array_new_copy(p_src: PoolIntArray?): Long

external fun godot_pool_int_array_new_with_array(p_a: GDArray?): Long

external fun godot_pool_int_array_push_back(p_self: PoolIntArray?, p_data: Int)

external fun godot_pool_int_array_read(p_self: PoolIntArray?): godot_pool_array_read_access?

external fun godot_pool_int_array_read_access_copy(p_other: godot_pool_array_read_access?): godot_pool_array_read_access?

external fun godot_pool_int_array_read_access_destroy(p_read: godot_pool_array_read_access?)

external fun godot_pool_int_array_read_access_operator_assign(p_read: godot_pool_array_read_access?, p_other: godot_pool_array_read_access?)

external fun godot_pool_int_array_read_access_ptr(p_read: godot_pool_array_read_access?): Long?

external fun godot_pool_int_array_remove(p_self: PoolIntArray?, p_idx: Int)

external fun godot_vector3_to_diagonal_matrix(p_self: Vector3?): Basis

external fun godot_videodecoder_file_read(file_ptr: Any?, buf: Int?, buf_size: Int): Int

external fun godot_videodecoder_file_seek(file_ptr: Any?, pos: Int, whence: Int): Int

external fun godot_videodecoder_register_decoder(p_interface: godot_videodecoder_interface_gdnative?)

external fun ___godot_wrapper_call_and_get(o: Any?, method_data: Any?, user_data: Any?, num_args: Int, args: Variant?): Variant

external fun ___godot_wrapper_class_destroy_func(p: Any?, method_data: Any?, data: Any?)

external fun ___godot_wrapper_class_instance_func(p: Any?, method_data: Any?): Any?

external fun ___godot_wrapper_property_get_func(`object`: Any?, method_data: Any?, user_data: Any?): Variant

external fun ___godot_wrapper_property_set_func(`object`: Any?, method_data: Any?, user_data: Any?, value: Variant?)

external fun godot_aabb_as_string(p_self: AABB?): String

external fun godot_aabb_encloses(p_self: AABB?, p_with: AABB?): Boolean

external fun godot_aabb_expand(p_self: AABB?, p_to_point: Vector3?): AABB

external fun godot_aabb_get_area(p_self: AABB?): Double

external fun godot_aabb_get_endpoint(p_self: AABB?, p_idx: Int): Vector3

external fun godot_aabb_get_longest_axis(p_self: AABB?): Vector3

external fun godot_aabb_get_longest_axis_index(p_self: AABB?): Int

external fun godot_aabb_get_longest_axis_size(p_self: AABB?): Double

external fun godot_aabb_get_position(p_self: AABB?): Vector3

external fun godot_aabb_get_shortest_axis(p_self: AABB?): Vector3

external fun godot_aabb_get_shortest_axis_index(p_self: AABB?): Int

external fun godot_aabb_get_shortest_axis_size(p_self: AABB?): Double

external fun godot_aabb_get_size(p_self: AABB?): Vector3

external fun godot_aabb_get_support(p_self: AABB?, p_dir: Vector3?): Vector3

external fun godot_aabb_grow(p_self: AABB?, p_by: Double): AABB

external fun godot_aabb_has_no_area(p_self: AABB?): Boolean

external fun godot_aabb_has_no_surface(p_self: AABB?): Boolean

external fun godot_aabb_has_point(p_self: AABB?, p_point: Vector3?): Boolean

external fun godot_aabb_intersection(p_self: AABB?, p_with: AABB?): AABB

external fun godot_aabb_intersects(p_self: AABB?, p_with: AABB?): Boolean

external fun godot_aabb_intersects_plane(p_self: AABB?, p_plane: Plane?): Boolean

external fun godot_aabb_intersects_segment(p_self: AABB?, p_from: Vector3?, p_to: Vector3?): Boolean

external fun godot_aabb_merge(p_self: AABB?, p_with: AABB?): AABB

external fun godot_aabb_new(p_pos: Vector3?, p_size: Vector3?): Long

external fun godot_aabb_operator_equal(p_self: AABB?, p_b: AABB?): Boolean

external fun godot_aabb_set_position(p_self: AABB?, p_v: Vector3?)

external fun godot_aabb_set_size(p_self: AABB?, p_v: Vector3?)

external fun godot_alloc(p_bytes: Int): Any?

external fun godot_android_get_activity(): Any?

external fun godot_android_get_env(): Any?

external fun godot_android_get_surface(): Any?

external fun godot_android_is_activity_resumed(): Boolean

external fun godot_array_append(p_self: GDArray?, p_value: Variant?)

external fun godot_array_back(p_self: GDArray?): Variant

external fun godot_array_bsearch(p_self: GDArray?, p_value: Variant?, p_before: Boolean): Int

external fun godot_array_bsearch_custom(p_self: GDArray?, p_value: Variant?, p_obj: Any?, p_func: String?, p_before: Boolean): Int

external fun godot_array_clear(p_self: GDArray?)

external fun godot_array_count(p_self: GDArray?, p_value: Variant?): Int

external fun godot_array_destroy(p_self: GDArray?)

external fun godot_array_duplicate(p_self: GDArray?, p_deep: Boolean): GDArray

external fun godot_array_empty(p_self: GDArray?): Boolean

external fun godot_array_erase(p_self: GDArray?, p_value: Variant?)

external fun godot_array_find(p_self: GDArray?, p_what: Variant?, p_from: Int): Int

external fun godot_array_find_last(p_self: GDArray?, p_what: Variant?): Int

external fun godot_array_front(p_self: GDArray?): Variant

external fun godot_array_get(p_self: GDArray?, p_idx: Int): Variant

external fun godot_array_has(p_self: GDArray?, p_value: Variant?): Boolean

external fun godot_array_hash(p_self: GDArray?): Int

external fun godot_array_insert(p_self: GDArray?, p_pos: Int, p_value: Variant?)

external fun godot_array_invert(p_self: GDArray?)

external fun godot_array_max(p_self: GDArray?): Variant

external fun godot_array_min(p_self: GDArray?): Variant

external fun godot_array_new(): Long

external fun godot_array_new_copy(p_src: GDArray?): Long

