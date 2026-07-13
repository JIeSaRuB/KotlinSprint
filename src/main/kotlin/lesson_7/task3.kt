package lesson_7


fun main() {
    print("Введите число: ")
    val finishNumber = readln().toInt()
    for (num in 0..finishNumber step 2) {
        println(num)
    }
}