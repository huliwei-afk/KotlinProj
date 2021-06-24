package Day8.Generic

class MagicBox<T : Human>(){
    //随机产生一个对象，如果不是指定类型就调用备份函数产生一个
//    fun <T> randomOrBackup(backup: () -> T) : T{
//        val items = listOf(
//            Boy("Jack", 20),
//            Man("John",35)
//        )
//
//        val random = items.shuffled().first()
//        return if(random is T){
//            random
//        }else{
//            backup()
//        }
//    }

    //reified关键字要和内联一起使用，保存泛型类型不被擦除
    inline fun <reified T> randomOrBackup(backup: () -> T) : T{
        val items = listOf(
            Boy("Jack", 20),
            Man("John",35)
        )

        val random = items.shuffled().first()
        println(random)
        return if(random is T){
            random
        }else{
            backup()
        }
    }
}
open class Human(val age : Int)
class Boy(val name : String, age : Int) : Human(age){
    override fun toString(): String {
        return "Boy(name='$name', age='$age')"
    }
}

class Man(val name : String, age : Int) : Human(age){
    override fun toString(): String {
        return "Man(name='$name', age='$age')"
    }
}
fun main() {
    val box1 : MagicBox<Man> = MagicBox()
    val subject = box1.randomOrBackup {
        Man("Jimmy", 38)
    }
    println(subject)
}