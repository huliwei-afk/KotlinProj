package Day4.LibraryMethod

import java.io.File

fun main() {
    var file = File("E://i have a dream_copy.txt")
    var result = file.run {
        readText().contains("great")
    }

    print(result)

    var result2 = "The People's Republic of China".run { (::isLong) }
    println(result2)

    "The People's Republic of China"
        .run(::isLong)
        .run(::showMessage)
        .run(::println)
}

fun isLong(name : String) = name.length >= 10

fun showMessage(isLong : Boolean) : String{
    return if (isLong){
        "Name is too long"
    }else{
        "Please rename"
    }
}