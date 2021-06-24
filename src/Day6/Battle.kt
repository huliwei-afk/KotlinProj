package Day6

class Battle {

    lateinit var equipment : String

    fun ready(){
        equipment = "sharp knife"
    }

    fun battle(){
        if(::equipment.isInitialized)
            println(equipment)
    }

}

fun main(){
    val p = Battle()

    p.ready()
    p.battle()
}