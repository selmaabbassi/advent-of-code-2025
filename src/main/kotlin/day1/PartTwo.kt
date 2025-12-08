package day1

fun main() {
    val fileUtilsDay1 = FileUtilsDay1("day1", "day1")
    val instructions = fileUtilsDay1.readLinesToInstruction();

    var currentPos = 50;
    var counter = 0;
    for (instruction in instructions) {
        if (instruction.direction == "L") {
            val newPos = moveLeft(currentPos, instruction.value)
            currentPos = newPos.first
            counter += newPos.second
        }
        if (instruction.direction == "R") {
            val newPos = moveRight(currentPos, instruction.value)
            currentPos = newPos.first
            counter += newPos.second
        }
    }

    println("Result: $counter")

}

private fun moveLeft(start: Int, steps: Int): Pair<Int, Int> {
    var current = start
    var counter = 0;

    repeat(steps) {
        current--
        if (current < 0) {
            current = 99
        }
        if (current == 0) {
            counter++
        }
    }

    return current to counter
}

private fun moveRight(start: Int, steps: Int): Pair<Int, Int> {
    var current = start
    var counter = 0

    repeat(steps) {
        current++
        if (current > 99) {
            current = 0
        }
        if (current == 0) {
            counter++
        }
    }

    return current to counter
}