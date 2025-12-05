package day2

fun main() {
    val fileUtils = FileUtils("src/main/kotlin/day2/day2.txt")
    val ranges = fileUtils.readLinesToIdRanges()

    val allInvalidIds = ArrayList<Long>()
    for (range in ranges)
        allInvalidIds.addAll(range.getInvalidIds())

    val result = allInvalidIds.sum()
    println("Result: $result")
}