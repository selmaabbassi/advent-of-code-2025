package day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class InstructionTest {

    @Test
    fun instruction() {
        val instruction = Instruction("R22");
        assertEquals(instruction.direction, "R")
        assertEquals(instruction.value, 22);
    }
}