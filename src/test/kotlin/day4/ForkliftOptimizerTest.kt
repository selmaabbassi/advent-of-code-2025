package day4

import Grid
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ForkliftOptimizerTest {
    @Test
    fun `get adjacent paper rolls in all directions #1`() {
        val input = listOf("A@C", "DEF", "GH@")
        val grid = Grid(input)
        val forkliftOptimizer = ForkliftOptimizer(grid)
        val adjacent = forkliftOptimizer.getAdjacentPaperRollsInAllDirections(0 to 0)

        assertEquals(1, adjacent.size)
    }

    @Test
    fun `get adjacent paper rolls in all directions #2`() {
        val input = listOf("A@C", "@EF", "GH@")
        val grid = Grid(input)
        val forkliftOptimizer = ForkliftOptimizer(grid)
        val adjacent = forkliftOptimizer.getAdjacentPaperRollsInAllDirections(0 to 0)

        assertEquals(2, adjacent.size)
    }

}