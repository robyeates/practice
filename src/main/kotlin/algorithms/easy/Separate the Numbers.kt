package algorithms.easy


import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*
import java.math.BigInteger
// Complete the separateNumbers function below.
fun separateNumbers(s: String): Unit {
    //guess the first number, increment by one and try and find the next
    //string can be 32 digits. To be beautiful it must be the first 16 + 1 so we'll keep checking the first 16 digits
    var beautifulString : String? = null
    (1..(s.length.div(2))).forEach { it ->
        var beautiful = true
        val firstValue = s.substring(0, it).toBigInteger()
        var usedCapacity = firstValue.toString().length
        var nextValue = firstValue.plus(BigInteger.ONE)
        if(beautifulString == null) {
            while (usedCapacity < s.length) {
                val nextValueLength = nextValue.toString().length
                if (usedCapacity + nextValueLength <= s.length && s.substring(usedCapacity, usedCapacity + nextValueLength).toBigInteger() != nextValue) {
                    beautiful = false
                    usedCapacity + s.length
                } else {
                    nextValue++
                }
                usedCapacity += nextValueLength
            }
            if (beautiful && usedCapacity == s.length) { //we've used all values in the string
                beautifulString = firstValue.toString()
            }
        }
    }

    beautifulString?.let {
        println("YES $it")
    } ?: println("NO")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine().trim()

        separateNumbers(s)
    }
}