package day6

import Grid
import utils.FileUtils
import utils.isNumeric

fun main() {
    val fileUtils = FileUtils("day6", "day6")
    val lines = fileUtils.readLinesToArray();
    val grid = Grid(lines)

    var operation = ""
    var numbers = mutableListOf<Long>()
    val mathProblems = mutableListOf<MathProblem>()

    for (i in grid.maxCol() downTo 0) {
        val column = grid.getCol(i)

        if (column.contains('*')) {
            operation = "*"
        }
        if (column.contains('+')) {
            operation = "+"
        }

        val number = column.filter { isNumeric(it) }.joinToString("")
        if (number != "") {
            val long = number.toLong()
            numbers.add(long)
        }

        if (column.all { it == ' ' } || i == 0) {
            if (numbers.isNotEmpty())
                mathProblems.add(MathProblem(numbers.toList(), operation))
            numbers = mutableListOf()
            operation = ""
        }
    }

    var counter = 0L
    for (mathProblem in mathProblems) {
        counter += mathProblem.solve()
    }

    println("Result: $counter")

}