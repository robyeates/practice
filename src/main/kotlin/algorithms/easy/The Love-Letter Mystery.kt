package algorithms.easy

import java.util.*

// Complete the theLoveLetterMystery function below.
fun theLoveLetterMystery(s: String): Int {
    //split in half and find cheaper side
    fun Char.alphaPos() : Int = this.toInt().minus(96)
    val halfIsh = Math.ceil(s.length.toDouble()/2.0).toInt()

    return s.take(halfIsh).map { c -> c.alphaPos() }
        .zip(s.takeLast(halfIsh).map { c -> c.alphaPos() }.reversed())
        .fold(0) {acc, pair -> acc + Math.abs(pair.first - pair.second)}
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = theLoveLetterMystery(s)

        println(result)
    }
}