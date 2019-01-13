package algorithms.easy

import kotlin.test.assertEquals
import org.junit.Test as test

class Test7 {
    @test fun timeConversion() {
        assertEquals("19:05:45", timeConversion("07:05:45PM"))
    }
}