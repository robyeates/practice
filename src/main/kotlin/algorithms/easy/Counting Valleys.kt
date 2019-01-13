package algorithms.easy

import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    var valleyCount = 0
    var level = 0
    s.forEach { char ->
        if (char == 'U') {
            if (level == -1){
                valleyCount++
            }
            level ++
        } else {
            level --
        }
    }
    return valleyCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}