package lesson_7

fun main() {
    var codeToAuthorization = (1000..9999).random()
    println("Ваш код авторизации: $codeToAuthorization")
    var userCode = readln().toInt()

    do {
        if (userCode == codeToAuthorization) {
            println("Добро пожаловать!")
            break
        }
        codeToAuthorization = (1000..9999).random()
        println("Ваш код авторизации: $codeToAuthorization")
        userCode = readln().toInt()
    } while (true)
}