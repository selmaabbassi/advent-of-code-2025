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

    fun isInvalid(id: String): Boolean {
        val half = id.length / 2
        val left = id.take(half)
        val right = id.substring(half)
        return left == right
    }

    override fun toString(): String {
        return "Start: $start, End: $end"
    }
}