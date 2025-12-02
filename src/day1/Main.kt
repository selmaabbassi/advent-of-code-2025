package day1

import FileUtils

fun main() {
    println("Hello World!")

    val arr = IntArray(100)
    for (i in 0..99) {
        arr[i] = i
    }
    println(arr.joinToString())

    val fileUtils = FileUtils("src/day1/example.txt")
    val instructions = fileUtils.readLinesToArray();

    println(instructions.joinToString())

}