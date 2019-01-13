package algorithms.easy

import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/**
 * x1 - firstKangaroo start position
 * v1 - meters per jump
 *
 * x2 - secondKangaroo start position
 * v2 - meters per jump
 *
 * Note: The two kangaroos must land at the same location after making the same number of jumps.
 */
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    val no = "NO"
    val yes = "YES"
    if (x2 > x1 && v2 > v1) {
        return no
    }
    if (v1 == v2 && x1 != x2) {
        return no
    }
    //find the largest common number before the faster over takes the slower to find the range boundary
    var x1pos = x1
    var x2pos = x2
    if (x1pos > x2pos && v2 > v1) { //if 2 start behind but is faster
        while (x1pos > x2pos) {
            x1pos += v1
            x2pos += v2
        }
        return commonHops(x1, x2, x1pos, x2pos, v1, v2)
    } else if (x2pos > x1pos && v1 > v2) { //if 1 starts behind but is faster
        while (x2pos > x1pos) {
            x1pos += v1
            x2pos += v2
        }
        return commonHops(x1, x2, x1pos, x2pos, v1, v2)
    } else {
        return no
    }
    //create both ranges
    //if they intersect then check how many jumps (divide) it would take to get to each of them

    //same position
    //same jump count

}

fun commonHops(x1: Int, x2: Int, x1pos: Int, x2pos: Int, v1: Int, v2: Int): String {
    val no = "NO"
    val yes = "YES"
    val x1Hops = IntProgression.fromClosedRange(x1, x1pos, v1)
    val x2Hops = IntProgression.fromClosedRange(x2, x2pos, v2)
    val commonHops = x1Hops.intersect(x2Hops)
    if (commonHops.isEmpty()) {
        return no
    } else {
        //for each common hop find how many hops it would take
        if (commonHops.filter { spot ->
                (spot - x1).div(v1) == (spot - x2).div(v2)
            } .any()) {
            return yes
        }
    }
    return no
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}