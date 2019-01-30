package algorithms.implementation.easy

import java.util.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the equalizeArray function below.
fun equalizeArray(arr: Array<Int>): Int {
    return arr.size - arr.toList().stream()
        .collect(Collectors.groupingBy<Int, Int> { it })
        .maxBy { it.value.size }
        ?.value
        ?.size!!
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = equalizeArray(arr)

    println(result)
}
