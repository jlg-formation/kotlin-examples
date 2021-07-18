package game

class Player {
    var name: String = ""

    constructor(name: String? = null) {
        if (name != null) {
            this.name = name
            return
        }
        println("Hello what is your name?")
        this.name = readLine() ?: throw Error("bad input")
    }

    override fun equals(other: Any?): Boolean {
        if (!(other is Player)) {
            return false
        }
        return this.name == other.name
    }



    override fun hashCode(): Int {
        return name.hashCode()
    }
}