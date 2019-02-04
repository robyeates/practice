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
import java.util.ArrayList



// Complete the acmTeam function below.
fun acmTeam(topic: Array<String>): Array<Int> {
    val attendence = topic.size
    var prevCount = 0
    var maxSuccess = 0
    val al = ArrayList<Int>()
    for (i in 0 until attendence - 1) {
        for (j in i + 1 until attendence) {
            var count = 0
            for (k in 0 until topic[i].length) {
                if (topic[i][k] != '0' || topic[j][k] != '0') {
                    count++
                }
            }
            if (prevCount < count) {
                prevCount = count
            }
            al.add(count)
        }
    }
    for (n in al) {
        if (n == prevCount) {
            maxSuccess++
        }
    }
    val result = IntArray(2)
    result[0] = prevCount
    result[1] = maxSuccess
    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val topic = Array<String>(n, { "" })
    for (i in 0 until n) {
        val topicItem = scan.nextLine()
        topic[i] = topicItem
    }

    val result = acmTeam(topic)

    println(result.joinToString("\n"))
}