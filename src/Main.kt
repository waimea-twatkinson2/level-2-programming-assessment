import kotlin.system.exitProcess

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
var player1Turn = 0
var player2Turn = 0

//Things for The Grid
const val row = 10
const val snakesAndLadders = 8
var snake0 = 0
var snake1 = 0
var snake2 = 0
var snake3 = 0
var snake4 = 0
var snake5 = 0
var snake6 = 0
var snake7 = 0
var ladder0 = 0
var ladder1 = 0
var ladder2 = 0
var ladder3 = 0
var ladder4 = 0
var ladder5 = 0
var ladder6 = 0
var ladder7 = 0

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
    println()
    println()
    println()
    println("~~~~~~~~~~~~~~~~~~~~")
    println("Press enter to play!")
    println("~~~~~~~~~~~~~~~~~~~~")
    enterContinue("")
    println()
    //Assigning numbers to grid
    sillyGoose()

    //Placing Players
    grid[9][9] = player1 + player2.padEnd(12)

    //Placing Snakes and Ladders
    snakeNums()
    ladderNums()
    snakePlace()
    ladderPlace()

    //Print board
    printBoard()

    while (!win) {
        //Moving the players
        var playermove = 0
        cont("$player1Name, press enter to roll the dice!")
        contt("$player2Name, press enter to roll the dice!")
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
        println("+-------".repeat(row) + "+")
        while (printNumber > 90) {
            print("|" + "  ${grid[0][printGrid]}".padEnd(7))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 81
        printGrid = 9
        while (printNumber < 91) {
            print("|" + "  ${grid[1][printGrid]}".padEnd(7))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 80
        printGrid = 0
        while (printNumber > 70) {
            print("|" + "  ${grid[2][printGrid]}".padEnd(7))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 61
        printGrid = 9
        while (printNumber < 71) {
            print("|" + "  ${grid[3][printGrid]}".padEnd(7))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 60
        printGrid = 0
        while (printNumber > 50) {
            print("|" + "  ${grid[4][printGrid]}".padEnd(7))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 41
        printGrid = 9
        while (printNumber < 51) {
            print("|" + "  ${grid[5][printGrid]}".padEnd(7))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 40
        printGrid = 0
        while (printNumber > 30) {
            print("|" + "  ${grid[6][printGrid]}".padEnd(7))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 21
        printGrid = 9
        while (printNumber < 31) {
            print("|" + "  ${grid[7][printGrid]}".padEnd(7))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 20
        printGrid = 0
        while (printNumber > 10) {
            print("|" + "  ${grid[8][printGrid]}".padEnd(7))
            printNumber--
            printGrid++
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
        printNumber = 1
        printGrid = 9
        while (printNumber < 11) {
            print("|" + "  ${grid[9][printGrid]}".padEnd(7))
            printNumber++
            printGrid--
        }
        print("|")
        println("")
        println("+-------".repeat(row) + "+")
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
        //resetting the numbers
        sillyGoose()
        //rolling the dice
        val die = (1..6).random()
        println(die)
        //updating the players location
        player1Tile = player1Tile + die
        //finding grid locations of the players
        var row = 9 - (player1Tile - 1) / 10
        var col = player1Tile.toString().last()
        var coll = 9 - (col.digitToInt() - 1)
        val row2 = 9 - (player2Tile - 1) / 10
        var col2 = player2Tile.toString().last()
        var coll2 = 9 - (col2.digitToInt() - 1)
        //bug fixing
        if (coll == 10) {
            println(coll)
            coll = 0
        }
        if (coll2 == 10) {
            coll2 = 0
        }
        //wincheck
        win()
        //checking for snake
        if (player1Tile == snake0 || player1Tile == snake1 || player1Tile == snake2 || player1Tile == snake3 || player1Tile == snake4 || player1Tile == snake5 || player1Tile == snake6 || player1Tile == snake7) {
            player1Tile = player1Tile - (5..30).random()
            row = 9 - (player1Tile - 1) / 10
            col = player1Tile.toString().last()
            coll = 9 - (col.digitToInt() - 1)
            if (coll == 10) {
                coll = 0
            }
            if (player1Tile < 2) {
                player1Tile = 0
            }
            grid[row][coll] = player1.padEnd(14)
        }
        //CHECKING FOR LADDER
        if (player1Tile == ladder0 || player1Tile == ladder1 || player1Tile == ladder2 || player1Tile == ladder3 || player1Tile == ladder4 || player1Tile == ladder5 || player1Tile == ladder6 || player1Tile == ladder7)  {
            player1Tile = player1Tile + (5..30).random()
            row = 9 - (player1Tile - 1) / 10
            col = player1Tile.toString().last()
            coll = 9 - (col.digitToInt() - 1)
            if (coll == 10) {
                coll = 0
            }
            grid[row][coll] = player1.padEnd(14)
        }
        //assigning the player to their square
        else {
            grid[row][coll] = player1.padEnd(14)
            grid[row2][coll2] = player2.padEnd(14)
        }
        if (player1Tile < 2) {
            player1Tile = 1
            row = 9 - (player1Tile - 1) / 10
            col = player1Tile.toString().last()
            coll = 9 - (col.digitToInt() - 1)
            grid[row][coll] = player1.padEnd(14)

        }
        //showing things
        snakePlace()
        ladderPlace()
        grid[row][coll] = player1.padEnd(14)
        grid[row2][coll2] = player2.padEnd(14)
        //preparing for the players to be on the same square
        if (player1Tile == player2Tile) {
            val row = 9 - (player1Tile - 1) / 10
            var col = player1Tile.toString().last()
            var coll = 9 - (col.digitToInt() - 1)
            val row2 = 9 - (player2Tile - 1) / 10
            var col2 = player2Tile.toString().last()
            var coll2 = 9 - (col2.digitToInt() - 1)
            println("[$row],[$coll]")
            grid[row][coll] = player1 + player2.padEnd(13)
        }
        printBoard()
        player1Turn++
        println(die)
        println("[$row],[$coll]")
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
        //resetting the numbers
        sillyGoose()
        //rolling the dice
        val die = (1..6).random()
        println(die)
        //updating the players location
        player2Tile = player2Tile + die
        //finding grid locations of the players
        var row = 9 - (player1Tile - 1) / 10
        var col = player1Tile.toString().last()
        var coll = 9 - (col.digitToInt() - 1)
        var row2 = 9 - (player2Tile - 1) / 10
        var col2 = player2Tile.toString().last()
        var coll2 = 9 - (col2.digitToInt() - 1)
        //bug fixing
        if (coll == 10) {
            println(coll)
            coll = 0
        }
        if (coll2 == 10) {
            coll2 = 0
        }
        //wincheck
        win()
        //checking for snake
        if (player2Tile == snake0 || player2Tile == snake1 || player2Tile == snake2 || player2Tile == snake3 || player2Tile == snake4 || player2Tile == snake5 || player2Tile == snake6 || player2Tile == snake7)  {
            player2Tile = player2Tile - (5..30).random()
            row2 = 9 - (player2Tile - 1) / 10
            col2 = player2Tile.toString().last()
            coll2 = 9 - (col.digitToInt() - 1)
            if (coll2 == 10) {
                coll2 = 0
            }
            if (player2Tile < 2) {
                player2Tile = 0
            }
            grid[row2][coll2] = player2.padEnd(14)
        }
        //CHECKING FOR LADDER
        if (player2Tile == ladder0 || player2Tile == ladder1 || player2Tile == ladder2 || player2Tile == ladder3 || player2Tile == ladder4 || player2Tile == ladder5 || player2Tile == ladder6 || player2Tile == ladder7)  {
            player2Tile = player2Tile + (5..30).random()
            row2 = 9 - (player2Tile - 1) / 10
            col2 = player2Tile.toString().last()
            coll2 = 9 - (col.digitToInt() - 1)
            if (coll2 == 10) {
                coll2 = 0
            }
            grid[row2][coll2] = player2.padEnd(14)
        }
        //assigning the player to their square
        else {
            grid[row][coll] = player1.padEnd(14)
            grid[row2][coll2] = player2.padEnd(14)
        }
        if (player2Tile < 2) {
            player2Tile = 1
            row2 = 9 - (player2Tile - 1) / 10
            col2 = player2Tile.toString().last()
            coll2 = 9 - (col.digitToInt() - 1)
            grid[row2][coll2] = player2.padEnd(14)

        }
        //showing things
        snakePlace()
        ladderPlace()
        grid[row][coll] = player1.padEnd(14)
        grid[row2][coll2] = player2.padEnd(14)
        //preparing for the players to be on the same square
        if (player1Tile == player2Tile) {
            val row = 9 - (player1Tile - 1) / 10
            var col = player1Tile.toString().last()
            var coll = 9 - (col.digitToInt() - 1)
            val row2 = 9 - (player2Tile - 1) / 10
            var col2 = player2Tile.toString().last()
            var coll2 = 9 - (col2.digitToInt() - 1)
            println("[$row],[$coll]")
            grid[row][coll] = player1 + player2.padEnd(13)
        }
        printBoard()
        player2Turn++
        println(die)
        println("[$row],[$coll]")
    }
    return ""
}

//Getting player names
fun getNames() {
    player1Name = getString("Player 1 enter your name: ")
    player2Name = getString("Player 2 enter your name: ")
}

//placing snakes
fun snakeNums() {
    snake0 = (11..99).random()
    snake1 = (11..99).random()
    snake2 = (11..99).random()
    snake3 = (11..99).random()
    snake4 = (11..99).random()
    snake5 = (11..99).random()
    snake6 = (11..99).random()
    snake7 = (11..99).random()
}
fun snakePlace() {
    val row = 9 - (snake0 - 1) / 10
    val col = snake0.toString().last()
    var coll = 9 - (col.digitToInt() - 1)
    val row1 = 9 - (snake1 - 1) / 10
    val col1 = snake1.toString().last()
    var coll1 = 9 - (col1.digitToInt() - 1)
    val row2 = 9 - (snake2 - 1) / 10
    val col2 = snake2.toString().last()
    var coll2 = 9 - (col2.digitToInt() - 1)
    val row3 = 9 - (snake3 - 1) / 10
    val col3 = snake3.toString().last()
    var coll3 = 9 - (col3.digitToInt() - 1)
    val row4 = 9 - (snake4 - 1) / 10
    val col4 = snake4.toString().last()
    var coll4 = 9 - (col4.digitToInt() - 1)
    val row5 = 9 - (snake5 - 1) / 10
    val col5 = snake5.toString().last()
    var coll5 = 9 - (col5.digitToInt() - 1)
    val row6 = 9 - (snake6 - 1) / 10
    val col6 = snake6.toString().last()
    var coll6 = 9 - (col6.digitToInt() - 1)
    val row7 = 9 - (snake7 - 1) / 10
    val col7 = snake7.toString().last()
    var coll7 = 9 - (col7.digitToInt() - 1)
    if (coll >= 10) {
        coll = 0
    }
    if (coll1 >= 10) {
        coll1 = 0
    }
    if (coll2 >= 10) {
        coll3 = 0
    }
    if (coll3 >= 10) {
        coll4 = 0
    }
    if (coll4 >= 10) {
        coll5 = 0
    }
    if (coll5 >= 10) {
        coll5 = 0
    }
    if (coll6 >= 10) {
        coll6 = 0
    }
    if (coll7 >= 10) {
        coll7 = 0
    }
    if(grid[row][coll] != snake) {
        grid[row][coll] = snake
    }
    grid[row1][coll1] = snake.padEnd(1)
    grid[row2][coll2] = snake.padEnd(1)
    grid[row3][coll3] = snake.padEnd(1)
    grid[row4][coll4] = snake.padEnd(1)
    grid[row5][coll5] = snake.padEnd(1)
    grid[row6][coll6] = snake.padEnd(1)
    grid[row7][coll7] = snake.padEnd(1)
}

//placing ladders
fun ladderNums() {
    ladder0 = (1..99).random()
    ladder1 = (1..99).random()
    ladder2 = (1..99).random()
    ladder3 = (1..99).random()
    ladder4 = (1..99).random()
    ladder5 = (1..99).random()
    ladder6 = (1..99).random()
    ladder7 = (1..99).random()
}
fun ladderPlace() {
    val row = 9 - (ladder0 - 1) / 10
    val col = ladder0.toString().last()
    var coll = 9 - (col.digitToInt() - 1)
    val row1 = 9 - (ladder1 - 1) / 10
    val col1 = ladder1.toString().last()
    var coll1 = 9 - (col1.digitToInt() - 1)
    val row2 = 9 - (ladder2 - 1) / 10
    val col2 = ladder2.toString().last()
    var coll2 = 9 - (col2.digitToInt() - 1)
    val row3 = 9 - (ladder3 - 1) / 10
    val col3 = ladder3.toString().last()
    var coll3 = 9 - (col3.digitToInt() - 1)
    val row4 = 9 - (ladder4 - 1) / 10
    val col4 = ladder4.toString().last()
    var coll4 = 9 - (col4.digitToInt() - 1)
    val row5 = 9 - (ladder5 - 1) / 10
    val col5 = ladder5.toString().last()
    var coll5 = 9 - (col5.digitToInt() - 1)
    val row6 = 9 - (ladder6 - 1) / 10
    val col6 = ladder6.toString().last()
    var coll6 = 9 - (col6.digitToInt() - 1)
    val row7 = 9 - (ladder7 - 1) / 10
    val col7 = ladder7.toString().last()
    var coll7 = 9 - (col7.digitToInt() - 1)
    if (coll >= 10) {
        coll = 0
    }
    if (coll1 >= 10) {
        coll1 = 0
    }
    if (coll2 >= 10) {
        coll3 = 0
    }
    if (coll3 >= 10) {
        coll4 = 0
    }
    if (coll4 >= 10) {
        coll5 = 0
    }
    if (coll5 >= 10) {
        coll5 = 0
    }
    if (coll6 >= 10) {
        coll6 = 0
    }
    if (coll7 >= 10) {
        coll7 = 0
    }
    if(grid[row][coll] != ladder) {
        grid[row][coll] = ladder
    }
    grid[row1][coll1] = ladder
    grid[row2][coll2] = ladder
    grid[row3][coll3] = ladder
    grid[row4][coll4] = ladder
    grid[row5][coll5] = ladder
    grid[row6][coll6] = ladder
    grid[row7][coll7] = ladder
}

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
    if (player1Tile > 99) {
        win = true
        val winner1Name = player1Name.length
        snakePlace()
        ladderPlace()
        printBoard()
        println("~".repeat(28 + winner1Name))
        println("Congratulations $player1Name, you win!!!")
        println("-".repeat(28 + winner1Name))
        println("it took you $player1Turn turns!")
        println("~".repeat(28 + winner1Name))
        exitProcess(0)
    }
    else if (player2Tile > 99) {
        win = true
        val winner2Name = player2Name.length
        snakePlace()
        ladderPlace()
        printBoard()
        println("~".repeat(28 + winner2Name))
        println("Congratulations $player2Name, you win!!!")
        println("-".repeat(28 + winner2Name))
        println("it took you $player2Turn turns!")
        println("~".repeat(28 + winner2Name))
        exitProcess(0)
    }
}

//continuing things
fun enterContinue(prompt: String): String {
    var userInput: String
    while (true) {
        println(prompt)

        userInput = readLine().toString()
        if (userInput.isBlank()) break
    }
    return ""
}