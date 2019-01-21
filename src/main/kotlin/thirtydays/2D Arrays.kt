package thirtydays

import java.util.*
import java.util.stream.Collectors
import kotlin.collections.*
import kotlin.ranges.*
import kotlin.text.*



fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    var max  = Int.MIN_VALUE
    val hourGlass = HourGlass(arr)
    (0..3).forEach {   //ROWS
        val value = hourGlass.getHourGlassValue()
        if (value > max) max = value
        (0..2).forEach {  //COLUMNS
            hourGlass.addColumn()
            val inner = hourGlass.getHourGlassValue()
            if (inner > max) max = inner
        }
        hourGlass.resetColumns()
        hourGlass.addRow()
    }
    println(max)
}

class HourGlass(val grid : Array<Array<Int>>) {

    var hourGlassPosition : MutableList<Pair<Int, Int>> = getStartPosition()
    var row = 0

    private fun getStartPosition(): MutableList<Pair<Int, Int>> {
        return mutableListOf(
            Pair(0,0), Pair(0,1), Pair(0,2),
                       Pair(1,1),
            Pair(2,0), Pair(2,1), Pair(2,2))
    }

    fun getHourGlassValue() : Int {
        return hourGlassPosition.map { pair ->
            grid[pair.first][pair.second]
        }.sum()
    }

    fun addRow() {
        hourGlassPosition = hourGlassPosition.stream().map { pair ->
            Pair(pair.first.plus(1), pair.second)
        }.collect(Collectors.toList())
        row++
    }

    fun addColumn() {
        hourGlassPosition = hourGlassPosition.stream().map { pair ->
            Pair(pair.first, pair.second.plus(1))
        }.collect(Collectors.toList())
    }

    fun resetColumns() {
        hourGlassPosition = mutableListOf(
            Pair(row,0),     Pair(row,1),     Pair(row,2),
                             Pair(row + 1,1),
            Pair(row + 2,0), Pair(row + 2,1), Pair(row + 2,2))
    }

}