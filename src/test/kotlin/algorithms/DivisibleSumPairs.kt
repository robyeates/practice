package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test14 {
    @test fun divisibleSumPair() {
        assertEquals(5, divisibleSumPairs(6, 3, arrayOf(1,3,2,6,1,2)))
    }
}