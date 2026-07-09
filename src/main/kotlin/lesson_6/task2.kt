package lesson_6

fun main() {
    print("Введите количество секунд: ")
    val secondsCount = readln().toInt()
    var counter = secondsCount
    while (counter > 0) {
        Thread.sleep(1000)
        counter--
    }
    println("Прошло $secondsCount секунд")
}