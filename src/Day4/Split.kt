package Day4


const val Test = "Jack, Jacky, Jason"

fun main() {
    val data = Test.split(",")
    val(origin, dest, proxy) = Test.split(",")
    println("$origin $dest $proxy")
}