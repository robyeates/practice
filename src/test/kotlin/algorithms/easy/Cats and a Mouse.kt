package algorithms.easy

import kotlin.test.assertEquals
import org.junit.Test as test

class Test22 {
    @test fun catAndMouse() {
        //1 2 3
        //1 3 2
        assertEquals("Cat B", catAndMouse(1, 2, 3))
        assertEquals("Mouse C", catAndMouse(1, 3, 2))
    }
}
