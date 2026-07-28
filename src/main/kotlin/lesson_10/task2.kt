package lesson_10

const val GENERAL_LENGTH = 4

fun dataValidation(login: String, password: String) {
    if (login.length >= GENERAL_LENGTH && password.length >= GENERAL_LENGTH) {
        println("Добро пожаловать!")
    }
    else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()
    dataValidation(login = userLogin, password = userPassword)
}