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

// Complete the permutationEquation function below.
fun permutationEquation(p: Array<Int>): Array<Int> {
    return (1..p.size).map {
            it -> p.indexOf(p.indexOf(it).plus(1)).plus(1)
    }.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}