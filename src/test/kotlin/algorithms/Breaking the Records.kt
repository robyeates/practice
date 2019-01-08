package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test12 {
    @test fun breakingTheRecords() {
        val highLowPair = breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42))
        assertEquals(4, highLowPair[0])
        assertEquals(0, highLowPair[1])
    }
}
