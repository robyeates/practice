package algorithms.hard

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val q = scan.nextLine().trim().split(" ")[1].toInt()

    val mutableList = scan.nextLine().trim().split(" ").map { ch -> ch.toInt() }.toMutableList()

    val set = mutableList.toSet()

    for (qItr in 1..q) {
        val s = scan.nextLine().trim().split(" ").map { ch -> ch.toInt() }
        val chunk = mutableList.slice(IntRange(s[1]-1, s[2]-1).toList())

        //TODO - too slow and need to remove based on index
        //Linked list? shuffling pointers rather than messing about!!
        mutableList.removeAll(chunk)
        when (s[0]) {
            1 -> mutableList.addAll(0, chunk)
            2 -> mutableList.addAll(chunk)
        }
    }
    println(Math.abs(mutableList[0] - mutableList[mutableList.size-1]))
    println(mutableList.joinToString(" "))
}