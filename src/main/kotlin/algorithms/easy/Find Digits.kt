package algorithms.easy

import java.util.*

fun findDigits(n: Int): Int {
    return n.toString().toCharArray().map { it.toInt()-48 }.filter {
        when (it) {
            0 -> false
            1 -> true
            else -> n % it == 0
        }
    }.count()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}
