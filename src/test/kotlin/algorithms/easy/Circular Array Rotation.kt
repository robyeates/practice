package algorithms.easy

import algorithms.easy.aVeryBigSum
import kotlin.test.assertEquals
import org.junit.Test as test

class Test29 {
    @test fun circularArrayRotation() {
        val res = circularArrayRotation(arrayOf(1, 2, 3), 2, arrayOf(0,1,2))

        assertEquals(2, res[0])
        assertEquals(3, res[1])
        assertEquals(1, res[2])
    }
}
