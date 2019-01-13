package algorithms.easy

import java.util.*
import kotlin.io.*
import kotlin.text.*

//You are given  queries in the form of x, y, and z representing the respective positions for cats A and B, and for mouse C.
//Cat A
//Cat B
//Mouse C
fun catAndMouse(catA: Int, catB: Int, mouse: Int): String {
    if (Math.abs(mouse - catA) == Math.abs(mouse - catB)) {
        return "Mouse C"
    } else if (Math.abs(mouse - catA) > Math.abs(mouse - catB)) {
        return "Cat B"
    }
    return "Cat A"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}