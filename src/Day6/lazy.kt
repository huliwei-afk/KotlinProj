package Day6

class lazy (_name : String){
    var name = _name
    //类似单例懒汉式饿汉式
    val config by lazy { loadConfig() }
//  val config = loadConfig()
    private fun loadConfig() : String{
        println("loading...")
        return "xxx"
    }
}

fun main() {
    val l = lazy("Jack")
    Thread.sleep(3000)
    println(l.config)
}