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

// Complete the pangrams function below.
fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {
    //find all contiguous strings in string and then Int,String Map
    val prices = ArrayList<Int>(s.length)
    var currentChar : Char? = s.first()
    var currentCharList = ArrayList<Char>(s.length)

    s.forEach { ch ->
        if (currentChar == ch) {
            currentCharList.add(ch)
        } else if (currentChar != ch){
            currentCharList = ArrayList(s.length) //reset
            currentCharList.add(ch)
            currentChar = ch
        }
        prices.add(ch.toInt().minus(96) * currentCharList.size) //instead of map use ascii value
    }
    val res = ArrayList<String>(queries.size)
    val sorted = prices.sorted().distinct()
    queries.forEach {q -> //fun problem, hashset insertion cost v list insertion vs hashset lookup vs list lookup cost
        if (sorted.binarySearch(q) > -1) res.add("Yes") else res.add("No")
    }
    return res.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val queriesCount = scan.nextLine().trim().toInt()

    val queries = Array<Int>(queriesCount, { 0 })
    for (i in 0 until queriesCount) {
        val queriesItem = scan.nextLine().trim().toInt()
        queries[i] = queriesItem
    }

    val result = weightedUniformStrings(s, queries)

    println(result.joinToString("\n"))
}