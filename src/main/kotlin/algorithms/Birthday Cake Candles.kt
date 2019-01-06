package algorithms

import java.util.*
import java.util.stream.Collectors.groupingBy

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {
    return ar.toList().stream()
        .collect(groupingBy<Int, Int> { it })
        .maxBy { it.value.size }
        ?.value
        ?.size!!
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}