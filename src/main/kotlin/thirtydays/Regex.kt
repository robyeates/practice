package thirtydays

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()

    val regex = Regex("@gmail.*")
    val list = mutableListOf<String>()
    for (NItr in 1..N) {
        val firstNameEmailID = scan.nextLine().split(" ")

        val firstName = firstNameEmailID[0]

        val emailID = firstNameEmailID[1]
        if (regex.containsMatchIn(emailID)) {
            list.add(firstName)
        }

    }
    list.sorted().forEach { println(it) }
}
