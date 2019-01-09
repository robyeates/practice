package algorithms

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

// Complete the divisibleSumPairs function below.
/**
 * n - ar length
 * k - divisor
 * ar - list to traverse
 */
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var left = 0
    var right = 1
    var divisibleCount = 0
    //is O(n²), can be done in O(n) by bucketing
    while (left < ar.size) {
        while (right < ar.size) {
            if ((ar[left] + ar[right]) % k == 0) {
                divisibleCount++
            }
            right++
        }
        left++
        right=left +1
    }

    return divisibleCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}