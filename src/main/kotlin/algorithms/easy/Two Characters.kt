package algorithms.easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the alternate function below.
fun alternate(s: String): Int {
    //must be a nicer way :O
    val chars = s.toList().distinct()
    var longest = 0
    chars.forEach { ch -> //outer iterates first char
        var innerIndex = 0
        while (innerIndex != chars.size) {
            if (chars[innerIndex] != ch) { //inner iterates second char if different
                var valid = true

                val removed = s.filter { c -> //form the provided string using only the selected 2 chars
                    c == ch || c == chars[innerIndex]
                }

                removed.forEachIndexed { innerInnerIndex, c ->
                    if(innerInnerIndex != removed.lastIndex && valid) { //check no two chars are the same and fail fast
                        valid = c != removed[innerInnerIndex+1]
                    }
                }

                if (valid && removed.length > longest) { //update the longest length if valid
                    println(removed)
                    longest = removed.length
                }
            }
            innerIndex++
        }
    }
    return longest
}

fun main(args: Array<String>) {
 //   val l = readLine()!!.trim().toInt()

    val s = readLine()!!

    val result = alternate(s)

    println(result)
}
