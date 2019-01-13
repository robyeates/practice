package algorithms.medium

import java.util.*
import java.util.stream.Collectors
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {
    val possibles = listOf(
        arrayOf(
            arrayOf(8, 1, 6),
            arrayOf(3, 5, 7),
            arrayOf(4, 9, 2)
        ),
        arrayOf(
            arrayOf(6, 1, 8),
            arrayOf(7, 5, 3),
            arrayOf(2, 9, 4)
        ),
        arrayOf(
            arrayOf(2, 7, 6),
            arrayOf(9, 5, 1),
            arrayOf(4, 3, 8)
        ),
        arrayOf(
            arrayOf(4, 3, 8),
            arrayOf(9, 5, 1),
            arrayOf(2, 7, 6)
        ),
        arrayOf(
            arrayOf(2, 9, 4),
            arrayOf(7, 5, 3),
            arrayOf(6, 1, 8)
        ),
        arrayOf(
            arrayOf(4, 9, 2),
            arrayOf(3, 5, 7),
            arrayOf(8, 1, 6)
        ),
        arrayOf(
            arrayOf(6, 7, 2),
            arrayOf(1, 5, 9),
            arrayOf(8, 3, 4)
        ),
        arrayOf(
            arrayOf(8, 3, 4),
            arrayOf(1, 5, 9),
            arrayOf(6, 7, 2)
        )
    )
    val results = ArrayList<Int>()
    possibles.forEach { possible ->
        var changes = 0
        (0..2).forEach { row ->
            (0..2).forEach { column ->
                changes += Math.abs(s[row][column] - possible[row][column])

            }
        }
        results.add(changes)
    }
    return results.min()!!
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}