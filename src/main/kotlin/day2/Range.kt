package day2

class Range(range: String) {
    val start: Long = range.split("-")[0].trim().toLong()
    val end: Long = range.split("-")[1].trim().toLong()

    fun getInvalidIds(): List<Long> {
        val invalidIds = ArrayList<Long>()
        for (id in start..end) {
            if (isInvalid(id.toString()))
                invalidIds.add(id)
        }
        return invalidIds
    }

    fun getInvalidIdsPartTwo(): List<Long> {
        val invalidIds = ArrayList<Long>()
        for (id in start..end) {
            if (isInvalidPartTwo(id.toString()))
                invalidIds.add(id)
        }
        return invalidIds
    }

    fun isInvalid(id: String): Boolean {
        val half = id.length / 2
        val left = id.take(half)
        val right = id.substring(half)
        return left == right
    }

    fun isInvalidPartTwo(id: String): Boolean {
        for (i in 0..<id.length - 1) {
            val first = id.take(i + 1)
            val rest = id.substring(i + 1, id.length)
            val chunked = rest.chunked(first.length)
            if (chunked.all { it == (first) }) return true
        }
        return false
    }

    override fun toString(): String {
        return "Start: $start, End: $end"
    }
}