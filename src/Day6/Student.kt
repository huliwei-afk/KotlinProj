package Day6

class Student (
    //主构造函数
    _name : String,
    val age : Int
        ){
    //类级别赋值
    var name = _name
    var score = 10
    private var hobby =  "music"
    val subject : String

    init{
        //初始化块
        println("initializing is processing")
        subject = "math"
    }

    //次构造函数
    constructor(_name : String) : this(_name, age = 10){
        score = 20
    }
}

fun main(){
    Student("Jack")
}

