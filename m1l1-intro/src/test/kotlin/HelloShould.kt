import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloShould {
    @Test
    fun `say Hello, World!`() {
        assertEquals("Hello, World!", hello())
    }
}
