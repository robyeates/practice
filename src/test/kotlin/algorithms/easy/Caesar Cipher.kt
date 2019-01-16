package algorithms.easy

import caesarCipher
import kotlin.test.assertEquals
import org.junit.Test as test

class Test32 {
    @test fun caesarCipher() {
        assertEquals("okffng-Qwvb", caesarCipher("middle-Outz", 2))
    }
}
