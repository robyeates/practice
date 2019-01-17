package algorithms.easy

import hackerrankInString
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.test.assertEquals
import org.junit.Test as test

class Test34 {
    @test fun hackerrankInString() {

        val lines = Files.readAllLines(Paths.get(javaClass.getResource("/data/long.txt").toURI()))

        lines.forEach { line ->
            println(hackerrankInString(line.trim()))

        }
        //assertEquals(18409, pair2.first)
        //assertEquals(19582, pair2.second)
    }
}