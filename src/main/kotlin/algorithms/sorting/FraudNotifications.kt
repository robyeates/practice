package algorithms.sorting

import java.util.*

// Complete the activityNotifications function below.
fun activityNotifications(expenditure: Array<Int>, d: Int): Int {
    var notifications = 0
    (d..(expenditure.size - 1)).forEach { day ->

        //TODO this but faster
        //TODO for each or batch hit?
        val median = median(expenditure.copyOfRange(day - d, day))




        if (expenditure[day] >= median.times(2)) {
            notifications++
        }
    }
    return notifications
}

fun median(l: Array<Int>) = l.sorted().let { (
        it[it.size / 2].toDouble() +
                it[(it.size - 1) / 2].toDouble()) / 2 }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val expenditure = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = activityNotifications(expenditure, d)

    println(result)
}
