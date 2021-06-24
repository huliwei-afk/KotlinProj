package Day7

import java.io.File

//类要被继承要用open修饰
open class Product (val name : String){
    fun description() = "Product: $name"

    //方法要被重写也要用open修饰
    open fun load() = "Nothing.."
}

class LuxuryProduct : Product("Luxury"){
    //加上override关键字
    override fun load() = "LuxuryProduct loading"

    fun special() = "LuxuryProduct special func"
}

fun main() {
    // :Product只会暴露Product类的方法
    // 不会暴露LuxuryProduct自己的方法
    val p : Product = LuxuryProduct()
    println(p.load())

    println(p is Product)
    println(p is LuxuryProduct)
    println(p is File)

//    if(p is LuxuryProduct){
//        println((p as LuxuryProduct).special())
//    }

    println((p as LuxuryProduct).special())
    println(p.special())

    println(p is Any)
    //Any中并没有toString的实现
    //LuxuryProduct里也没有
    //是因为为了支持不同OS有不同的实现
    println(p.toString())

}