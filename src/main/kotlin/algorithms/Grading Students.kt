package algorithms

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*
import java.util.stream.Collectors
import kotlin.collections.ArrayList

/*
 * Complete the gradingStudents function below.
 */
fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map { grade ->
        if (grade > 37) { //ugly
            var nextRem = 5
            var copy = grade
            while (nextRem > 0) {
                nextRem = copy.rem(5)
                if (nextRem > 0) {
                    copy++
                }
            }
            if (copy - grade < 3) {
                grade.plus(copy - grade)
            } else {
                grade
            }
        } else {
            grade
        }
    }.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grades = Array<Int>(n, { 0 })
    for (gradesItr in 0 until n) {
        val gradesItem = scan.nextLine().trim().toInt()
        grades[gradesItr] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}