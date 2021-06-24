package Day7.Class

enum class LicenseStatus{
    UNQUALIFIED,
    LEARNING,
    QUALIFIED;
}

class Driver(var status : LicenseStatus){
    fun checkLicense(): String{
        return when (status){
            LicenseStatus.UNQUALIFIED -> "没资格"
            LicenseStatus.LEARNING -> "学习中"
            LicenseStatus.QUALIFIED -> "有资格"
        }
    }
}

fun main() {
    println(Driver(LicenseStatus.QUALIFIED).checkLicense())
}