package algorithms

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): String {
    val annaShouldPay = (bill.sum() - bill[k]) / 2
    val annaRefund = b - annaShouldPay
    if (annaRefund > 0 ) {
        println(annaRefund)
        return annaRefund.toString()
    } else {
        println("Bon Appetit")
        return "Bon Appetit"
    }
}

fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
