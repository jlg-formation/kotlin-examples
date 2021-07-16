import game.generateNumberToGuess

/*
  This is the main program
 */
fun main(args: Array<String>) {
    println("Hello what is your name?")
    val answer = readLine()
    println("Welcome $answer!")

    println("Your challenge is to guess a number between 1 and 20")
    var numberToGuess = generateNumberToGuess()
    println("numberToGuess = ${numberToGuess}")

    val maxTries = 5
    var tryIndex = 1

    // the game has a limited number of tries
    while (tryIndex <= maxTries) {
        println("Try #$tryIndex")
        tryIndex++
    }
    println("Too much tries. Game over.")
}