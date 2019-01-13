package algorithms.easy

import java.util.stream.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    return arr.toList().stream()
        .collect(Collectors.groupingBy<Int, Int> { it })
        .maxBy { it.value.size }
        ?.key!!
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
