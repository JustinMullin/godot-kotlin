package external

import java.io.File

val header = """
@file:Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")

package org.godotengine.kotlin

import jni.*
import kotlinx.cinterop.*
import godot.core.*
import godot.gdnative.*
import platform.posix.*

fun initExternalBindings() {
"""

val footer = """
}
"""

// these methods are not available on x86_64; need to figure out if this list needs to be generated per-platform (seems to be the case)
val notInTargetMethods = listOf(
        "godot_android_get_activity",
        "godot_android_get_env",
        "godot_android_get_surface",
        "godot_android_is_activity_resumed",
        "godot_array_duplicate",
        "godot_array_max",
        "godot_array_min",
        "godot_array_shuffle",
        "godot_arvr_add_controller",
        "godot_arvr_blit",
        "godot_arvr_get_controller_rumble",
        "godot_arvr_get_reference_frame",
        "godot_arvr_get_texid",
        "godot_arvr_get_worldscale",
        "godot_arvr_register_interface",
        "godot_arvr_remove_controller",
        "godot_arvr_set_controller_axis",
        "godot_arvr_set_controller_button",
        "godot_arvr_set_controller_transform",
        "godot_basis_get_quat",
        "godot_basis_set_axis_angle_scale",
        "godot_basis_set_euler_scale",
        "godot_basis_set_quat",
        "godot_basis_set_quat_scale",
        "godot_basis_slerp",
        "godot_color_darkened",
        "godot_color_from_hsv",
        "godot_color_lightened",
        "godot_color_to_abgr32",
        "godot_color_to_abgr64",
        "godot_color_to_argb64",
        "godot_color_to_rgba64",
        "godot_dictionary_duplicate",
        "godot_dictionary_erase_with_return",
        "godot_dictionary_get_with_default",
        "godot_is_instance_valid",
        "godot_net_bind_multiplayer_peer",
        "godot_net_bind_packet_peer",
        "godot_net_bind_stream_peer",
        "godot_net_bind_webrtc_data_channel",
        "godot_net_bind_webrtc_peer_connection",
        "godot_net_set_webrtc_library",
        "godot_node_path_get_as_property_path",
        "godot_pluginscript_register_language",
        "godot_quat_new_with_basis",
        "godot_quat_new_with_euler",
        "godot_quat_set_axis_angle",
        "godot_rect2_abs",
        "godot_rect2_grow_individual",
        "godot_rect2_grow_margin",
        "godot_string_dedent",
        "godot_string_rsplit",
        "godot_string_rstrip",
        "godot_string_trim_prefix",
        "godot_string_trim_suffix",
        "godot_transform_new_with_quat",
        "godot_variant_evaluate",
        "godot_variant_get_operator_name",
        "godot_vector2_move_toward",
        "godot_vector3_move_toward",
        "godot_videodecoder_file_read",
        "godot_videodecoder_file_seek",
        "godot_videodecoder_register_decoder"
)

val customImplMethods = listOf(
        "godot_variant_call",
        "godot_register_native_call_type",
        "godot_method_bind_call",
        "godot_method_bind_get_method",
        "godot_string_new_with_wide_string", // TODO: this looks like a constructor, but isn't
        "godot_variant_get_type", // TODO: not returning enum value properly right now
        "godot_variant_as_string", // TODO: not returning string properly right now
        "godot_string_hex_encode_buffer", // TODO: this shouldn't be excluded, just being lazy
        "___godot_wrapper_call_and_get" // TODO: this shouldn't be excluded, just being lazy

)

val excludedPrefixes = listOf(
    "godot_method_bind_ptrcall", // ptrcall methods are prefixed in JvmBridge
    "godot_nativescript_",
    "godot_plane_intersect" // TODO: these shouldn't be excluded, just being lazy
)

val primitives = listOf("boolean", "byte", "char", "short", "int", "long", "float", "double")
val nativePrimitives = mapOf(
        "godot_real" to "Float"
)

val enumClasses = mutableListOf<String>()

fun mapJvmType(type: String): String {
    return when {
        type == "java.lang.String" -> "jstring"
        type == "java.lang.Character" -> "jchar"
        type == "java.lang.Byte[]" -> "jbyteArray"
        primitives.contains(type) -> "j$type"
        else -> "jobject"
    }
}

fun String.jvmToGdType(): String {
    return when {
        startsWith("godot.core.") -> removePrefix("godot.core.").split("(?=[A-Z])".toRegex()).joinToString("_") { "godot_${it.toLowerCase()}" }
        else -> "???"
    }
}

fun String.gdToJvmType(): String {
    return when {
        startsWith("godot_") -> removePrefix("godot_").split("_").joinToString("") { it.capitalize() }
        else -> "???"
    }
}

fun castForArg(arg: String, nextArg: String?, argType: String, nativeArgType: NativeArgument): String {
    val nativeType = nativeArgType.baseType
    return when {
        argType.contains("[]") && primitives.contains(argType) -> {
            "memScoped { jni.Get${argType.drop(argType.lastIndexOf(".")+1).dropLast(2)}ArrayElements!!.invoke(env, $arg, alloc<jbooleanVar>().ptr)?.reinterpret<${nativeArgType.baseType}>(); checkErrors(\"error in casting array arg $nativeArgType\") }"
        }
        argType.contains("[]") -> {
            val single = "jni.GetObjectArrayElement!!.invoke(env, $arg, i)!!.also { checkErrors(\"error in casting array arg $nativeArgType\") }"
            "(0 until $nextArg).map { i -> ${castForArg(single, null, argType.dropLast(2), nativeArgType)} }.toCValues()"
        }

        nativePrimitives.contains(nativeType) -> "$arg.to${nativePrimitives[nativeType]!!}()"
        nativeType == "*" -> "$arg.pointerForCoreType<COpaquePointerVar>()"
        nativeType == "size_t" -> "$arg.toULong()" // TODO: not portable!
        nativeType == "ByteVar" -> "$arg.getStringValue().cstr"
        nativeType == "godot_string" -> "$arg.getStringValue().toGDString()"
        argType == "boolean" -> "$arg.takeIf { it <= 0U } == null"
        nativeType == "uint64_t" -> "$arg.toULong()"
        nativeType == "int64_t" -> "$arg.toLong()"
        nativeType == "uint8_t" -> "$arg.toUByte()"
        nativeType == "wchar_tVar" && nativeArgType.container?.contains("CPointerVar") ?: false -> "cValuesOf(cValuesOf($arg.toInt()).ptr).ptr"
        nativeType == "wchar_t" -> "$arg.toInt()"
        nativeType == "wchar_tVar" -> "cValuesOf($arg.toInt()).ptr"
        nativeType == "uint8_tVar" && nativeArgType.container?.contains("CValuesRef") ?: false -> "$arg.getStringValue().encodeToByteArray().toUByteArray().toCValues()"
        nativeType == "uint8_tVar" -> "cValuesOf($arg.toByte()).ptr"
        nativeType.startsWith("String?") -> "$arg.getStringValue()"
        primitives.contains(argType) -> "$arg.to${argType.capitalize()}()"
        enumClasses.contains(argType.removePrefix("godot.gdnative.")) -> {
            val enumName = argType.removePrefix("godot.gdnative.")
            "$enumName.byValue($arg.asEnum(\"$enumName\").toUInt())"
        }
        mapJvmType(argType) == "jobject" -> "$arg.pointerForCoreType<$nativeType>()"
        else -> "$arg"
    }
}

fun castForReturn(returnType: String, methodData: InteropMethod): String {
    return when {
        returnType.endsWith("Long") && methodData.returnType.startsWith("COpaquePointer?") -> "?.rawValue?.toLong()"
        returnType.endsWith("long") && methodData.returnType.startsWith("COpaquePointer") -> "!!.rawValue.toLong()"
        returnType.startsWith("godot.core.") -> "?.asCoreType(\"${returnType.removePrefix("godot.core.")}\")"
        else -> ""
    }
}

fun methodBody(methodName: String, args: List<String>, returnType: String, cinteropMethods: List<InteropMethod>): String {
    var argIndex = -1
    return when {
        methodName.contains("_new") -> generateConstructorBinding(methodName, args, cinteropMethods)
        else -> {
            val methodData = cinteropMethods.find { it.name == methodName } ?: throw Exception("Can't find native entry for $methodName")
            val (pre, post) = if (methodData.args.any { it.baseType == "wchar_tVar" }) "memScoped { " to " }" else "" to ""
            "$pre$methodName(${args.joinToString(", ") {
                argIndex += 1
                castForArg(('a' + argIndex).toString(), if (argIndex+1 >= args.size) null else ('a' + argIndex + 1).toString(), args[argIndex], methodData.args[argIndex])
            }})${castForReturn(returnType, methodData)}$post"
        }
    }
}

private fun generateConstructorBinding(methodName: String, args: List<String>, cinteropMethods: List<InteropMethod>): String {
    val methodData = cinteropMethods.find { it.name == methodName } ?: throw Exception("Can't find native entry for $methodName")
    var argIndex = -1
    val newOffset = methodName.indexOf("_new")
    val gdType = methodName.take(newOffset)
    val inputType = methodName.drop(newOffset + 4).takeIf { it.isNotEmpty() }?.drop(1)
    return ("""
        val returning = cValue<$gdType> { $methodName(this.ptr${if (args.isNotEmpty()) ", " else ""}${args.joinToString(", ") {
        argIndex += 1
        castForArg(('a' + argIndex).toString(), if (argIndex+1 >= args.size) null else ('a' + argIndex + 1).toString(), args[argIndex], methodData.args[argIndex+1])
    }}) }
        returning.getPointer(arena).toLong()!!
""").trimIndent()
}

fun returnStatementBlank(type: String): String {
    return when(type) {
        "boolean" -> "false"
        "byte" -> "0.toByte()"
        "char" -> "'?'.toShort()"
        "short" -> "0.toShort()"
        "int" -> "0"
        "long" -> "0L"
        "float" -> "0f"
        "double" -> "0.0"
        "void" -> ""
        else -> "null as ${mapJvmType(type)}?"
    }
}

data class InteropMethod(val name: String, val args: List<NativeArgument>, val returnType: String)
data class NativeArgument(val baseType: String, val container: String?)

fun parseNativeArgument(arg: String): NativeArgument {
    return """((?:[^<]*)<)*([^>]*)>*\??""".toRegex().matchEntire(arg)?.groupValues?.let { values -> NativeArgument(values.last(), values[1]) }
            ?: NativeArgument(arg, null)
}

fun main() {
    val jniInput = File("jni-bridge/src/main/resources/jni/externalSignatures").readLines()
    val signatures = jniInput.dropWhile { !it.trim().startsWith("public static") }.filterNot { it.isBlank() }.dropLast(1).chunked(2)

    val cinteropInput = File("jni-bridge/src/main/resources/gdnative.kt").readLines()
    val cinteropMethods = cinteropInput.filter { it.startsWith("external fun ") }.map { line ->
        val name = line.removePrefix("external fun ").takeWhile { it != '(' }
        val rest = line.removePrefix("external fun ").drop(name.length)
        val lastColon = line.indexOfLast { it == ':' }
        val returnType = line.drop(lastColon+1).trim()
        val args = rest.drop(1).dropLast(line.length - lastColon + 1).split("\\s*,\\s*".toRegex()).map { it.split(": ").last() }.map(::parseNativeArgument)
        InteropMethod(name, args, returnType)
    }

    enumClasses.addAll(cinteropInput.filter { it.startsWith("enum class ") }.map { it.removePrefix("enum class ").takeWhile { it != '(' } })

    val outputFile = File("jni-bridge/src/native/kotlin/org/godotengine/kotlin/ExternalBindings.kt")
    outputFile.writeText(header + signatures.joinToString("\n") { (method, signature) ->
        val (returnType, jvmSignature) = method.trim().removePrefix("public static final native ").removeSuffix(";").split("\\s+".toRegex(), 2)
        val (_, name, argsString) = """(\w+)\((.*)\)""".toRegex().matchEntire(jvmSignature)?.groupValues ?: throw Exception("Unexpected method signature '$jvmSignature'.")
        val args = argsString.split("""\s*,\s*""".toRegex()).filterNot { it.isEmpty() }
        val jniSignature = signature.trim().removePrefix("descriptor: ")
        var argIndex = -1
        when {
            customImplMethods.contains(name) -> "\n    // $name is excluded from auto-generation (expects a custom implementation)"
            notInTargetMethods.contains(name) -> "\n    // $name is excluded from auto-generation (not in expected target platform)"
            excludedPrefixes.any { name.startsWith(it) } -> "\n    // $name is excluded from auto-generation (excluded by prefix)"
            else -> """
    |    registerNativeMethod("godot/gdnative/NativeMethodsKt", "$name",
    |        "$jniSignature",
    |        staticCFunction { _: CPointer<JNIEnvVar>, _: jobject${if (args.isNotEmpty()) ", " else ""}${args.joinToString(", ") { argIndex += 1; "${'a'+argIndex}: ${mapJvmType(it)}" } } ->
    |        try { GD.print("Invoking gdnative method '$name'")
    ${methodBody(name, args, returnType, cinteropMethods).lines().joinToString("\n") { "            $it" }}!!
    |        } catch (e: Exception) { throw Exception("error while invoking $name", e) } })""".trimMargin()
        }
    } + footer)
}
