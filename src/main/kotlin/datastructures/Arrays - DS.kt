package datastructures

import java.util.*

// Complete the reverseArray function below.
fun reverseArray(a: Array<Int>): Array<Int> {
    return a.reversed().toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    scan.nextLine()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val res = reverseArray(arr)
    println(res.joinToString(" "))
}
