package Day6

class Player{
    var name : String? = "jack"
        //重写getter setter，因为本身已经提供了
    get() = field!!.capitalize()
    set(value){
        field = value!!.trim()
    }
}

fun main() {
    var p = Player()
    println(p.name)

    p.name = "rose"
    println(p.name)
}