package algorithms.easy

import java.util.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {
    var index = 0
    var steps = 0
    while (index < c.size - 1)
        if (index + 2 < c.size && c[index + 2] == 0 ) {
            steps++
            index += 2
        } else {
            steps++
            index++
    }
    return steps
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
