package Day8.Generic

//class MagicBox<T : Human>(item : T){
//    private var subject : T = item
//    var available = false
//    fun fetch() : T?{
//        return subject.takeIf { available }
//    }
//    //修改元素
//    fun <R> fetch(subjectModFunction : (T) -> R) : R?{
//        return subjectModFunction(subject).takeIf { available }
//    }
//}
//
//open class Human(val age : Int)
//class Boy(val name : String, age : Int) : Human(age)
//class Man(val name : String, age : Int) : Human(age)
//class Dog(val weight : Int)
//
//fun main() {
//    val Box1 = MagicBox(Boy("jack", 20))
////    val Box2 = MagicBox(Dog(20))
//    Box1.available = true
//    Box1.fetch()?.run {
//        println("you find $name")
//    }
//    Box1.fetch{
//        val man = Man(it.name, it.age.plus(15))
//        println("Boy change to ${man.age}")
//    }
//}