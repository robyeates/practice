package algorithms.easy

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

// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val alphabet = HashMap<Char, Int>()
    ('a'..'z').forEachIndexed { index, c ->  //should be associate but we need to index for the Array
        alphabet[c] = h[index]
    }

    val height = word.map { ch ->
        alphabet[ch]
    }.maxBy { it!! }

    return word.length.times(height!!)
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}