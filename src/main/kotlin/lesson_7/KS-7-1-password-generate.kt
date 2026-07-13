package lesson_7

fun main() {
    val passwordItems = ('a'..'z') + ('0'..'9')
    var resultPassword = ""
    for (count in 1..6) {
        resultPassword += passwordItems.random()
    }
    println(resultPassword)
}