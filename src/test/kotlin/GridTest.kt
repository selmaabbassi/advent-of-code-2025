import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GridTest {
    @Test
    fun asMap() {
        val input = listOf("ABC", "DEF", "GHI")
        val grid = Grid(input)
        val map = grid.map

        grid.printMap()
        assertEquals('A', map[0 to 0])
        assertEquals('B', map[1 to 0])
        assertEquals('C', map[2 to 0])
        assertEquals('D', map[0 to 1])

    }

    @Test
    fun move() {
        val input = listOf("ABC", "DEF", "GHI")
        val grid = Grid(input)
        val adjacent = grid.getAdjacentVal(0 to 0, Direction.DOWN)
        assertEquals('D', adjacent)
    }

}