package algorithms.easy

import org.junit.Test
import kotlin.test.assertEquals

class Test8 {
    @Test
    fun gradingStudents() {
        val results = gradingStudents(arrayOf(73, 67, 38, 33))
        assertEquals(75,results[0])
        assertEquals(67,results[1])
        assertEquals(40,results[2])
        assertEquals(33,results[3])
    }
}