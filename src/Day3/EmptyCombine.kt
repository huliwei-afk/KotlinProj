package Day3

fun main() {
    var str : String? = null
    str = str ?: "Kotlin"
    println(str)

    str = "Java"
    str = str ?: "Kotlin"
    println(str)
}