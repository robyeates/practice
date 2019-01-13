package algorithms.easy

import java.util.*

/*
 * Complete the getTotalX function below.
 */
fun getTotalX(firstSet: Array<Int>,secondSet: Array<Int>): Int {
    //find all factors b
    val factors = (firstSet.first()..secondSet.last()).asSequence().filter { secondSet.last() % it == 0 }
    //check if the elements of the first array are all factors of the integer being considered
    //the integer being considered is a factor of all elements of the second array
    val wtf = factors.asSequence().filter { it ->
        firstSet.asList().stream().allMatch { fs -> it%fs == 0 } &&
        secondSet.asList().stream().allMatch { fs -> fs%it == 0 }
    }.toList()
    return wtf.size
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val b = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val total = getTotalX(a, b)

    println(total)
}
