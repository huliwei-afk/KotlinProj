package Day9

val String.numVowels
    get() = count { "aeiou".contains(it)}

fun main() {
    "The People's Republic Of China".numVowels.easyPrint()
}

