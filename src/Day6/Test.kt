package Day6

class Test (
    _name : String,

    var age : Int = 30,
    var isNormal : Boolean
        ){
    var name = _name
        get() = field.capitalize()
        //设置只读
        private set(value) {
            field = value.trim()
        }

    init {
        //require函数要求条件必须要满足才会执行Lambda
        require(age > 0){"age must be positive"}
        require(name.isNotBlank()){"must have a name"}
    }
}

fun main() {
    var t = Test(_name = "", isNormal = false)
    println(t.age)
}