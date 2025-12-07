package day3

class Bank(val batteries: String) {

    /**
     * Bubble Sort
     */
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

    /**
     * Monotonic Decreasing Stack
     */
    fun getMaxJoltagePartTwo(k: Int): Long {
        val toRemove = batteries.length - k
        val stack = ArrayDeque<Char>()
        var removed = 0

        for (c in batteries) {
            while (stack.isNotEmpty() && removed < toRemove && stack.last() < c) {
                stack.removeLast()
                removed++
            }
            stack.add(c)
        }

        return stack.joinToString("").take(k).toLong()
    }
}