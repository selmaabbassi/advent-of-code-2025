package day7

import Grid
import utils.FileUtils

fun main() {
    val fileUtils = FileUtils("day7", "day7")
    val lines = fileUtils.readLinesToArray();
    val grid = Grid(lines)

    val tachyonSolver = TachyonSolver(grid)
    val result = tachyonSolver.processTimelines()

    println("Result: $result")
}