class Grid(val input: List<String>) {
    val map = asMap()

    fun asMap(): MutableMap<Pair<Int, Int>, Char> {
        return input.flatMapIndexed { y, line ->
            line.mapIndexed { x, c ->
                (x to y) to c
            }
        }.toMap().toMutableMap()
    }

    fun getAdjacentVal(current: Pair<Int, Int>, direction: Direction): Char? {
        val newPos = direction.move(current)
        return map[newPos]
    }

    fun getAdjacentPos(current: Pair<Int, Int>, direction: Direction): Pair<Int, Int> {
        val newPos = direction.move(current)
        return newPos
    }

    fun printMap() {
        val maxX = map.keys.maxOfOrNull { it.first } ?: 0
        val maxY = map.keys.maxOfOrNull { it.second } ?: 0

        for (y in 0..maxY) {
            for (x in 0..maxX) {
                print(map[x to y] ?: ' ')
            }
            println()
        }
    }
}