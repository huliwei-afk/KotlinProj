package Day10.xuLie

fun Int.isPrime() : Boolean{
    (2 until this).map {
        if(this % it == 0){
            return false
        }
    }
    return true
}

fun main() {
    //集合的take函数和序列的take函数是不一样的

    //在0-5000内找到1000个素数
    val toList = (1..5000).toList().filter { it.isPrime() }.take(1000)
    println(toList.size)

    //序列方式
    val thousandNums = generateSequence(2) { value ->
        value + 1
    }.filter { it.isPrime() }.take(1000)
    println(thousandNums.toList().size)
}