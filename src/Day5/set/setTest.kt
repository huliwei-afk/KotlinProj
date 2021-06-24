package Day5.set

fun main() {
//    val set = setOf("Jason", "Jacky", "Jack")
//    println(set.elementAt(2))

    //同List的运算符重载 add remove等
    val mutableSet = mutableSetOf("Jason", "Jacky", "Jack")
    mutableSet += "Jimmy"

    //去重
    listOf("Jason", "Jack", "Jack", "Jack")
        .toSet()
        .toList()

    //快捷去重
    listOf("Jason", "Jack", "Jack", "Jacky").distinct()

}