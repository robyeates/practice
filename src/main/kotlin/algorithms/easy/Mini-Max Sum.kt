package algorithms.easy

import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Pair<Long, Long> {
    val max = arr.toList().sorted().subList(1, arr.size).map { i -> i.toLong() } .sum()
    val min = arr.toList().sorted().subList(0, arr.size - 1).map { i -> i.toLong() } .sum()
    println("$min $max")
    return Pair(min, max)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
