package lesson_10

fun passwordGenerate(length: Int): String {
    val passwordCharacters = "!\"#\$%&'()*+,-./ "
    val resultPassword = mutableListOf<String>()
    for (item in (1..length)) {
        if (item % 2 == 0) {
            resultPassword.add(((0..9).random()).toString())
        }
        else {
            resultPassword.add(passwordCharacters.random().toString())
        }
    }
    return resultPassword.joinToString("")
}

fun main() {
    print("Введите длину пароля: ")
    print("Сгенерированный пароль: ${passwordGenerate(readln().toInt())}")
}