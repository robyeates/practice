package implementation

import java.util.*

private val set = (1..31622).map {
    it*it
}.toSortedSet()

// Complete the squares function below.
fun squares(a: Int, b: Int): Int {
    return set.subSet(a, b).count()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val ab = scan.nextLine().split(" ")

        val a = ab[0].trim().toInt()

        val b = ab[1].trim().toInt()

        val result = squares(a, b)

        println(result)
    }
}