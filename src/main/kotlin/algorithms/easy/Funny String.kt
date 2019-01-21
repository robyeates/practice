package algorithms.easy

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

// Complete the funnyString function below.
fun funnyString(s: String): String {

    val sMapped = s.map { it.toInt() }
    val revMapped : List<Int> = s.reversed().map { it.toInt() }

    fun getDiff(list : List<Int>): MutableList<Int> {
        val sList = mutableListOf<Int>()
        (0..sMapped.size.minus(2)).forEach { it ->
            sList.add(Math.abs(list[it] - list[it + 1]))
        }
        return sList
    }

    return if (getDiff(sMapped).toTypedArray() === (getDiff(revMapped).toTypedArray())) {
        "Funny"
    } else {
        "Not Funny"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = funnyString(s)

        println(result)
    }
}