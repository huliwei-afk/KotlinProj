package Day8.Generic

//class MagicBox<T : Human>(vararg item : T){
//    private var subject : Array<out T> = item
//    var available = false
//    fun fetch(index : Int) : T?{
//        return subject[index].takeIf { available }
//    }
//    //修改元素
//    fun <R> fetch(index: Int, subjectModFunction : (T) -> R) : R?{
//        return subjectModFunction(subject[index]).takeIf { available }
//    }
//    operator fun get(index: Int) : T? = subject[index]?.takeIf { available }
//}
//open class Human(val age : Int)
//class Boy(val name : String, age : Int) : Human(age)
//class Man(val name : String, age : Int) : Human(age)
//fun main() {
//    val Box1 = MagicBox(
//        Boy("jack", 20),
//        Boy("jacky", 20),
//        Boy("john", 20)
//    )
//    Box1.available = true
//    Box1.fetch(1)?.run {
//        println("you find $name")
//    }
//    Box1.fetch(2){
//        val man = Man(it.name, it.age.plus(15))
//        println("Boy ${man.name} change to ${man.age}")
//    }
//    Box1[0]
//}