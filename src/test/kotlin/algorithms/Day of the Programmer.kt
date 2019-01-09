package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test16 {
    @test fun dayOfTheProgrammer() {
        assertEquals("13.09.2017", dayOfProgrammer(2017))
        assertEquals("12.09.2016", dayOfProgrammer(2016))
        assertEquals("26.09.1918", dayOfProgrammer(1918))

        assertEquals("12.09.1700", dayOfProgrammer(1700))
        assertEquals("12.09.1800", dayOfProgrammer(1800))
        assertEquals("12.09.1900", dayOfProgrammer(1900))
    }
}
