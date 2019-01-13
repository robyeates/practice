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

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    val results = ArrayList<List<Int>>()
    var tracker = ArrayList<Int>()
    a.sorted().forEach { int ->
        if (tracker.isEmpty() || (tracker.first() == int || tracker.first() == int - 1)) {//checking previous in sequence not
            tracker.add(int)
        } else {
            results.add(tracker)//close list and add to results
            tracker = ArrayList()
            tracker.add(int)
        }
    }
    results.add(tracker)
    return results.maxBy { it.size }!!.size
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}