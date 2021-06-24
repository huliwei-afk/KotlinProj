package Day9

fun String.addExt(amount : Int = 1) = this + "!".repeat(amount)

fun Any.easyPrint() = println(this)

fun <T> T.easyPrintPlus() : T {
    println(this)
    return this
}
fun main() {
    println("abc".addExt(2))
    "abc".easyPrint()
    15.easyPrint()

    "abc".easyPrintPlus().addExt(3).easyPrintPlus()
}