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

// Complete the caesarCipher function below.
fun caesarCipher(s: String, k: Int): String {
    val rotated = ('a'..'z').toMutableList()
    Collections.rotate(rotated, k.inv().plus(1))
    val dict = ('a'..'z').toList().zip(rotated).toMap()
    return s.map { c ->
        dict[c.toLowerCase()].let {
            if (c.isUpperCase())dict[c.toLowerCase()]?.toUpperCase() else dict[c]
        } ?: c
    }.joinToString("")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val k = scan.nextLine().trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}