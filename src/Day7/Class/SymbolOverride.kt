package Day7.Class

data class Coordinator(var x : Int, var y : Int){
    val isBounds = x > 0 && y > 0

    operator fun plus(other : Coordinator) = Coordinator(x + other.x, y + other.y)
}

fun main() {
    val c1 = Coordinator(10, 20)
    val c2 = Coordinator(10, 20)

    println(c1 + c2)
}