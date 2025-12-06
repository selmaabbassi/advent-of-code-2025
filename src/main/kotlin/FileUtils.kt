import java.io.File

open class FileUtils(val filename: String) {
    fun readLinesToArray(): List<String> {
        return File(filename).readLines()
    }

    fun readLinesToText(): String {
        return File(filename).readText().trim()
    }
}