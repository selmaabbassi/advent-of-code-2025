enum class Direction(val dx: Int, val dy: Int) {
    UP(0, -1),
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0),
    UP_RIGHT(1, -1),
    UP_LEFT(-1, -1),
    DOWN_RIGHT(1, 1),
    DOWN_LEFT(-1, 1);

    fun move(current: Pair<Int, Int>): Pair<Int, Int> {
        return Pair(current.first + dx, current.second + dy)
    }
}