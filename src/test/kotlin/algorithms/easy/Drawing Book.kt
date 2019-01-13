package algorithms.easy

import kotlin.test.assertEquals
import org.junit.Test as test

class Test19 {
    @test fun pageCount() {
        assertEquals(1, pageCount(6, 2))
        assertEquals(0, pageCount(5, 4))
        assertEquals(1, pageCount(7, 4))
        assertEquals(1, pageCount(6, 5))
        assertEquals(0, pageCount(2, 1))
        assertEquals(3478, pageCount(15603, 6957))
    }
}
