package lesson_7

fun main() {
    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    var resultPassword = ""
    for (item in (1..passwordLength)) {
        when (item % 3) {
            0 -> resultPassword += ('A'..'Z').random()
            1 -> resultPassword += ('a'..'z').random()
            2 -> resultPassword += ('0'..'9').random()
        }
    }
    println(resultPassword)
}