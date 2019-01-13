package algorithms.easy

import kotlin.test.assertEquals
import org.junit.Test as test

class Test10 {
    @test fun kangaroo() {
        assertEquals("YES", kangaroo(0, 3, 4, 2))
        assertEquals("NO", kangaroo(0, 2, 5, 3))
    }
}