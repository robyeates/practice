package algorithms.easy

import kotlin.test.assertEquals
import org.junit.Test as test

class Test26 {
    @test fun utopianTree() {
        assertEquals(1, utopianTree(0))
        assertEquals(2, utopianTree(1))
        assertEquals(7, utopianTree(4))
    }
}
