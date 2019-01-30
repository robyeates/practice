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

// Complete the repeatedString function below.
/**
 * aba pattern which repeats forver
10 sample size

abaabaabaa
 7
 */
fun repeatedString(s: String, n: Long): Long {
    //count the a's
    val count = Collections.frequency(s.toList(),'a')
    val factor = n/s.length
    val leftover = n%s.length
    var longCount = count.toLong()
    longCount *= factor

    var subStringCount = 0
    for (i in 0 until leftover) {
       if (s[i.toInt()] == 'a')  {
           subStringCount++
       }
    }
    return longCount + subStringCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}