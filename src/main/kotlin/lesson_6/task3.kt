package lesson_6

fun main() {
    print("Введите количество секунд: ")
    var secondsCount = readln().toInt()
    while (secondsCount > 0) {
        println("Осталось секунд: $secondsCount")
        Thread.sleep(1000)
        secondsCount--
    }

    println("Время вышло")
}