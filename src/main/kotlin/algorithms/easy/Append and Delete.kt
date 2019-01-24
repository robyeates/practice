package algorithms.easy

import java.util.*

// Complete the appendAndDelete function below.
fun appendAndDelete(s: String, t: String, k: Int): String {
    val sDeque = ArrayDeque(s.split(""))
    val tDeque = ArrayDeque(t.split(""))
    val stuff = ArrayDeque<String>()

    //chop back until all ch match


    var ops = k
    //fails
    //y
    //yu
    //2
    if (sDeque.size > tDeque.size) {
        while (ops > 0 && sDeque.size != tDeque.size) {
            stuff.push(sDeque.pollLast())
            ops++
        }
    } else {
        while (ops > 0 && sDeque.size != tDeque.size) {
            stuff.push(tDeque.pollLast())
            ops++
        }
    }


    //qwerasdf
    //qwerbsdf
    //6



    return if (s.length.plus(t.length) - s.filterIndexed {index, c ->
            index < t.length && t[index] == c
        }.count().times(2) <= k) "Yes" else "No"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val t = scan.nextLine()

    val k = scan.nextLine().trim().toInt()

    val result = appendAndDelete(s, t, k)

    println(result)
}
