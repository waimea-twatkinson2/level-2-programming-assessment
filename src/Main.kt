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
var player1Row = 9
var player2Row = 9
var player1Column = 9
var player2Column = 9
var player1Tile = 1
var player2Tile = 1

//Things for The Grid
const val row = 10
const val snakesAndLadders = 8

//Haha global variables go brrrrrrrr


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
    sillyGoose()

    //Placing Players
    grid[9][9] = player1 + player2.padEnd(12)

    //Placing Snakes and Ladders

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
//Getting user input
fun getString(prompt: String): String {
    var userInput: String
    while(true) {
        println(prompt)

        userInput = readLine().toString()
        if (userInput.isNotBlank()) break
    }
    return userInput
}

//Printing game board
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

//fun cont(prompt: String): String {
 //
//}


//Continuing after player1 says to roll
fun cont(prompt: String): String {
    if (player1Tile < 100) {
        var userInput: String
        while (true) {
            println(prompt)

            userInput = readLine().toString()
            if (userInput.isBlank()) break
        }
        sillyGoose()
        val die = (1..6).random()
        println(die)
        player1Tile = player1Tile + die
        val row = 9 - (player1Tile - 1) / 10
        var col = player1Tile.toString().last()
        var coll = 9 - (col.digitToInt() - 1)
        val row2 = 9 - (player2Tile - 1) / 10
        var col2 = player2Tile.toString().last()
        var coll2 = 9 - (col2.digitToInt() - 1)
        if (coll == 10) {
            coll = 0
        }
        grid[row][coll] = player1.padEnd(13)
        grid[row2][coll2] = player2.padEnd(13)
        if (player1Tile == player2Tile) {
            val row = 9 - (player1Tile - 1) / 10
            var col = player1Tile.toString().last()
            var coll = 9 - (col.digitToInt() - 1)
            val row2 = 9 - (player2Tile - 1) / 10
            var col2 = player2Tile.toString().last()
            var coll2 = 9 - (col2.digitToInt() - 1)
            grid[row][coll] = player1 + player2.padEnd(12)
        }
        printBoard()
        println(die)
        println("[$row],[$coll]")
    }
    else if (player1Tile >= 100) {
        win()
    }
    return ""
}


//Continuing after player2 says to roll
fun contt(prompt: String): String {
    if (player2Tile < 100) {
        var userInput: String
        while (true) {
            println(prompt)

            userInput = readLine().toString()
            if (userInput.isBlank()) break
        }
        sillyGoose()
        val die = (1..6).random()
        println(die)
        player2Tile = player2Tile + die
        val row = 9 - (player1Tile - 1) / 10
        val col = player1Tile.toString().last()
        val coll = 9 - (col.digitToInt() - 1)
        val row2 = 9 - (player2Tile - 1) / 10
        val col2 = player2Tile.toString().last()
        var coll2 = 9 - (col2.digitToInt() - 1)
        if (coll2 == 10) {
            coll2 = 0
        }
        if (player1Tile == player2Tile) {
            val roww = 9 - (player1Tile - 1) / 10
            val coll = player1Tile.toString().last()
            val colll = 9 - (col.digitToInt() - 1)
            val row22 = 9 - (player2Tile - 1) / 10
            val col22 = player2Tile.toString().last()
            var coll22 = 9 - (col2.digitToInt() - 1)
            grid[row][coll] = player1 + player2.padEnd(12)
        }
        else {
            grid[row][coll] = player1.padEnd(13)
            grid[row2][coll2] = player2.padEnd(13)
        }
        printBoard()
        println(die)
        println("[$row],[$coll]")
    }
    else if (player1Tile >= 100) {
        win()
    }
    return ""
}

//Getting player names
fun getNames() {
    player1Name = getString("Player 1 enter your name: ")
    player2Name = getString("Player 2 enter your name: ")
}

//placing snakes


//assigning numbers to board
fun sillyGoose() {
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
}

//moving up rows
fun goUpRow1() {
    player1Row--
    grid[player1Row][player1Column] = player1.padEnd(13)
    println(player1Row)
}
fun goUpRow2() {
    player2Row--
    grid[player2Row][player2Column] = player2.padEnd(13)
    println(player2Row)
}

//actually winning
fun win() {
    if (player1Tile >= 100) {
        win = true
        val winner1Name = player1Name.length
        println("~".repeat(28 + winner1Name))
        println("Congratulations $player1Name, you win!!!")
        println("~".repeat(28 + winner1Name))
    }
    else if (player2Tile >= 100) {
        win = true
        val winner2Name = player2Name.length
        println("~".repeat(28 + winner2Name))
        println("Congratulations $player2Name, you win!!!")
        println("~".repeat(28 + winner2Name))
    }
}