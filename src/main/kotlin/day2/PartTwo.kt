package day2

fun main() {
    val fileUtilsDay2 = FileUtilsDay2("src/main/kotlin/day2/day2.txt")
    val ranges = fileUtilsDay2.readLinesToIdRanges()

    val allInvalidIds = ArrayList<Long>()
    for (range in ranges) {
        allInvalidIds.addAll(range.getInvalidIdsPartTwo())
    }

    val result = allInvalidIds.sum()
    println("Result: $result")
}