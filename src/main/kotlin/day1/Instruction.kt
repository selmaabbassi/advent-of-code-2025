package day1

class Instruction(val input: String) {
    var direction: String = input.take(1);
    var value: Int = input.drop(1).toInt();

    override fun toString(): String {
        return "$direction:$value"
    }
}