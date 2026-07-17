package lesson_8

fun main() {
    print("Введите количество планируемых ингредиентов: ")
    val ingredientsCount = readln().toInt()
    println("Введите ингредиенты:")
    val ingredientsArray = Array(ingredientsCount) { readln() }
    println(ingredientsArray.joinToString(", "))
}