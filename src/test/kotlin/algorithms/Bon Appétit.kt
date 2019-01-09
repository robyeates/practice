package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test17 {
    @test fun bonAppetit() {
        assertEquals("5", bonAppetit(arrayOf(3, 10, 2, 9),1,12))
        assertEquals("Bon Appetit", bonAppetit(arrayOf(3, 10, 2, 9),1,7))
    }
}