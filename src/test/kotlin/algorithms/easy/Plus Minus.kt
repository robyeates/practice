package algorithms.easy

import kotlin.test.assertEquals
import org.junit.Test as test

class Test3 {
    @test fun plusMinus() {
        val res : Array<String> = plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))

        assertEquals("0.500000", res[0])
        assertEquals("0.333333", res[1])
        assertEquals("0.166667", res[2])
    }
}

//-4 3 -9 0 4 1
//0.500000
//0.333333
//0.166667