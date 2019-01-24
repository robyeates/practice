package datastructures

import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toMutableList()

    Collections.rotate(a, d.inv()+1)
    println(a.joinToString(" "))
}
