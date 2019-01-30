package thirtydays

import java.io.*
import java.util.*
import java.util.Collections.swap

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val scan = Scanner(System.`in`)
    scan.nextLine()
    val arr = scan.nextLine().split(" ").map { it.toInt() }

    var totalSwaps = 0
    for (i in 0 until arr.size - 1) {
        // Track number of elements swapped during a single array traversal
        var numberOfSwaps = 0

        for (j in 0 until arr.size - 1) {
            // Swap adjacent elements if they are in decreasing order
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1)
                numberOfSwaps++
            }
        }

        // If no elements were swapped during a traversal, array is sorted
        if (numberOfSwaps == 0) {
            break
        }
        totalSwaps += numberOfSwaps
    }
    println("Array is sorted in $totalSwaps swaps.")
    println("First Element: ${arr.first()}")
    println("Last Element:   ${arr.last()}")
}
