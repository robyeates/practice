package algorithms

import java.util.*
import kotlin.collections.*

// Complete the staircase function below.
fun staircase(n: Int): List<String> {
    var counter = 0
    val list = ArrayList<String>()
    while(n > counter) {
        val hash = getHash(counter + 1)
        println(String.format("%${n}s", hash))//needs to be counter + 1 number of #
        counter ++
        list.add(hash)
    }
    return list
}

fun getHash(i: Int): String {
    val list = ArrayList<String>()
    for (h in 1..i) {
        list.add("#")
    }
    return list.joinToString("")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
