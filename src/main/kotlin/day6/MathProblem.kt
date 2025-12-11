package day6

class MathProblem(val numbers: List<Long>, val operation: String) {

    fun solve(): Long {

        return when (operation) {
            "+" -> {
                numbers.reduce { acc, i -> acc + i }
            }

            "*" -> {
                numbers.reduce { acc, i -> acc * i }
            }

            else -> {
                throw IllegalArgumentException("operation not supported")
            }
        }
    }

    override fun toString(): String {
        return "[${numbers.joinToString(",")}], $operation\n"
    }
}