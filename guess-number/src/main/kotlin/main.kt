import game.generateNumberToGuess
import game.guess

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

    // the game has a limited number of tries
    for (tryIndex in 1..maxTries) {
        println("Try #$tryIndex")
        try {
            guess(numberToGuess)
            println("Bravo! Good.")
            return
        } catch (e: Exception) {
            println("Sorry. " + e.message)
            continue
        }
    }
    println("Too much tries. Game over.")


}