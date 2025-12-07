package day4

import Direction
import Grid

class ForkliftOptimizer(val grid: Grid) {

    fun getAccessiblePaperRolls(): Int {
        val map = grid.map

        val maxX = map.keys.maxOfOrNull { it.first } ?: 0
        val maxY = map.keys.maxOfOrNull { it.second } ?: 0

        var counter = 0

        for (y in 0..maxY) {
            for (x in 0..maxX) {
                if (map[x to y] == '@') {
                    val adjacent = getAdjacentPaperRollsInAllDirections(x to y)
                    if (adjacent.size < 4) {
                        counter++
                    }
                }
            }
        }
        return counter
    }


    fun getAccessiblePaperRollsPartTwo(): Int {
        val maxX = grid.map.keys.maxOfOrNull { it.first } ?: 0
        val maxY = grid.map.keys.maxOfOrNull { it.second } ?: 0

        var removedPaperRolls = 0

        for (y in 0..maxY) {
            for (x in 0..maxX) {
                if (grid.map[x to y] == '@') {
                    val adjacent = getAdjacentPaperRollsInAllDirections(x to y)
                    if (adjacent.size < 4) {
                        grid.map[x to y] = '.'
                        removedPaperRolls++
                    }
                }
            }
        }
        return if (removedPaperRolls == 0)
            0
        else {
            return removedPaperRolls + getAccessiblePaperRollsPartTwo()
        }
    }

    fun getAdjacentPaperRollsInAllDirections(current: Pair<Int, Int>): Set<Pair<Int, Int>> {
        val adjacent: MutableSet<Pair<Int, Int>> = mutableSetOf()
        for (direction in Direction.entries) {
            if (grid.getAdjacentVal(current, direction) == '@') {
                adjacent.add(grid.getAdjacentPos(current, direction))
            }
        }
        return adjacent
    }
}