package algorithms.easy

import algorithms.easy.staircase
import kotlin.test.assertEquals
import org.junit.Test as test

class Test4 {
    @test fun stairCase() {
        val n = 16
        val list = staircase(n)

        assertEquals(1, list[0].length)
        assertEquals(16, list[n -1].length)
    }
}