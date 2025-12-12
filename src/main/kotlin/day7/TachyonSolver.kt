package day7

import Direction
import Grid

class TachyonSolver(val grid: Grid) {

    fun processBeams(): Int {
        val start = getStartPosition()
        val visited: MutableSet<Pair<Int, Int>> = mutableSetOf()
        return process(start, 0, visited)
    }

    fun getStartPosition(): Pair<Int, Int> {
        val start = grid.map.entries.find { it.value == 'S' }?.key
        checkNotNull(start) { throw IllegalStateException("Can't find start position") }
        return start
    }

    fun process(start: Pair<Int, Int>, counter: Int, visited: MutableSet<Pair<Int, Int>>): Int {
        if (grid.isOutOfGrid(start)) {
            return counter
        }
        var current = start
        var counter = counter
        val visited = visited

        do {
            current = grid.nextPos(current, Direction.DOWN)
        } while (grid.map[current] == '.')

        if (grid.map[current] == '^' && !visited.contains(current)) {
            visited.add(current)
            counter++
            val left = grid.nextPos(current, Direction.LEFT)
            val right = grid.nextPos(current, Direction.RIGHT)
            counter = process(left, counter, visited)
            counter = process(right, counter, visited)
        }
        return counter
    }
}