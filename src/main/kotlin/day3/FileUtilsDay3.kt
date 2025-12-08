package day3

import FileUtils
import java.io.File

class FileUtilsDay3(filename: String, day: String) : FileUtils(filename, day) {
    fun readLinesToBank(): List<Bank> {
        val bank = ArrayList<Bank>()
        File(filePath).forEachLine { line ->
            bank.add(Bank(line))
        }
        return bank
    }
}