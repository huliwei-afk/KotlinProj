package Day5

fun main() {
    val mutableList = mutableListOf("Jason", "Jack", "Jacky")

    for(s in mutableList){
        println(s)
    }

    mutableList.forEach{
        println(it)
    }

    mutableList.forEachIndexed { index, item ->
        println("$index $item")
    }

    val(origin, _, proxy) = mutableList
}




