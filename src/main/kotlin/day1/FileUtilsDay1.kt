package day1

import FileUtils
import java.io.File

class FileUtilsDay1(filename: String) : FileUtils(filename) {

    fun readLinesToInstruction(): List<Instruction> {
        val instructions = ArrayList<Instruction>()
        File(filename).forEachLine { line ->
            instructions.add(Instruction(line))
        }
        return instructions
    }
}