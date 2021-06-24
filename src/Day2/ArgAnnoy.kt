package Day2

fun main() {
    val getDiscountWords = {goodsName:String, hour:Int ->
        val currentYear = 2027
        "${currentYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }
    showOnBoard("卫生纸", getDiscountWords)
}

private fun showOnBoard(goodsName:String, showDiscount:(String, Int) -> String){
    val hour = (1..24).shuffled().last()
    println(showDiscount(goodsName, hour))
}


