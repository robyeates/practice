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

// Complete the marsExploration function below.
fun marsExploration(s: String): Int {
    return s.filterIndexed { index, ch ->
        if (index % 3 == 0)  ch != 'S'  else if (index % 3 == 1)ch != 'O' else ch != 'S'
    }.count()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = marsExploration(s)

    println(result)
}