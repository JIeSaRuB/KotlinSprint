package lesson_5

fun main() {
    println("Введите ответ на пример: 2 + 5")
    val personsAnswer = readln().toIntOrNull()

    personsAnswer?.let {
        if (personsAnswer == 7) {
            println("Добро пожаловать!")
        } else {
            println("Доступ запрещен.")
        }
    }
}