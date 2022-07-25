import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.file.Path

internal class MainKtTest {

    @Test
    fun `application 파일 내용을 반영해 출력한다`() {
        Assertions.assertEquals(greeting(), "Hello jisoo!")
    }
}
