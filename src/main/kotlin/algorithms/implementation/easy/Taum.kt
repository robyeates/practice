package algorithms.implementation.easy

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
 * b: the number of black gifts
w: the number of white gifts
bc: the cost of a black gift
wc: the cost of a white gift
z: the cost to convert one color gift to the other color
 */
fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Int {
    val bLong = b.toLong()
    val wLong = w.toLong()
    val bcLong = bc.toLong()



    if (z < Math.abs(bc.minus(wc))) {
        val cheapest = Math.min(bc, wc).plus(z)
        return if (wc > bc){
            b.times(bc).plus(w.times(cheapest))
        } else {
            w.times(wc).plus(b.times(cheapest))
        }
    }
   return b.times(bc).plus(w.times(wc))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toLong()

    for (tItr in 1..t) {
        val bw = scan.nextLine().split(" ")

        val b = bw[0].trim().toInt()

        val w = bw[1].trim().toInt()

        val bcWcz = scan.nextLine().split(" ")

        val bc = bcWcz[0].trim().toInt()

        val wc = bcWcz[1].trim().toInt()

        val z = bcWcz[2].trim().toInt()

        val result = taumBday(b, w, bc, wc, z)

        println(result)
    }
}