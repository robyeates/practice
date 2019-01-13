package algorithms.easy

import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.util.*
import java.util.Locale


/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    //07:05:45PM
    //AM/PM pattern is locale sensitive. If you create a formatter and don't set a java.util.Locale, it'll use the JVM's default
    val fmt = DateTimeFormatterBuilder()
        .parseCaseInsensitive()
        .appendPattern("hh:mm:ssa")
        .toFormatter(Locale.ENGLISH)
    return LocalTime.parse(s, fmt).format(DateTimeFormatter.ISO_LOCAL_TIME)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}