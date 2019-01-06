package algorithms

import java.util.*

// Complete the diagonalDifference function below.
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val arrayCount = arr.size
    var firstDiag = 0
    var secondDiag = 0
    repeat(arrayCount) {i ->
        firstDiag += (arr[i][i])
        secondDiag += (arr[(arrayCount - 1 - i)][i])
    }
    return  Math.abs(firstDiag.minus(secondDiag))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}