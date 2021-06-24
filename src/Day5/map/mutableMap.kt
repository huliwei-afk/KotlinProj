package Day5.map

fun main() {
    val mutableMap = mutableMapOf("Jack" to 20, "Jimmy" to 30, "Jason" to 28)

    mutableMap += "Rose" to 8

    mutableMap.put("France", 45)

    //没有获取到就添加进去
    mutableMap.getOrPut("Boss"){23}
    println(mutableMap)
}