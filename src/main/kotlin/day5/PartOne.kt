package day5

import utils.FileUtils

fun main() {
    val fileUtils = FileUtils("day5", "day5")
    val text = fileUtils.readLinesToText()

    val input = text.split("\n\n")
    val rangesInput = input[0].split("\n")
    val ids = input[1].split("\n").map { it.trim().toLong() }

    val ranges = rangesInput.map { range -> Range(range) }.toList()

    val freshIds = mutableSetOf<Long>()

    for (id in ids) {
        for (range in ranges) {
            if (range.isFresh(id)) {
                freshIds.add(id)
            }
        }
    }

    println("Result ${freshIds.size}")
}