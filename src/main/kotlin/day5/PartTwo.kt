package day5

import utils.FileUtils

fun main() {
    val fileUtils = FileUtils("day5", "day5")
    val text = fileUtils.readLinesToText()

    val input = text.split("\n\n")
    val rangesInput = input[0].split("\n")
    val ranges = rangesInput.map { range -> Range(range) }.toList()
    val rangeMerger = RangeMerger()
    val uniqueRanges = rangeMerger.merge(ranges)

    var counter = 0L

    uniqueRanges.forEach { range -> counter += range.numberOfFreshIds() }

    println("Result: $counter")
}