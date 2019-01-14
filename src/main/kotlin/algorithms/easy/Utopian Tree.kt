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

// Complete the utopianTree function below.
fun utopianTree(n: Int): Int {
    if (n == 0) {
        return 1
    } else if(n == 1) {
        return 2
    }

    var height = 1
    (1..n).forEach { it ->
        if(it % 2 == 0) {
           height++
       } else {
           height = height.times(2)
       }
    }
    return height
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}
