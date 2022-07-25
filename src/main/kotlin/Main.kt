import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule
import java.io.File

val mapper: ObjectMapper = ObjectMapper(YAMLFactory()).registerModule(KotlinModule.Builder().build())
val data = mapper.readValue(File("src/main/resources/application.yml"), HashMap::class.java)

fun greeting() = "Hello ${data["name"] ?: "everybody"}!"
