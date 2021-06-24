package Day3

fun main() {
    var str : String? = "butterfly"
    //str = ""
    //str为空则直接跳过不执行
    str = str?.let {
        if(it.isNotBlank()){
            it.capitalize()
        }else{
            "butterfly"
        }
    }
}