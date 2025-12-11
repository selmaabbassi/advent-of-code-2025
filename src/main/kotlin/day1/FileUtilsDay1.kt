package day1

import utils.FileUtils
import java.io.File

class FileUtilsDay1(filename: String, day: String) : FileUtils(filename, day) {

    fun readLinesToInstruction(): List<Instruction> {
        val instructions = ArrayList<Instruction>()
        File(filePath).forEachLine { line ->
            instructions.add(Instruction(line))
        }
        return instructions
    }
}