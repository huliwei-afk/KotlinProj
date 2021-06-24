package Day10

fun main() {
    val employees = listOf("Jack", "Jimmy", "Tom")
    val shirtSize = listOf("large", "x-large", "medium")

    val employeeSize = employees.zip(shirtSize).toMap()
    println(employeeSize["Jack"])
}