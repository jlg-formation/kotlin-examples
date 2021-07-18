package game

data class Player(private var name: String = "") {

    init {
        if (name == "") {
            println("Hello what is your name?")
            name = readLine() ?: throw Error("bad input")
        }
    }

    fun getName(): String {
        return name
    }

}