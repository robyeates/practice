package algorithms.easy

import java.io.*
import java.lang.Integer.reverse
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

// Complete the beautifulDays function below.
fun beautifulDays(i: Int, j: Int, k: Int): Int {
    return (i..j).filter {it ->
        it.minus(reverseInt(it)).toDouble().div(k).rem(1.0) == 0.0
    }.count()
}

fun reverseInt(it: Int): Int {
    var num = it
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    return reversed
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val ijk = scan.nextLine().split(" ")

    val i = ijk[0].trim().toInt()

    val j = ijk[1].trim().toInt()

    val k = ijk[2].trim().toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}