package day3

fun main() {
    val fileUtils = FileUtilsDay3("day3", "day3")
    val banks = fileUtils.readLinesToBank()

    val maxJoltages = ArrayList<Long>()

    for (bank in banks) {
        maxJoltages.add(bank.getMaxJoltagePartTwo(12))
    }

    val sum = maxJoltages.sum()

    println("Result: $sum")


}