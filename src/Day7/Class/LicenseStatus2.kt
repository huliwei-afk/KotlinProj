package Day7.Class

//用于满足枚举类难以满足的困难需求
sealed class LicenseStatus2 {
    //单例
    object UnQualified : LicenseStatus2()
    object Learning : LicenseStatus2()
    //可以有多个实例
    class Qualified(val licenseId : String) : LicenseStatus2()
}

class Driver2(var status : LicenseStatus2){
    fun checkLicense() : String{
        return when(status){
            is LicenseStatus2.UnQualified -> "没资格"
            is LicenseStatus2.Learning -> "学习中"
            is LicenseStatus2.Qualified -> "有资格，驾驶证编号 ${(this.status as LicenseStatus2.Qualified).licenseId}"
        }
    }
}

fun main() {
    val status = LicenseStatus2.Learning
    val driver = Driver2(status)
    println(driver.checkLicense())

    val status2 = LicenseStatus2.Qualified("23456")
    val driver2 = Driver2(status2)
    println(driver2.checkLicense())

    val status3 = LicenseStatus2.UnQualified
    val driver3 = Driver2(status3)
    println(driver3.checkLicense())
}