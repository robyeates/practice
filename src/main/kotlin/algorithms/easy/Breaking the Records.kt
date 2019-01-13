package algorithms.easy

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    val records = HashMap<String, Int>()
    var highScore = scores[0]
    var lowScore = scores[0]

    records["High"] = 0
    records["Low"] = 0

    fun isHigher(score: Int) {
        if (score > highScore) {
            highScore = score
            records.computeIfPresent("High") { _, v -> v.inc() }
        }
    }

    fun isLower(score: Int)  {
        if (score < lowScore) {
            lowScore = score
            records.computeIfPresent("Low") { _, v -> v.inc() }
        }
    }

    scores.forEach { score ->
        isHigher(score)
        isLower(score)
    }

    return arrayOf(records["High"]!!, records["Low"]!!)
}



fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}