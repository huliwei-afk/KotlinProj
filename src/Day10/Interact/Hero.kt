@file:JvmName("Mykt")

package Day10.Interact
fun main() {
    val adversary = Java()
    println(adversary.utterGreeting())

    //level : String! ->平台类型
    var level = adversary.determineFriendshipLevel()
    level?.toLowerCase()
    println(adversary.hitpoints.javaClass)
}

fun sayHello(){
    println("Hello! babe!")
}

