package day2

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RangeTest {

    @Test
    fun isInvalidPartTwo() {
        val range = Range("11-22")
        assertTrue(range.isInvalidPartTwo("11"))
        assertFalse(range.isInvalidPartTwo("12"))
        assertTrue(range.isInvalidPartTwo("99"))
        assertTrue(range.isInvalidPartTwo("111"))
        assertTrue(range.isInvalidPartTwo("999"))
        assertTrue(range.isInvalidPartTwo("1010"))
        assertTrue(range.isInvalidPartTwo("1188511885"))
        assertTrue(range.isInvalidPartTwo("222222"))
        assertTrue(range.isInvalidPartTwo("446446"))
    }
}