package day2

import utils.FileUtils

class FileUtilsDay2(filename: String, day: String) : FileUtils(filename, day) {

    fun readLinesToIdRanges(): List<Range> {
        val text = readLinesToText()
        println(text)
        return text.split(",").map { Range(it) }
    }
}