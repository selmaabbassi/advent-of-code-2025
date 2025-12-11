package utils

import java.io.File

open class FileUtils(filename: String, day: String) {
    val filePath: String = "src/main/kotlin/$day/$filename.txt"

    fun readLinesToArray(): List<String> {
        return File(filePath).readLines()
    }

    fun readLinesToText(): String {
        return File(filePath).readText().trim()
    }
}