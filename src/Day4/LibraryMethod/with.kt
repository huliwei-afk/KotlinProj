package Day4.LibraryMethod

fun main() {

    var result1 = "The People's Republic of China".run {
        length >= 10
    }

    //效果一样，传参方式不一样
    var result2 = with("The People's Republic of China"){
        length >= 10
    }
}