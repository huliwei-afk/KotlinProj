package Day7.Object

open class Player{
    open fun load() = "loading nothing..."
}

fun main() {
    val p = object : Player(){
        override fun load() = "annoy nothing..."
    }

    println(p.load())
}
