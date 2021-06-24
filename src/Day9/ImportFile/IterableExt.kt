package Day9.ImportFile

fun <T> Iterable<T>.randomTake() : T = this.shuffled().first()