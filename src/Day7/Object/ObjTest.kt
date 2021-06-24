package Day7.Object

//保证一个单例对象
object ApplicationConfig{
    init{
        println("ApplicatonConfig loading...")
    }

    fun doSomething(){
        println("doSomething")
    }
}

fun main() {
    //既是类名，又是实例对象名
    ApplicationConfig.doSomething()

    println(ApplicationConfig)
    println(ApplicationConfig)
}