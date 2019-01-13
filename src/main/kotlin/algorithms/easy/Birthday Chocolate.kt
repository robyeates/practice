package algorithms.easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/**
 * s - chocolate bar with ints on square
 * d - day of birth - sum of the ints
 * m - month of birth - how many to use
 */
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    val sList = s.toList()
    return s.filterIndexed { index, _ ->
        if (index + m < s.size + 1) {
            sList.subList(index, index + m).sum() == d
        } else {
            false
        }
    }.count()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}