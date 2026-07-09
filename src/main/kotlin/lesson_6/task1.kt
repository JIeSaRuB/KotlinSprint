package lesson_6

fun main() {
    print("Введите свой логин: ")
    val userLogin = readln()
    print("Введите свой пароль: ")
    val userPassword = readln()
    while (true) {
        print("Введите логин для входа: ")
        val checkUserLogin = readln()
        print("Введите пароль для входа: ")
        val checkUserPassword = readln()
        if (userLogin == checkUserLogin && userPassword == checkUserPassword) {
            println("Авторизация прошла успешно")
            break
        }
    }
}