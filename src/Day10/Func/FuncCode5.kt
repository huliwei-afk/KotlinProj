package Day10

fun main() {
    //fold中是初始累加器的值
    //设定一个函数遍历集合中每个元素都乘3后累加
    val fold = listOf(1, 2, 3, 4).fold(0) { accumulator, number ->
        println("Accumulator value : $accumulator")
        accumulator + (number * 3)
    }
    println("Total value $fold")

    val fold1 = listOf(1, 2, 3, 4).fold(5) { accumulator, number ->
        println("Accumulator value : $accumulator")
        accumulator + (number * 3)
    }
    println(fold1)
}