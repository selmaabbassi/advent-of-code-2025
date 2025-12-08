package day4

import FileUtils
import Grid

fun main() {
    val fileUtils = FileUtils("day4", "day4")
    val grid = Grid(fileUtils.readLinesToArray());

    val forkliftOptimizer = ForkliftOptimizer(grid)
    val result = forkliftOptimizer.getAccessiblePaperRolls()

    println("Result: $result")
}