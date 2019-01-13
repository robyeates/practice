package algorithms.easy

import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Array<String> {
    val size = arr.size
    var positiveCount = 0.0
    var negativeCount = 0.0
    var zeroCount = 0.0
    arr.iterator().forEach {
        when (it.compareTo(0)) {
            1  -> positiveCount++
            -1 -> negativeCount++
            0 ->  zeroCount++
        }
    }
    //"%.4f".format(num)
    println("%.6f".format(positiveCount.div(size)))
    println("%.6f".format(negativeCount.div(size)))
    println("%.6f".format(zeroCount.div(size)))

    return arrayOf("%.6f".format(positiveCount.div(size)), "%.6f".format(negativeCount.div(size)), "%.6f".format(zeroCount.div(size)))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}