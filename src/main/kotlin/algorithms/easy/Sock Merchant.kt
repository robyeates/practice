package algorithms.easy

import java.util.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    return ar.toList().stream()
        .collect(Collectors.groupingBy<Int, Int> { it })
        .mapValues { entry: Map.Entry<Int, MutableList<Int>> ->
            entry.value.size / 2
        }.values.sum()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}