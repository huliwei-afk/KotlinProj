package Day7.Class

data class Student (var name : String, val age : Int){
    private val hobby = "music"
    val subject : String
    var score = 10

    init {
        println("initializing student")
        subject = "math"
    }

    constructor(_name : String) : this(_name, 10){
        score = 100
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, hobby='$hobby', subject='$subject', score=$score)"
    }
}
fun main() {
    val s = Student("jack")
    //copy时并不走次构造函数，所以分数还是10
    val copy = s.copy("Rose")

    println(s)
    println(copy)
}