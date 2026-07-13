package lesson_7

fun main() {
    print("Введите количество секунд: ")
    val userTime = readln().toInt()
    for (second in (userTime downTo 1)) {
        println("Осталось: $second")
        Thread.sleep(1000)
    }
    println("Время вышло")
}