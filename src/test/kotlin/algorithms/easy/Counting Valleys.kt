package algorithms.easy

import algorithms.easy.countingValleys
import kotlin.test.assertEquals
import org.junit.Test as test

class Test20 {
    @test fun aVeryBigSumTest() {
        assertEquals(1, countingValleys(8, "UDDDUDUU"))
    }
}
