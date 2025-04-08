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

//Textures
const val player = "◈"
const val empty = "·"
const val snake = "\uD83D\uDC0D"
const val ladder = "\uD83E\uDE9C"
val player1 = "◈".blue().padEnd(6)
val player2 = "◈".red().padEnd(6)

var win = false

//Player thingies
var player1Name = ""
var player2Name = ""

//Things for The Grid
const val row = 10
const val snakesAndLadders = 8

//The Grid
val grid = Array(10) { Array(10) { "0" } }
fun main() {

    //Welcome screen
    println("~".col("#FF0000") + "~".col("#FF1A00") + "~".col("#FF3300") + "~".col("#FF4D00") + "~".col("#FF6600") + "~".col("#FF8000") + "~".col("#FF9900") + "~".col("#FFB200") + "~".col("#FFCC00") + "~".col("#FFE600") + "~".col("#FFFF00") + "~".col("#E6FF00") + "~".col("#CCFF00") + "~".col("#B2FF00") + "~".col("#99FF00") + "~".col("#80FF00") + "~".col("#66FF00") + "~".col("#4DFF00") + "~".col("#33FF00") + "~".col("#1AFF00") + "~".col("#00FF00") + "~".col("#00FF1A") + "~".col("#00FF33") + "~".col("#00FF4D") + "~".col("#00FF66") + "~".col("#00FF80") + "~".col("#00FF99") + "~".col("#00FFB2") + "~".col("#00FFCC") + "~".col("#00FFFF"))
    println("Welcome to Snakes and Ladders!".col("#FFFFFF"))
    println("~".col("#00FFFF") + "~".col("#00FFCC") + "~".col("#00FFB2") + "~".col("#00FF99") + "~".col("#00FF80") + "~".col("#00FF66") + "~".col("#00FF4D") + "~".col("#00FF33") + "~".col("#00FF1A") + "~".col("#00FF00") + "~".col("#1AFF00") + "~".col("#33FF00") + "~".col("#4DFF00") + "~".col("#66FF00") + "~".col("#80FF00") + "~".col("#99FF00") + "~".col("#B2FF00") + "~".col("#CCFF00") + "~".col("#E6FF00") + "~".col("#FFFF00") + "~".col("#FFE600") + "~".col("#FFCC00") + "~".col("#FFB200") + "~".col("#FF9900") + "~".col("#FF8000") + "~".col("#FF6600") + "~".col("#FF4D00") + "~".col("#FF3300") + "~".col("#FF1A00") + "~".col("#FF0000"))

    //Player names
    getNames()
    println("Welcome, $player1Name and $player2Name")
    println()

    //Grid Textures / rules
    println("Snakes and Ladders is a simple game that involves a grid of 100 total squares\nwhere your goal is to reach square 100 while rolling a 6 sided die,\nalong the way there are ladders that take you up spaces and snakes that\ntake you down spaces.")
    println()
    println("Player: ".padEnd(10) + player)
    println("Snake: ".padEnd(10) + snake)
    println("Ladder: ".padEnd(10) + ladder)
    println()

    //Assigning numbers to grid
    var sillyGooseNumber = 0
    var printNumber = 100
    while (sillyGooseNumber < 10) {
        grid[0][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[1][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[2][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[3][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[4][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[5][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[6][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[7][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[8][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }
    sillyGooseNumber = 0
    while (sillyGooseNumber < 10) {
        grid[9][sillyGooseNumber] = printNumber.toString()
        printNumber--
        sillyGooseNumber++
    }

    //Placing Players
    grid[9][9] = player1 + player2.padEnd(12)

    //Placing Snakes and Ladders
    var snakeCount = 0
    while (snakeCount < 8) {
        val snakes = (11..99).random()
        println(snakes)
        snakeCount++
    }

    //Print board
    printBoard()

    while (!win) {
        //Moving the players
        var playermove = 0
        cont("$player1Name, press enter to roll the dice!")
        contt("$player2Name, press enter to roll the dice!")


        /**var findingPlayer1 = false
        var playerNumber = 0
        while (findingPlayer1 == false) {
        while (playerNumber < 10) {
        println(grid[0][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[1][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[2][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[3][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[4][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[5][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[6][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[7][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[8][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        playerNumber = 0
        while (playerNumber < 10) {
        println(grid[9][playerNumber].contains(player1.padEnd(13)))
        playerNumber++
        }
        break
        }
         */

    }
}

fun getString(prompt: String): String {
    var userInput: String
    while(true) {
        println(prompt)

        userInput = readLine().toString()
        if (userInput.isNotBlank()) break
    }
    return userInput
}

fun printBoard() {
    var boardCounter = 0
    var rowCounter = 0
    var printGrid = 0
    while(boardCounter != 1) {
        var numby = 0
        while (numby < 50) {
            println("")
            numby++
        }
        var printNumber = 100
        println("+------".repeat(row) + "+")
        while (printNumber > 90) {
            print("|" + "  ${grid[0][printGrid]}".padEnd(6))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 81
        printGrid = 9
        while (printNumber < 91) {
            print("|" + "  ${grid[1][printGrid]}".padEnd(6))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 80
        printGrid = 0
        while (printNumber > 70) {
            print("|" + "  ${grid[2][printGrid]}".padEnd(6))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 61
        printGrid = 9
        while (printNumber < 71) {
            print("|" + "  ${grid[3][printGrid]}".padEnd(6))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 60
        printGrid = 0
        while (printNumber > 50) {
            print("|" + "  ${grid[4][printGrid]}".padEnd(6))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 41
        printGrid = 9
        while (printNumber < 51) {
            print("|" + "  ${grid[5][printGrid]}".padEnd(6))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 40
        printGrid = 0
        while (printNumber > 30) {
            print("|" + "  ${grid[6][printGrid]}".padEnd(6))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 21
        printGrid = 9
        while (printNumber < 31) {
            print("|" + "  ${grid[7][printGrid]}".padEnd(6))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 20
        printGrid = 0
        while (printNumber > 10) {
            print("|" + "  ${grid[8][printGrid]}".padEnd(6))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        printNumber = 1
        printGrid = 9
        while (printNumber < 11) {
            print("|" + "  ${grid[9][printGrid]}".padEnd(6))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+------".repeat(row) + "+")
        boardCounter++
        rowCounter++
        printNumber--
    }
}

fun cont(prompt: String): String {
    var userInput: String
    while(true) {
        println(prompt)

        userInput = readLine().toString()
        if (userInput.isBlank()) break
    }
    var swapPlace = 
    var die1 = (1..6).random()
    println(die1)
    grid[9][9 - die1] = "$player1".padEnd(13)
    printBoard()
    return ""
}

fun contt(prompt: String): String {
    var userInput: String
    while(true) {
        println(prompt)

        userInput = readLine().toString()
        if (userInput.isBlank()) break
    }
    var die2 = (1..6).random()
    println(die2)
    grid[9][9 - die2] = "$player2".padEnd(13)
    printBoard()
    return ""
}

fun getNames() {
    player1Name = getString("Player 1 enter your name: ")
    player2Name = getString("Player 2 enter your name: ")
}