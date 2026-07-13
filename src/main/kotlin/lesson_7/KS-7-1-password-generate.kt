package lesson_7

fun main() {
    val lettersForPassword = ('a'..'z')
    val numbersForPassword = ('0'..'9')

    var resultPassword = ""

    for (counter in 1..6) {
        if (counter % 2 == 1) resultPassword += lettersForPassword.random()
        else resultPassword += numbersForPassword.random()
    }
    println(resultPassword)
}