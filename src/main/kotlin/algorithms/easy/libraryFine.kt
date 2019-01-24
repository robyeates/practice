package algorithms.easy

import java.time.LocalDate
import java.util.*

// Complete the libraryFine function below.
fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    val returnDate = LocalDate.of(y1, m1, d1)
    val dueDate = LocalDate.of(y2, m2, d2)

    return if (returnDate.isAfter(dueDate)) {
        when {
            returnDate.year > dueDate.year -> 10000
            returnDate.monthValue > dueDate.monthValue -> (returnDate.monthValue - dueDate.monthValue).times(500)
            else -> (returnDate.dayOfMonth - dueDate.dayOfMonth).times(15)
        }
    } else {
        0
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val d1M1Y1 = scan.nextLine().split(" ")

    val d1 = d1M1Y1[0].trim().toInt()

    val m1 = d1M1Y1[1].trim().toInt()

    val y1 = d1M1Y1[2].trim().toInt()

    val d2M2Y2 = scan.nextLine().split(" ")

    val d2 = d2M2Y2[0].trim().toInt()

    val m2 = d2M2Y2[1].trim().toInt()

    val y2 = d2M2Y2[2].trim().toInt()

    val result = libraryFine(d1, m1, y1, d2, m2, y2)

    println(result)
}