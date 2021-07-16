package game

class Player {
    var name: String? = null

    init {
        println("Hello what is your name?")
        name = readLine()
        println("Welcome $name!")
    }
}