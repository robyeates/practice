package thirtydays

import java.io.*
import java.nio.file.Paths
import java.util.*

class foo() {
    fun input(): InputStream {
        return javaClass.getResource("/data/dict.txt").openStream()
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(foo().input())

    val n = scan.nextLine().trim().toInt()

    val map = HashMap<String, String>()
    (1..n).forEach {
        val entry : List<String> = scan.nextLine().trim().split(" ")
        map[entry[0]] = entry[1]
    }
    while(scan.hasNextLine()) {
        val key = scan.nextLine().trim()
        if (map.containsKey(key)) {
            println("$key=${map[key]}")
        } else {
            println("Not found")
        }
    }
}