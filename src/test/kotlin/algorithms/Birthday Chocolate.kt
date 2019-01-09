package algorithms

import kotlin.test.assertEquals
import org.junit.Test as test

class Test13 {
    @test fun birthdayChocolate() {
        assertEquals(2, algorithms.birthday(arrayOf(1, 2, 1, 3, 2), 3, 2))
    }
}