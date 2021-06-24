package Day8.Generic


//class MagicBox<T>(item : T){
//    private var subject : T = item
//    var available = false
//
//    fun fetch() : T?{
//        return subject.takeIf { available }
//    }
//
//}
//
//class Boy(val name : String, val age : Int)
//
//class Dog(val weight : Int)
//
//fun main() {
//    val Box1 = MagicBox(Boy("jack", 20))
//    val Box2 = MagicBox(Dog(20))
//
//    Box1.available = true
//
//    Box1.fetch()?.run {
//        println("you find $name")
//    }
//}