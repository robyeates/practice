package algorithms.easy

import java.nio.file.Files
import java.nio.file.Paths
import kotlin.test.assertEquals
import org.junit.Test as test

class Test9 {
    @test fun countApplesAndOranges() {

        val pair = countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6))
        assertEquals(1, pair.first)
        assertEquals(1, pair.second)

        val lines = Files.readAllLines(Paths.get(javaClass.getResource("/data/apples.txt").toURI()))

        val pair2 = countApplesAndOranges(
            37455, 87275,
            35609, 89610,
            lines.get(3).split(" ").map { it.toInt() }.toTypedArray(),
            lines.get(4).split(" ").map { it.toInt() }.toTypedArray()
        )
        assertEquals(18409, pair2.first)
        assertEquals(19582, pair2.second)
    }
}