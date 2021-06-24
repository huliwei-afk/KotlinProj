package Day10.FuncInteract

fun main() {
}

//函数类型参数
val translator : (String) -> Unit = { utterance : String ->
    println(utterance.toLowerCase().capitalize())
}