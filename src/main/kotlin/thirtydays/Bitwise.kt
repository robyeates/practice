package thirtydays

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

//bitwise & is and

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")
        val n = nk[0].trim().toInt()
        val k = nk[1].trim().toInt()
        if (k - 1 or k > n && k % 2 == 0) {
            println(k - 2)
        } else {
            println(k - 1)
        }
    }
}