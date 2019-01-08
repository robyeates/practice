package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test11 {
    @test fun betweenTwoSets() {
        assertEquals(3, getTotalX(arrayOf(2,4), arrayOf(16,32,96)))
    }
}