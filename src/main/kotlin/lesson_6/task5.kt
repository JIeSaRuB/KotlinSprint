package lesson_6

fun main() {
    var tries = 3
    while (true) {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        println("Решите следующий пример: $firstNumber + $secondNumber")
        val answer = firstNumber + secondNumber
        val userAnswer = readln().toInt()
        if (answer == userAnswer) {
            println("Добро пожаловать!")
            break
        }
        else {
            println("Неверно. Осталось попыток: ${--tries}")
        }
        if (tries == 0) {
            println("Доступ запрещён")
            break
        }
    }
}