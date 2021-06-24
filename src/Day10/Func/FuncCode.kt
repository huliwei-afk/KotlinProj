package Day10

fun main() {
    val animals = listOf("zebra", "giraffe", "elephant", "rat")
    val babies = animals
        .map { animal -> "A baby $animal" }
        .map { baby ->"$baby, with a tail" }
    val mapLength = animals.map { it.length }

    println(animals)
    println(babies)
    println(mapLength)
}