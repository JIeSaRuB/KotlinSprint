package lesson_6

fun main() {
    var attempts = 5
    val number = (1..9).random()
    while (true) {
        print("Введите число: ")
        val userNumber = readln().toInt()
        if (userNumber == number) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно. Оставшееся количество попыток: ${--attempts}")
        }
        if (attempts == 0) {
            println("Было загадано число $number")
            break
        }
    }
}