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

// Complete the hackerrankInString function below.
fun hackerrankInString(s: String): String {
    val hackerRank = "hackerrank"
    var hackerIndex = 0
    return if (s.filter { ch ->
            if (hackerIndex < hackerRank.length && ch == hackerRank[hackerIndex]) {
                hackerIndex++
                true
            } else {
                false
            }
        } == hackerRank) "YES" else "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = hackerrankInString(s)

        println(result)
    }
}
