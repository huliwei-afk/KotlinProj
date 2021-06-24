package Day3

import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    var number : Int? = null

    try {
        check(number)
        number!!.plus(1)
    }catch (e : Exception){
        print(e)
    }

}

fun check(number : Int?){
    //number ?: throw MyException()
    checkNotNull(number) { "Not Good" }
}

class MyException() : IllegalArgumentException("操作不当")