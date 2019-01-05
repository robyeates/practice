package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test1 {
    @test fun aVeryBigSumTest() {
        assertEquals(5000000015, aVeryBigSum(arrayOf(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L)))
    }
}
