package day5

class Range(range: String) {
    val start: Long
    val end: Long

    init {
        val parts = range.split("-")
        start = parts[0].trim().toLong()
        end = parts[1].trim().toLong()
    }

    constructor(start: Long, end: Long) : this("$start-$end") {}

    fun isFresh(id: Long): Boolean {
        return id in start..end
    }

    fun numberOfFreshIds(): Long {
        return (end - start) + 1L
    }

    fun overlaps(other: Range): Boolean {
        return this.start <= other.end && this.end >= other.start
    }

    override fun toString(): String {
        return "$start-$end"
    }
}