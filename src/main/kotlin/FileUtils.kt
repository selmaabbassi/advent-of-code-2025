import java.io.File

class FileUtils(val filename: String) {
    fun readLinesToArray(): List<String> {
        return File(filename).readLines()
    }
}