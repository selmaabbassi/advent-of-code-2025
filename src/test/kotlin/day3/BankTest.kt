package day3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BankTest {
    @Test
    fun getMaxJoltage() {
        val bank = Bank("987654321111111")
        val maxjoltage = bank.getMaxJoltage()
        val maxjoltage2 = bank.getMaxJoltagePartTwo(12)
        assertEquals(98, maxjoltage)
        assertEquals(987654321111, maxjoltage2)
    }

    @Test
    fun getMaxJoltage2() {
        val bank = Bank("811111111111119")
        val maxjoltage = bank.getMaxJoltage()
        val maxjoltage2 = bank.getMaxJoltagePartTwo(12)
        assertEquals(89, maxjoltage)
        assertEquals(811111111119, maxjoltage2)
    }

    @Test
    fun getMaxJoltage3() {
        val bank = Bank("234234234234278")
        val maxjoltage = bank.getMaxJoltage()
        val maxjoltage2 = bank.getMaxJoltagePartTwo(12)
        assertEquals(78, maxjoltage)
        assertEquals(434234234278, maxjoltage2)
    }

    @Test
    fun getMaxJoltage4() {
        val bank = Bank("818181911112111")
        val maxjoltage = bank.getMaxJoltage()
        val maxjoltage2 = bank.getMaxJoltagePartTwo(12)
        assertEquals(92, maxjoltage)
        assertEquals(888911112111, maxjoltage2)
    }
}