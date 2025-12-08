package day2

fun main() {
    val fileUtilsDay2 = FileUtilsDay2("day2", "day2")
    val ranges = fileUtilsDay2.readLinesToIdRanges()

    val allInvalidIds = ArrayList<Long>()
    for (range in ranges)
        allInvalidIds.addAll(range.getInvalidIds())

    val result = allInvalidIds.sum()
    println("Result: $result")
}