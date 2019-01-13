package algorithms.medium

import java.util.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// over answers the questions, could have just pulled distinct scores
fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    val map = scores.toList().parallelStream()
        .collect(Collectors.groupingBy<Int, Int> { it })
        .toSortedMap()

    val cleanUp = HashMap<Int, List<Int>>()
    val standings = ArrayList<Int>()

    fun dumpEntries() {
        cleanUp.entries.forEach { e ->
            map.remove(e.key, e.value)
        }
        cleanUp.clear()
    }

    fun getRank(score : Int) : Int {
        //get position of same or next highest score, chop and set that as the map so next time we don't iterate the full map.
        //map = map.tailMap(score) is too expensive for test cases so we have to handroll ;/
        val it = map.entries.iterator()
        while (it.hasNext()) {
            val entry = it.next()
            if (entry.key == score) {
                dumpEntries()
                return map.size
            } else if (entry.key > score){
                dumpEntries()
                return map.size + 1 //one for the fact we are the position below
            } else if (entry.key < score) {
                cleanUp[entry.key] = entry.value //mark it to be removed to save iterations next time
            }
        }
        return 1
    }

    alice.forEach { score ->
        standings.add(getRank(score))
    }
    return standings.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scoresCount = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val aliceCount = scan.nextLine().trim().toInt()

    val alice = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)

    println(result.joinToString("\n"))
}