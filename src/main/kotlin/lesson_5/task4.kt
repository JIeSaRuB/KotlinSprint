package lesson_5

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    val inputName = readln()
    when (inputName) {
        USER_NAME -> {
            print("Такой пользователь есть, продолжаем!")
            val inputPassword = readln()
            when (inputPassword) {
                PASSWORD -> print("Добро пожаловать на \"Heart of Gold\"")
                else -> println("Пароль неверный")
            }
        }
        else -> println("Сначала зарегистрируйтесь")
    }

}