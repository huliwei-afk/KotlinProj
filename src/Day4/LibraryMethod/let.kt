package Day4.LibraryMethod

fun main() {
    //将对象传给let函数，返回最后一行
    var result = listOf(3,2,1).first().let {
        it * it
    }
    println(result)

    println(formateGreeting(null))
    println(formateGreeting("Jack"))
}


fun formateGreeting(guestName : String?) : String{
    return guestName?.let{
        "Welcome $it"
    } ?: "What's your name?"
}