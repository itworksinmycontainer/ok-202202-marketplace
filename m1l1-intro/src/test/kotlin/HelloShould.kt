import kotlin.test.Test
import kotlin.test.assertEquals

class HelloShould {
    @Test
    fun `say Hello, World!`() {
        assertEquals("Hello, World!", hello())
    }
}
