package Day8

abstract class Gun(val range : Int) {
    abstract fun pullTrigger() : String
}

class AK47(val price : Int) : Gun(range = 500){
    override fun pullTrigger(): String {
        TODO("Not yet implemented")
    }
}