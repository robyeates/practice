package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test2 {
    @test fun diagonalDifference() {
        val test = arrayOf(
            arrayOf(11, 2,   4),
            arrayOf(4,  5,   6),
            arrayOf(10, 8, -12)
        )

        assertEquals(15, diagonalDifference(test))
    }
}
