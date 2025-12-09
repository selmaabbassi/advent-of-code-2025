package day5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RangeMergerTest {

    @Test
    fun `merge all ranges in list overlap`() {
        val rangeMerger = RangeMerger()
        val ranges = listOf(
            Range(1, 5),
            Range(2, 6)
        )
        val result = rangeMerger.merge(ranges)
        assertEquals(1, result.size)
        assertEquals(1, result.first().start)
        assertEquals(6, result.first().end)
    }

    @Test
    fun `merge first two ranges overlap but not the last`() {
        val rangeMerger = RangeMerger()
        val ranges = listOf(
            Range(1, 5),
            Range(2, 6),
            Range(8, 10)
        )
        val result = rangeMerger.merge(ranges)
        assertEquals(2, result.size)
        assertEquals(1, result.first().start)
        assertEquals(6, result.first().end)
        assertEquals(8, result.last().start)
        assertEquals(10, result.last().end)
    }

    @Test
    fun `merge example`() {
        val rangeMerger = RangeMerger()
        val ranges = listOf(
            Range(1, 5),
            Range(10, 14),
            Range(16, 20),
            Range(12, 18)
        )
        val result = rangeMerger.merge(ranges)
        assertEquals(2, result.size)
        assertEquals(1, result.first().start)
        assertEquals(5, result.first().end)
        assertEquals(10, result.last().start)
        assertEquals(20, result.last().end)
    }
}