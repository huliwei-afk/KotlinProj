package Day7.Object

import java.io.File

open class ConfigMap{

    //Kotlin里的静态static实现
    companion object{
        private const val PATH = "xxx"

        fun load() = File(PATH).readBytes()
    }
}

fun main() {
    //实例化ConfigMap或调用load
    //Object才会被实例化
    ConfigMap.load()
}