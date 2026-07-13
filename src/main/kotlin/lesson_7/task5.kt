package lesson_7

fun main() {
    print("Введите длину пароля: ")
    var passwordLength = readln().toInt()
    if (passwordLength < 6) {
        do {
            print("Введите длину пароля: ")
            passwordLength = readln().toInt()
        } while (passwordLength < 6)
    }
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