package utils

fun isNumeric(s: String): Boolean = s.all { it.isDigit() }
fun isNumeric(s: Char): Boolean = s.isDigit()