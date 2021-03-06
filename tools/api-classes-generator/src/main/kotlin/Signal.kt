import com.beust.klaxon.Json
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec


class Signal(
        @Json(name = "name")
        var name: String
) {

    val generated by lazy {
        PropertySpec
                .builder(name.toUpperCase(), String::class, KModifier.FINAL, KModifier.CONST)
                .initializer("\"$name\"")
                .build()
    }
}