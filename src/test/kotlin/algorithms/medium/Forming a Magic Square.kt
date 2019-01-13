package algorithms.medium

import algorithms.easy.aVeryBigSum
import kotlin.test.assertEquals
import org.junit.Test as test

class Test1 {
    @test fun formingAMagicSquare() {
        assertEquals(1, formingMagicSquare(arrayOf(
            arrayOf(4,9,2),
            arrayOf(3,5,7),
            arrayOf(8,1,5)
        )))
        assertEquals(4, formingMagicSquare(arrayOf(
            arrayOf(4,8,2),
            arrayOf(4,5,7),
            arrayOf(6,1,6)
        )))
    }
}
