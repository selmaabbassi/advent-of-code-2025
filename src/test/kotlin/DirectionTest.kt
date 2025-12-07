import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DirectionTest {
    @Test
    fun move() {
        val direction = Direction.DOWN

        val newPos = direction.move(0 to 0)
        assertEquals(0 to 1, newPos)
    }

}