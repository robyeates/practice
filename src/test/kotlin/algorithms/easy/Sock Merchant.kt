package algorithms.easy

import kotlin.test.assertEquals
import org.junit.Test as test

class Test18 {
    @test fun sockMerchant() {
        val socks = arrayOf(10,20,20,10,10,30,50,10,20)
        assertEquals(3, sockMerchant(socks.size, socks))
        
        val moreSocks = arrayOf(1,1,3,1,2,1,3,3,3,3)
        assertEquals(4, sockMerchant(socks.size, moreSocks))
    }
}