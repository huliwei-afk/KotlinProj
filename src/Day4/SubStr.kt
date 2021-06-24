package Day4


const val NAME = "Jimmy's a friend"

fun main() {
    val index = NAME.indexOf('\'')
    val str = NAME.substring(0 until index)
    print(str)
}