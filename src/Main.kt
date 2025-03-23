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

const val sqaures = 100
const val snakesAndLadders = 8

fun main() {
    //The grid
    val grid = Array(10) { Array(10) { "·" } }

    //Welcome screen
    println("~".col("#FF0000") + "~".col("#FF1A00") +"~".col("#FF3300") +"~".col("#FF4D00") +"~".col("#FF6600") +"~".col("#FF8000") +"~".col("#FF9900") +"~".col("#FFB200") +"~".col("#FFCC00") +"~".col("#FFE600") +"~".col("#FFFF00") +"~".col("#E6FF00") +"~".col("#CCFF00") +"~".col("#B2FF00") +"~".col("#99FF00") +"~".col("#80FF00") +"~".col("#66FF00") +"~".col("#4DFF00") +"~".col("#33FF00") +"~".col("#1AFF00") +"~".col("#00FF00") +"~".col("#00FF1A") +"~".col("#00FF33") +"~".col("#00FF4D") +"~".col("#00FF66") +"~".col("#00FF80") +"~".col("#00FF99") +"~".col("#00FFB2") +"~".col("#00FFCC") +"~".col("#00FFFF"))
    println("Welcome to Snakes and Ladders!".col("#FFFFFF"))
    println("~".col("#00FFFF") + "~".col("#00FFCC") +"~".col("#00FFB2") +"~".col("#00FF99") +"~".col("#00FF80") +"~".col("#00FF66") +"~".col("#00FF4D") +"~".col("#00FF33") +"~".col("#00FF1A") +"~".col("#00FF00") +"~".col("#1AFF00") +"~".col("#33FF00") +"~".col("#4DFF00") +"~".col("#66FF00") +"~".col("#80FF00") +"~".col("#99FF00") +"~".col("#B2FF00") +"~".col("#CCFF00") +"~".col("#E6FF00") +"~".col("#FFFF00") +"~".col("#FFE600") +"~".col("#FFCC00") +"~".col("#FFB200") +"~".col("#FF9900") +"~".col("#FF8000") +"~".col("#FF6600") +"~".col("#FF4D00") +"~".col("#FF3300") +"~".col("#FF1A00") +"~".col("#FF0000"))

    //Grid Textures

    println("The player: ".padEnd(15) + player)
    println("Empty square: ".padEnd(15) + empty)
    println("Snake: ".padEnd(15) + snake)
    println("Ladder: ".padEnd(15) + ladder)

    println("+-----------".repeat()+"+")


}
