package algorithms.easy

import algorithms.easy.getMoneySpent
import kotlin.test.assertEquals
import org.junit.Test as test

class Test21 {
    @test fun electronicsShop() {
        assertEquals(-1, getMoneySpent(arrayOf(4), arrayOf(5), 5))
        assertEquals(9, getMoneySpent(arrayOf(3, 1), arrayOf(5, 2, 8), 10))
    }
}
