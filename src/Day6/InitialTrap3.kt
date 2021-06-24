package Day6

class Player3(_name : String){
//    val playerName : String = initPlayerName()
//    val name : String = _name

    val name : String = _name
    val playerName : String = initPlayerName()
    private fun initPlayerName() = name
}

fun main() {
    println(Player3("Jack").playerName)
}