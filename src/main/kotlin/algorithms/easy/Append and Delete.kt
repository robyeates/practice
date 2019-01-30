package algorithms.easy

import java.util.*

// Complete the appendAndDelete function below.
fun appendAndDelete(s: String, t: String, k: Int): String {
    var commonLength = 0

    for (i in 0 until java.lang.Math.min(s.length, t.length)) {
        if (s[i] == t[i])
            commonLength++
        else
            break
    }
    return if (s.length + t.length - 2 * commonLength > k) {
        "No"
    } else if ((s.length + t.length - 2 * commonLength) % 2 == k % 2) {
        "Yes"
    } else if (s.length + t.length - k < 0) {
        "Yes"
    } else {
        "No"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine().trim()

    val t = scan.nextLine().trim()

    val k = scan.nextLine().trim().toInt()

    val result = appendAndDelete(s, t, k)

    println(result)
}

/*
hackerhappy
hackerrank
9

aba
aba
7

ashley
ash
2

aaa
a
5

aaaaaaaaaa
aaaaa
7
 */