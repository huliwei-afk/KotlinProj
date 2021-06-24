package Day10

fun main() {
    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6)).flatMap { it }
    println(list)
}