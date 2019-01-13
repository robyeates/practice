package algorithms.easy

import algorithms.easy.aVeryBigSum
import kotlin.test.assertEquals
import org.junit.Test as test

class Test23 {
    @test fun pickingNumbers() {
        assertEquals(3, pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1)))
        assertEquals(5, pickingNumbers(arrayOf(1, 2, 2, 3, 1, 2)))
    }
}
