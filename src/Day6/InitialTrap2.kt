package Day6

class Player2{
    val name : String
    private fun firstLetter() = name[0]

    init {
//        println(firstLetter())
//        name = "jack"

        name = "jack"
        println(firstLetter())
    }
}

fun main() {
    Player2()
}