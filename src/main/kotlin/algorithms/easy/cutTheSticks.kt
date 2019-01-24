package algorithms.easy

import java.util.*

// Complete the cutTheSticks function below.
fun cutTheSticks(arr: Array<Int>): Array<Int> {
    var sticks = arr.toMutableList()
    val results = mutableListOf<Int>()
    while(sticks.size > 0) {
        results.add(sticks.size)
        val min = sticks.min()!!
        sticks = sticks.map { it.minus(min) }.filter { it > 0 }.toMutableList()
    }
    return results.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = cutTheSticks(arr)

    println(result.joinToString("\n"))
}