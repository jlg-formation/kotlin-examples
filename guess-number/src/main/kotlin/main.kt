fun main(args: Array<String>) {
    println("Hello what is your name?")
    val answer = readLine()
    println("Welcome $answer!")

    val maxTries = 5
    var tryIndex = 1
    while (tryIndex <= maxTries) {
        println("Try #$tryIndex")
        tryIndex++
    }
    println("Too much tries. Game over.")
}