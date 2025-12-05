package day2

import java.io.File

class FileUtils(val filename: String) {
    fun readLinesToString(): String {
        return File(filename).readText().trim()
    }

    fun readLinesToIdRanges(): List<Range> {
        val text = readLinesToString()
        println(text)
        return text.split(",").map { Range(it) }
    }
}