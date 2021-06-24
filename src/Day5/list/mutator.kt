package Day5

fun main() {
    val mutableList = mutableListOf("Jason", "Jack", "Jacky")

    mutableList += "Jimmy"
    println(mutableList)

    mutableList -= "Jack"
    println(mutableList)

    mutableList.removeIf { it.contains("Jacky") }
    println(mutableList)
}
