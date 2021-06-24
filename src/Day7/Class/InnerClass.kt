package Day7.Class

class Player{
    class Equipment(var name : String){
        fun show() = println("equipment: $name")
    }

    fun battle(){

    }
}

fun main() {
    Player.Equipment("sharp Knife").show()
}