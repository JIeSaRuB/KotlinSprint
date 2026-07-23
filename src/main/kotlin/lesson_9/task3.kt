package lesson_9

fun main() {
    val ingredientsCount = mutableListOf(2, 50, 15)
    print("Введите количество порций: ")
    val portionCount = readln().toInt()
    for (ingredient in ingredientsCount) {
        ingredientsCount[ingredientsCount.indexOf(ingredient)] *= portionCount
    }
    println("На $portionCount порций вам понадобится: Яиц - ${ingredientsCount[0]}, молока - ${ingredientsCount[1]}, сливочного масла - ${ingredientsCount[2]}")
}