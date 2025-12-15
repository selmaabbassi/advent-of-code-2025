package day7

import Direction
import Grid

class TachyonSolver(val grid: Grid) {

    fun processBeams(): Int {
        val start = getStartPosition()
        val visited = mutableSetOf<Pair<Int, Int>>()
        return process(start, visited)
    }

    fun processTimelines(): Long {
        val start = getStartPosition()
        return processTimelines(start)
    }

    private fun getStartPosition(): Pair<Int, Int> {
        return grid.map.entries.firstOrNull { it.value == 'S' }?.key
            ?: error("Can't find start position")
    }

    /**
     * Depth-First-Search algorithm (DFS)
     */
    private fun process(start: Pair<Int, Int>, visited: MutableSet<Pair<Int, Int>>): Int {
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

    /**
     * Depth-First-Search algorithm (DFS) with Memoization
     */
    private val cache = mutableMapOf<Pair<Int, Int>, Long>()
    private fun processTimelines(current: Pair<Int, Int>): Long {
        if (cache.containsKey(current)) {
            return cache.getValue(current)
        }

        var result: Long
        if (grid.isMax(current)) {
            return 1
        }

        if (grid.map[current] == '^') {
            val left = grid.nextPos(current, Direction.LEFT)
            val right = grid.nextPos(current, Direction.RIGHT)
            result = processTimelines(left) + processTimelines(right)
        } else if (grid.map[current] == '.' || grid.map[current] == 'S') {
            val down = grid.nextPos(current, Direction.DOWN)
            result = processTimelines(down)
        } else {
            result = 0
        }

        cache[current] = result
        return result
    }
}