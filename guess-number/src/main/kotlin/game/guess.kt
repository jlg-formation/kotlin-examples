package game

const val maxNumber = 20

fun generateNumberToGuess(): Int {
    return (1..maxNumber).random()
}

fun guess(numberToGuess: Int) {
    println("Please enter a number: ")
    try {
        val answer = readLine() ?: throw Exception("answer not understood")
        val nbr = answer.toInt()
        when {
            nbr > numberToGuess -> throw Exception("Too big.")
            nbr < numberToGuess -> throw Exception("Too small.")
        }
    } catch (e: Exception) {
        throw Exception("not a number")
    }
}