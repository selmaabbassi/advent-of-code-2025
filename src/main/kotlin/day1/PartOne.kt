package day1

fun main() {
    val fileUtilsDay1 = FileUtilsDay1("day1", "day1")
    val instructions = fileUtilsDay1.readLinesToInstruction();

    var currentPos = 50;
    var counter = 0;
    for (instruction in instructions) {
        if (instruction.direction == "L") {
            val newPos = moveLeft(currentPos, instruction.value)
            if (newPos == 0) {
                counter++
            }
            currentPos = newPos
        }
        if (instruction.direction == "R") {
            val newPos = moveRight(currentPos, instruction.value)
            if (newPos == 0) {
                counter++
            }
            currentPos = newPos
        }
    }

    println("Result: $counter")


}

private fun moveLeft(start: Int, steps: Int): Int {
    var current = start
    var moves = 0

    do {
        moves++
        current -= 1
        if (current < 0)
            current = 99
    } while (moves < steps)

    return current;
}

private fun moveRight(start: Int, steps: Int): Int {
    var current = start
    var moves = 0

    do {
        moves++
        current += 1
        if (current > 99)
            current = 0
    } while (moves < steps)

    return current;
}