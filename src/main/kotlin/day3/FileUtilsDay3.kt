package day3

import FileUtils
import java.io.File

class FileUtilsDay3(filename: String) : FileUtils(filename) {
    fun readLinesToBank(): List<Bank> {
        val bank = ArrayList<Bank>()
        File(filename).forEachLine { line ->
            bank.add(Bank(line))
        }
        return bank
    }
}