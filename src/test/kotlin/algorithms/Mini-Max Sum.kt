package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test5 {
    @test fun miniMaxSum() {
        val pair = miniMaxSum(arrayOf(7, 69, 2, 221, 8974))
        assertEquals(299, pair.first)
        assertEquals(9271, pair.second)


        val secondPair = miniMaxSum(arrayOf(5, 5, 5, 5, 5))
        assertEquals(20, secondPair.first)
        assertEquals(20, secondPair.second)
    }
}

