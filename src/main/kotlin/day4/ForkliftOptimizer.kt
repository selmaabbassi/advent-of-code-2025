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