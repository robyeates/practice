package algorithms.easy

import java.util.*

// Complete the beautifulBinaryString function below.
fun beautifulBinaryString(b: String): Int {
    return b.zip(b.replace("010", "011")).fold(0) { acc, pair -> if(pair.first != pair.second) acc + 1 else acc }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val b = scan.nextLine()

    val result = beautifulBinaryString(b)

    println(result)
}