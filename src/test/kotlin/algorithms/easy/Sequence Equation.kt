package algorithms.easy

import kotlin.test.assertEquals
import org.junit.Test as test

class Test30 {
    @test fun permutationEquationTest() {
        val res = algorithms.easy.permutationEquation(arrayOf(5,2,1,3,4))
        assertEquals(4, res[0])
        assertEquals(2, res[1])
        assertEquals(5, res[2])
        assertEquals(1, res[3])
        assertEquals(3, res[4])
    }
}