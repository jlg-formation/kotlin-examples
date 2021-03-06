import game.Player
import game.generateNumberToGuess
import game.guess

/*
  This is the main program
 */
fun main() {
    val jlgPlayer = Player(name = "JLG")
    val player = Player()
    if (player == jlgPlayer) {
        println("Hello my author ${player.getName()}!")
    } else {
        println("Welcome ${player.getName()}!")
    }


    println("Your challenge is to guess a number between 1 and 20")
    val numberToGuess = generateNumberToGuess()
    println("numberToGuess = $numberToGuess")

    val maxTries = 5

    // the game has a limited number of tries
    for (tryIndex in 1..maxTries) {
        println("Try #$tryIndex")
        try {
            guess(numberToGuess)
            println("Bravo ${player.getName()}! Good.")
            return
        } catch (e: Exception) {
            println("Sorry ${player.getName()}. " + e.message)
            continue
        }
    }
    println("Too much tries. Game over.")


}