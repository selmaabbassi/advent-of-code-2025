package day2

import FileUtils

class FileUtilsDay2(filename: String) : FileUtils(filename) {

    fun readLinesToIdRanges(): List<Range> {
        val text = readLinesToText()
        println(text)
        return text.split(",").map { Range(it) }
    }
}