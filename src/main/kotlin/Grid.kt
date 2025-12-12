class Grid(val input: List<String>) {
    val map = asMap()

    fun asMap(): MutableMap<Pair<Int, Int>, Char> {
        return input.flatMapIndexed { y, line ->
            line.mapIndexed { x, c ->
                (x to y) to c
            }
        }.toMap().toMutableMap()
    }

    fun nextVal(current: Pair<Int, Int>, direction: Direction): Char? {
        val newPos = direction.move(current)
        return map[newPos]
    }

    fun nextPos(current: Pair<Int, Int>, direction: Direction): Pair<Int, Int> {
        val newPos = direction.move(current)
        return newPos
    }

    fun maxCol(): Int {
        return map.keys.maxOf { it.first }
    }

    fun maxRow(): Int {
        return map.keys.maxOf { it.second }
    }

    fun isOutOfGrid(current: Pair<Int, Int>): Boolean {
        return current.first > maxCol() || current.second > maxRow()
    }

    fun getCol(col: Int): List<Char> {
        return map.filter { (k, _) -> k.first == col }.entries
            .sortedBy { it.key.first }
            .map { it.value }
    }

    fun getRow(col: Int): List<Char> {
        return map.filter { (k, _) -> k.second == col }.entries
            .sortedBy { it.key.second }
            .map { it.value }
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