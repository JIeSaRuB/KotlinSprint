package lesson_5

fun main() {
    val firstNumber = (1..10).random()
    val secondNumber = (1..10).random()
    println("Введите ответ на пример: $firstNumber + $secondNumber")
    val personsAnswer = readln().toInt()

    if (personsAnswer == firstNumber + secondNumber) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}