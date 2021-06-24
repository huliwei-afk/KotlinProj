package Day8

interface Movable{
    //此处声明var报错，具体参见
    //https://stackoverflow.com/questions/41084691/property-in-interface-cannot-have-a-backing-field
    val maxSpeed : Int
    get() = (1..500).shuffled().last()

    var wheels : Int

    fun move(movable: Movable) : String
}

class Car(_name : String, override var wheels: Int ) : Movable{
    override var maxSpeed: Int
        get() = super.maxSpeed
        set(value){ }

    override fun move(movable: Movable): String {
        TODO("Not yet implemented")
    }
}