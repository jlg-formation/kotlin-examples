package game

val maxNumber = 20

fun generateNumberToGuess(): Int {
    return (1..maxNumber).random()
}