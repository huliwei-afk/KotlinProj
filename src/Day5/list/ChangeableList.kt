package Day5

fun main() {
    val mutableList = mutableListOf("Jason", "Jack", "Jacky")
    mutableList.add("Jimmy")
    mutableList.remove("Jack")

    //可变list
    println(mutableList)

    //可变与不可变相互转换
    mutableListOf("Jason", "Jack", "Jacky").toList()
    listOf("Jason", "Jack", "Jacky").toMutableList()
}