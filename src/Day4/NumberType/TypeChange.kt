package Day4.NumberType

import kotlin.math.roundToInt

fun main() {
//    val number : Int = "8.98".toInt()

    val number2 : Int? = "8.98".toIntOrNull()
    println(number2)

    println(8.956735.toInt())
    println(8.956735.roundToInt())

    var s = "%.2f".format(8.956735)
    println(s)

    var d = "%.3f".format(8.956735)
    println(d)
}