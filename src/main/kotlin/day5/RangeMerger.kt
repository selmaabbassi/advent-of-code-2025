package day5

class RangeMerger() {

    fun merge(ranges: List<Range>): List<Range> {
        val sorted = ranges.sortedBy { it.start }
        val merged = mutableListOf<Range>()

        var current = sorted[0]

        for (next in sorted.drop(1)) {
            if (current.overlaps(next)) {
                current = Range(
                    start = current.start,
                    end = maxOf(current.end, next.end)
                )
            } else {
                merged.add(current)
                current = next
            }
        }

        merged.add(current)
        return merged
    }
}