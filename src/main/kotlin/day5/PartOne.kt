package day5

import FileUtils

fun main() {
    val fileUtils = FileUtils("example", "day5")
    val text = fileUtils.readLinesToText()
    println(text)
}