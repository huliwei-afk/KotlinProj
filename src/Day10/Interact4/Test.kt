package Day10.Interact4

import java.io.IOException
import kotlin.jvm.Throws

fun main() {
    var test = Exception()

    //java中的异常，kt可以不处理，也可以用try/catch处理
    test.IOExcep()
    test.runExcep()
}

@Throws(IOException::class)
fun TestExcep(){
    throw IOException()
}
