package algorithms.easy

import java.util.*

/*
 * Complete the getMoneySpent function below.
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, budget: Int): Int {
    //get elements from both lists that are closest to the budget
    keyboards.sort()
    drives.sort()
    if (keyboards[0] + drives[0] > budget) {
        return -1
    }
    var change = budget
    keyboards.forEach{ kbPrice ->
        drives.forEach { drivePrice ->
            val newChange = budget.minus(kbPrice + drivePrice)
            if (newChange > -1 && newChange < change) {
                change = newChange
            }
        }
    }
    return budget - change
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}