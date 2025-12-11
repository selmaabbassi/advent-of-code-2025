package day6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MathProblemTest {
    @Test
    fun `solve from example`() {
        val mp = MathProblem(listOf(123, 45, 6), "*")
        assertEquals(33210, mp.solve())

        val mp2 = MathProblem(listOf(328, 64, 98), "+")
        assertEquals(490, mp2.solve())

        val mp3 = MathProblem(listOf(51, 387, 215), "*")
        assertEquals(4243455, mp3.solve())

        val mp4 = MathProblem(listOf(64, 23, 314), "+")
        assertEquals(401, mp4.solve())
    }

    @Test
    fun `solve from day6`() {
        val mp = MathProblem(listOf(3, 483, 5716, 6554), "+")
        assertEquals(12756, mp.solve())

        val mp2 = MathProblem(listOf(897, 516, 774, 552), "*")
        assertEquals(197752591296, mp2.solve())
    }
}