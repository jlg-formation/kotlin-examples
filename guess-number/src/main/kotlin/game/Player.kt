package game

data class Player(private var name: String? = null) {

    init {
        if (name == null) {
            println("Hello what is your name?")
            name = readLine() ?: throw Error("bad input")
        }
    }

    fun getName(): String {
        return name ?: throw Error("should not come here");
    }

}