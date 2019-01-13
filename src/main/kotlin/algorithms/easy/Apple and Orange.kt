package algorithms.easy

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/**
 * s: integer, starting point of Sam's house location.
 * t: integer, ending location of Sam's house location.
 * a: integer, location of the Apple tree.
 * b: integer, location of the Orange tree.
 * apples: integer array, distances at which each apple falls from the tree.
 * oranges: integer array, distances at which each orange falls from the tree.
 */
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Pair<Int, Int> {
    val mappedApples = apples.map { it -> it.plus(a) }.toList()
    val mappedOranges = oranges.map { it -> it.plus(b) }.toList()

    val housePosition = (s..t).toList()

    val applesNotOnTheHouse =  mappedApples.minus(housePosition)
    val orangesNotOnTheHouse =  mappedOranges.minus(housePosition)

    val res = Pair(
        mappedApples.size - applesNotOnTheHouse.size,
        mappedOranges.size - orangesNotOnTheHouse.size)
    println(res.first)
    println(res.second)
    return res
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}