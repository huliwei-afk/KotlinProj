package Day4.LibraryMethod

import java.io.File

fun main() {
    //非不可见，即可见，与takeIf正好相反
    var result = File ("E://i have a dream_copy.txt")
        .takeUnless { it.isHidden }
        ?.readText()

    print(result)
}