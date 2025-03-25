/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Snakes and Ladders
 * Project Author: Toby Watkinson
 * GitHub Repo:    https://github.com/waimea-twatkinson2/level-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * Snakes and Ladders is a simple game that involves a grid of 100 total squares
 * where your goal is to reach square 100 while rolling a 6 sided die,
 * along the way there are ladders that take you up spaces and snakes that
 * take you down spaces.
 * =====================================================================
 */

const val player = "◈"
const val empty = "·"
const val snake = "\uD83D\uDC0D"
const val ladder = "\uD83E\uDE9C"

const val row = 10
const val snakesAndLadders = 8

fun main() {
    //The grid
    val grid = Array(10) { Array(10) { 0 } }

    //Welcome screen
    println("~".col("#FF0000") + "~".col("#FF1A00") +"~".col("#FF3300") +"~".col("#FF4D00") +"~".col("#FF6600") +"~".col("#FF8000") +"~".col("#FF9900") +"~".col("#FFB200") +"~".col("#FFCC00") +"~".col("#FFE600") +"~".col("#FFFF00") +"~".col("#E6FF00") +"~".col("#CCFF00") +"~".col("#B2FF00") +"~".col("#99FF00") +"~".col("#80FF00") +"~".col("#66FF00") +"~".col("#4DFF00") +"~".col("#33FF00") +"~".col("#1AFF00") +"~".col("#00FF00") +"~".col("#00FF1A") +"~".col("#00FF33") +"~".col("#00FF4D") +"~".col("#00FF66") +"~".col("#00FF80") +"~".col("#00FF99") +"~".col("#00FFB2") +"~".col("#00FFCC") +"~".col("#00FFFF"))
    println("Welcome to Snakes and Ladders!".col("#FFFFFF"))
    println("~".col("#00FFFF") + "~".col("#00FFCC") +"~".col("#00FFB2") +"~".col("#00FF99") +"~".col("#00FF80") +"~".col("#00FF66") +"~".col("#00FF4D") +"~".col("#00FF33") +"~".col("#00FF1A") +"~".col("#00FF00") +"~".col("#1AFF00") +"~".col("#33FF00") +"~".col("#4DFF00") +"~".col("#66FF00") +"~".col("#80FF00") +"~".col("#99FF00") +"~".col("#B2FF00") +"~".col("#CCFF00") +"~".col("#E6FF00") +"~".col("#FFFF00") +"~".col("#FFE600") +"~".col("#FFCC00") +"~".col("#FFB200") +"~".col("#FF9900") +"~".col("#FF8000") +"~".col("#FF6600") +"~".col("#FF4D00") +"~".col("#FF3300") +"~".col("#FF1A00") +"~".col("#FF0000"))

    //Grid Textures
    println("Player: ".padEnd(10) + player)
    println("Snake: ".padEnd(10) + snake)
    println("Ladder: ".padEnd(10) + ladder)

    //Assigning numbers to grid
    var sillyGooseNumber = 0
    var printNumber = 100
    while (sillyGooseNumber < 10) {
        grid[0][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[1][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[2][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[3][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[4][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[5][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[6][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[7][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[8][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[9][sillyGooseNumber] = printNumber
        printNumber--
        sillyGooseNumber++
    }

    //Placing Snakes and Ladders




    //Print board
    var boardCounter = 0
    var rowCounter = 0
    while(boardCounter != 1) {
        printNumber = 100
        println("+------".repeat(row) + "+")
        while (printNumber > 90) {
            print("|" + "$printNumber".padEnd(6))
            printNumber--
        }
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 81
        while (printNumber < 91) {
            print("|" + "$printNumber".padEnd(6))
            printNumber++
        }
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 80
        while (printNumber > 70) {
            print("|" + "$printNumber".padEnd(6))
            printNumber--
        }
        println("")
        println("+------".repeat(row) + "+")
       printNumber = 61
        while (printNumber < 71) {
            print("|" + "$printNumber".padEnd(6))
            printNumber++
        }
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 60
        while (printNumber > 50) {
            print("|" + "$printNumber".padEnd(6))
            printNumber--
        }
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 41
        while (printNumber < 51) {
            print("|" + "$printNumber".padEnd(6))
            printNumber++
        }
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 40
        while (printNumber > 30) {
            print("|" + "$printNumber".padEnd(6))
            printNumber--
        }
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 21
        while (printNumber < 31) {
            print("|" + "$printNumber".padEnd(6))
            printNumber++
        }
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 20
        while (printNumber > 10) {
            print("|" + "$printNumber".padEnd(6))
            printNumber--
        }
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 1
        while (printNumber < 11) {
            print("|" + "$printNumber".padEnd(6))
            printNumber++
        }
        println("")
        println("+------".repeat(row) + "+")
        boardCounter++
        rowCounter++
        printNumber--
    }

    //


}
