package day3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BankTest {
    @Test
    fun getMaxJoltage() {
        val bank = Bank("987654321111111")
        val maxjoltage = bank.getMaxJoltage()
        assertEquals(98, maxjoltage)
    }

    @Test
    fun getMaxJoltage2() {
        val bank = Bank("811111111111119")
        val maxjoltage = bank.getMaxJoltage()
        assertEquals(89, maxjoltage)
    }

    @Test
    fun getMaxJoltage3() {
        val bank = Bank("234234234234278")
        val maxjoltage = bank.getMaxJoltage()
        assertEquals(78, maxjoltage)
    }

    @Test
    fun getMaxJoltage4() {
        val bank = Bank("818181911112111")
        val maxjoltage = bank.getMaxJoltage()
        assertEquals(92, maxjoltage)
    }
}