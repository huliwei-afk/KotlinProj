package Day4.LibraryMethod

import java.io.File

fun main() {
    val file1 = File("E://i have a deram_copy.txt")
    file1.setReadable(true)//可读
    file1.setWritable(true)//可写
    file1.setExecutable(false)//不可执行

    //使用apply
    val file2 = File("E://i have a deram_copy.txt").apply {
        setReadable(true)//可读
        setWritable(true)//可写
        setExecutable(false)//不可执行
    }
}