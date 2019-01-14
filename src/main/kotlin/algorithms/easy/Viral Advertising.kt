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

// Complete the viralAdvertising function below.
fun viralAdvertising(n: Int): Int {
    var shared = 5
    return (1..n).fold (0) { cumulativeLikes, day ->
        val looper = cumulativeLikes.plus(shared.div(2))
        shared = shared.div(2).times(3)
         looper //add to cumulativeLikes
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}