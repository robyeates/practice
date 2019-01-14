package algorithms.easy

import java.nio.file.Files
import java.nio.file.Paths
import kotlin.test.assertEquals
import org.junit.Test as test

class Test24 {
    @test fun theHurdleRace() {
        assertEquals(2, hurdleRace(4, arrayOf(1,6,3,5,2)))
        assertEquals(0, hurdleRace(7, arrayOf(2,5,4,5,2)))
    }
}