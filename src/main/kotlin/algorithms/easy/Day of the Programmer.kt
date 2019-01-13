package algorithms.easy

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    val date  = LocalDate.parse(
        "0101$year",
        DateTimeFormatter.ofPattern( "ddMMyyyy" , Locale("ru"))
    )
    val df = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    if (year < 1918 && (year%100 == 0)) {
        return df.format(date.plusDays(254))//minus 2 since Julian calendar leap year every 100 years
    }
    if (year == 1918) {
        return df.format(date.plusDays(268))//plus a bunch due to calendar change
    }
    return df.format(date.plusDays(255))//minus 1 since we initialise with the first
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}