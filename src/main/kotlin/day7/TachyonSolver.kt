package day7

import Direction
import Grid

class TachyonSolver(val grid: Grid) {

    fun processBeams(): Int {
        val start = getStartPosition()
        val visited = mutableSetOf<Pair<Int, Int>>()
        return process(start, visited)
    }

    private fun getStartPosition(): Pair<Int, Int> {
        return grid.map.entries.firstOrNull { it.value == 'S' }?.key
            ?: error("Can't find start position")
    }

    /**
     * Depth-First-Search algorithm (DFS)
     */
    private fun process(start: Pair<Int, Int>, visited: MutableSet<Pair<Int, Int>>): Int {
        if (grid.isOutOfGrid(start)) {
            return 0
        }
        var current = start
        val visited = visited

        do {
            current = grid.nextPos(current, Direction.DOWN)
        } while (grid.map[current] == '.')

        if (grid.map[current] == '^' && visited.add(current)) {
            val left = grid.nextPos(current, Direction.LEFT)
            val right = grid.nextPos(current, Direction.RIGHT)
            return 1 + process(left, visited) + process(right, visited)
        }
        return 0
    }
}