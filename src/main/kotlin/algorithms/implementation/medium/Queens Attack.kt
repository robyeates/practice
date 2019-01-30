package algorithms.implementation.medium

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Fun challenge, we want to do as few cycles as possible
 *
 * Find all the movements in each direction
 * Loop all obstacles and reduce the potential movement in each direction when matched
 *
 * Could  do it in less code but I value readability when I'm solving problems with little chunks of time.
 */
fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {

    var verticalMovesNorth = findVerticalMovesNorth(n, r_q, c_q)
    var verticalMovesSouth = findVerticalMovesSouth(n, r_q, c_q)
    var horizontalMovesEast = findHorizontalMovesEast(n, r_q, c_q)
    var horizontalMovesWest = findHorizontalMovesWest(n, r_q, c_q)

    var diagonalMovesNorthEast = findDiagonalMovesNorthEast(n, r_q, c_q)
    var diagonalMovesSouthEast = findDiagonalMovesSouthEast(n, r_q, c_q)
    var diagonalMovesSouthWest = findDiagonalMovesSouthWest(n, r_q, c_q)
    var diagonalMovesNorthWest = findDiagonalMovesNorthWest(n, r_q, c_q)

    //find the obstacles closest to the queen and retain only those, and those which are on the path
    obstacles.forEach { obstacleAr ->
        val obstacle = Pair(obstacleAr[0], obstacleAr[1]) //row = 0, column = 1
        if (obstacle.first == r_q) {
            //obstacle on the same row as the queen, check the horizontals
            if (obstacle.second > c_q) {
                horizontalMovesEast = horizontalMovesEast.filter { position ->
                    position.second < obstacle.second
                }.toMutableSet()
            } else if (obstacle.second < c_q) {
                horizontalMovesWest = horizontalMovesWest.filter { position ->
                    position.second > obstacle.second
                }.toMutableSet()
            }
        } else if (obstacle.second == c_q) {
            if (obstacle.first > r_q) {
                verticalMovesNorth = verticalMovesNorth.filter { position ->
                    position.first < obstacle.first
                }.toMutableSet()
            } else if (obstacle.first < r_q) {
                verticalMovesSouth = verticalMovesSouth.filter { position ->
                    position.first > obstacle.first
                }.toMutableSet()
            }
        } else if (diagonalMovesNorthEast.contains(obstacle)) {
            diagonalMovesNorthEast = diagonalMovesNorthEast.filter { position ->
                position.first < obstacle.first && position.second < obstacle.second
            }.toMutableSet()
        } else if (diagonalMovesSouthEast.contains(obstacle)) {
            diagonalMovesSouthEast = diagonalMovesSouthEast.filter { position ->
                position.first > obstacle.first && position.second < obstacle.second
            }.toMutableSet()
        } else if (diagonalMovesSouthWest.contains(obstacle)) {
            diagonalMovesSouthWest = diagonalMovesSouthWest.filter { position ->
                position.first > obstacle.first && position.second > obstacle.second
            }.toMutableSet()
        } else if (diagonalMovesNorthWest.contains(obstacle)) {
            diagonalMovesNorthWest = diagonalMovesNorthWest.filter { position ->
                position.first < obstacle.first && position.second > obstacle.second
            }.toMutableSet()
        }
    }

    return verticalMovesNorth.size +
            verticalMovesSouth.size +
            horizontalMovesEast.size +
            horizontalMovesWest.size +
            diagonalMovesNorthEast.size +
            diagonalMovesSouthEast.size +
            diagonalMovesSouthWest.size +
            diagonalMovesNorthWest.size
}


fun findVerticalMovesNorth(boardSize : Int, rowPosition : Int, columnPosition : Int) : Set<Pair<Int, Int>> {
    return (rowPosition + 1..boardSize).map { Pair(it, columnPosition) }.toMutableSet()
}

fun findVerticalMovesSouth(boardSize: Int, rowPosition: Int, columnPosition: Int): Set<Pair<Int, Int>> {
    return (rowPosition - 1 downTo 1).map { Pair(it, columnPosition) }.toMutableSet()
}

fun findHorizontalMovesEast(boardSize: Int, rowPosition: Int, columnPosition: Int): Set<Pair<Int, Int>> {
    return (columnPosition + 1..boardSize).map { Pair(rowPosition, it) }.toMutableSet()
}

fun findHorizontalMovesWest(boardSize: Int, rowPosition: Int, columnPosition: Int): Set<Pair<Int, Int>> {
    return (columnPosition - 1 downTo 1).map { Pair(rowPosition, it) }.toMutableSet()
}

fun findDiagonalMovesNorthEast(boardSize: Int, rowPosition: Int, columnPosition: Int): Set<Pair<Int, Int>> {
    var localRow = rowPosition + 1
    var localColumn = columnPosition + 1
    val positions = mutableSetOf<Pair<Int, Int>>()
    while (localRow <= boardSize && localColumn <= boardSize) {
        positions.add(Pair(localRow, localColumn))
        localRow++
        localColumn++
    }
    return positions
}

fun findDiagonalMovesSouthEast(boardSize: Int, rowPosition: Int, columnPosition: Int): Set<Pair<Int, Int>> {
    var localRow = rowPosition - 1
    var localColumn = columnPosition + 1
    val positions = mutableSetOf<Pair<Int, Int>>()
    while (localRow > 0 && localColumn <= boardSize) {
        positions.add(Pair(localRow, localColumn))
        localRow--
        localColumn++
    }
    return positions
}

fun findDiagonalMovesSouthWest(boardSize: Int, rowPosition: Int, columnPosition: Int): Set<Pair<Int, Int>> {
    var localRow = rowPosition - 1
    var localColumn = columnPosition - 1
    val positions = mutableSetOf<Pair<Int, Int>>()
    while (localRow > 0 && localColumn > 0) {
        positions.add(Pair(localRow, localColumn))
        localRow--
        localColumn--
    }
    return positions
}

fun findDiagonalMovesNorthWest(boardSize: Int, rowPosition: Int, columnPosition: Int): Set<Pair<Int, Int>> {
    var localRow = rowPosition + 1
    var localColumn = columnPosition - 1
    val positions = mutableSetOf<Pair<Int, Int>>()
    while (localRow <= boardSize && localColumn > 0) {
        positions.add(Pair(localRow, localColumn))
        localRow++
        localColumn--
    }
    return positions
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val r_qC_q = scan.nextLine().split(" ")

    val r_q = r_qC_q[0].trim().toInt()

    val c_q = r_qC_q[1].trim().toInt()

    val obstacles = Array<Array<Int>>(k, { Array<Int>(2, { 0 }) })

    for (i in 0 until k) {
        obstacles[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = queensAttack(n, k, r_q, c_q, obstacles)

    println(result)
}