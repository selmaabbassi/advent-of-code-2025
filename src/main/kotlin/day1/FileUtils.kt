package day1

import java.io.File

class FileUtils(val filename: String) {
    fun readLinesToArray(): List<String> {
        return File(filename).readLines()
    }

    fun readLinesToInstruction(): List<Instruction> {
        val instructions = ArrayList<Instruction>()
        File(filename).forEachLine { line ->
            instructions.add(Instruction(line))
        }
        return instructions
    }
}