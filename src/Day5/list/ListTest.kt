package Day5

fun main() {
    val list = listOf("Jason", "Jack", "Jacky")
    //正常取值，这里越界
    //println(list[3])

    //安全取值
    println(list.getOrElse(3){"Unknown"})
    println(list.getOrNull(2) ?: "Unknown")
}