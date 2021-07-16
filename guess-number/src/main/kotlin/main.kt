import game.Player
import game.generateNumberToGuess
import game.guess

/*
  This is the main program
 */
fun main() {
    val player = Player()

    println("Your challenge is to guess a number between 1 and 20")
    val numberToGuess = generateNumberToGuess()
    println("numberToGuess = $numberToGuess")

    val maxTries = 5

    // the game has a limited number of tries
    for (tryIndex in 1..maxTries) {
        println("Try #$tryIndex")
        try {
            guess(numberToGuess)
            println("Bravo ${player.name}! Good.")
            return
        } catch (e: Exception) {
            println("Sorry ${player.name}. " + e.message)
            continue
        }
    }
    println("Too much tries. Game over.")


}