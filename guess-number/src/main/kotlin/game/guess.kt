package game

val maxNumber = 20

fun generateNumberToGuess(): Int {
    return (1..maxNumber).random()
}

fun guess(numberToGuess: Int): Unit {
    println("Please enter a number: ")
    val answer = readLine()
    val nbr = answer?.toInt() ?: throw Error("not a number")
    if (nbr > numberToGuess ) {
        throw Exception("Too big.")
    }
    if (nbr < numberToGuess) {
        throw Exception("Too small.")
    }
}