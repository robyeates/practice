package thirtydays

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


/**
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird
 */
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    if (n % 2 != 0) {
        println("Weird")
    } else if (n % 2 == 0 && 2 <= n && n <= 5) {
        println("Not Weird")
    } else if (n % 2 == 0 &&6 <= n && n <= 20) {
        println("Weird")
    } else if (n % 2 == 0 && n > 20){
        println("Not Weird")
    }
}
