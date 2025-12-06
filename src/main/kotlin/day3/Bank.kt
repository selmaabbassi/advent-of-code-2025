package day3

class Bank(val batteries: String) {

    fun getMaxJoltage(): Int {
        val possible = ArrayList<Int>()
        val n = batteries.length
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                possible.add("${batteries[i]}${batteries[j]}".toInt())
            }
        }

        return possible.max()
    }
}