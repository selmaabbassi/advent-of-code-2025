package day6

import utils.FileUtils
import utils.isNumeric

fun main() {
    val fileUtils = FileUtils("day6", "day6")
    val lines = fileUtils.readLinesToArray();
    val map = mutableMapOf<Int, MutableList<String>>()
    lines.forEach { l ->
        val splitted = l.trim().split(Regex(" +"))

        for ((column, s) in splitted.withIndex()) {
            map.getOrPut(column) { mutableListOf() }.add(s)
        }
    }

    val mathProblems = mutableListOf<MathProblem>()

    for (entry in map) {
        val strings: List<String> = entry.value
        val numbers = strings.filter { isNumeric(it) }.map { it.toLong() }
        val operation = strings.first { !isNumeric(it) }
        mathProblems.add(MathProblem(numbers, operation))
    }

    var counter = 0L
    for (mathProblem in mathProblems) {
        counter += mathProblem.solve()
    }

    println("Result: $counter")
}