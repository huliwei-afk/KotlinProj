package Day5.map


fun main() {
    //to是一个函数，返回Pair类型
    val map = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)

    //所以也可以这么创建
//    mapOf(Pair("Jack", 20), Pair("Jimmy", 30))

    println(map["Jack"])
    println(map.getValue("Jack"))
    println(map.getOrElse("Rose") {"Unknown"})
    println(map.getOrDefault("Rose", 0))

    map.forEach{
        println("${it.key}, ${it.value}")
    }

    map.forEach{(key : String, value : Int) ->
        println("$key, $value")
    }
}