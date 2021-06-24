package Day7.Class

class PlayerScore(val experience : Int, val level : Int) {
    //组件函数
    operator fun component1() = experience
    operator fun component2() = level
}

fun main() {
    val(x, y) = PlayerScore(10, 20)

    println("$x, $y")
}