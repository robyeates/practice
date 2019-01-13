package algorithms.easy

import java.util.*

/*
 * Complete the pageCount function below.
 */
fun pageCount(numberOfPages: Int, pageDesired: Int): Int {
    if (numberOfPages > 2 && (numberOfPages - 1 == pageDesired) && numberOfPages % 2 == 0) {
        return 1 //special case
    } else if (numberOfPages == pageDesired || (numberOfPages - 1 == pageDesired)) {
        return 0 //special case
    } else if (pageDesired.toDouble() / numberOfPages.toDouble() < 0.5) { //count up
        return (0..pageDesired step 2).fold(-1) { turns, _ -> turns.inc() }
    } else { //count down
        return (numberOfPages downTo pageDesired step 2).fold(-1) { turns, _ -> turns.inc() }
    }
    //or Math.min(pageDesired/2, numberOfPages/2 - pageDesired/2)//i.e start from front or or fewer turns start from back

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
