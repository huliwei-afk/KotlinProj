package Day4.LibraryMethod

import java.io.File

fun main() {
    var result = File ("E://i have a dream_copy.txt")
        .takeIf { it.exists() && it.canRead() }
        ?.readText()

    print(result)
}