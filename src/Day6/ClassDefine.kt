package Day6

import kotlin.math.absoluteValue

//下划线开头，只用一次的临时变量
class ClassDefine (
    _name : String,
//    _age : Int,
//    _isNormal : Boolean

    var age : Int = 30,
    var isNormal : Boolean
){
    var name = _name
        get() = field.capitalize()
        //设置只读
        private set(value) {
            field = value.trim()
        }

    constructor(name : String) : this(name, age = 10, isNormal = false)
    constructor(name : String, age : Int) : this(name, age = 10 , isNormal = false){
        this.name = name.toUpperCase()
    }

//    var age = _age
//        get() = age.absoluteValue
//        set(value) {
//            field = age.absoluteValue
//        }
//
//    var isNormal = _isNormal
}

fun main() {
    val c = ClassDefine("Jack", 20, true)
//    c.name = "rose"

    val c1 = ClassDefine("Rose")
    val c2 = ClassDefine("Jacky", 20)
    println(c2.name)


}