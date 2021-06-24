package Day10

fun main() {
    val list = listOf("Jack", "Jacky", "Rose", "Jimmy", "Tom").filter { it.contains("J") }
    println(list)

    val list2 = listOf(
        listOf("red apple", "yellow apple", "blue apple"),
        listOf("red fish", "yellow fish"),
        listOf("yellow banana", "red banana")
    )

    var item = list2.map { it.filter { it.contains("red") } }
    println(item)
}