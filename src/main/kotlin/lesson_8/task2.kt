package lesson_8

fun main() {
    val ingredients = arrayOf("лапша", "сыр", "сливки", "бекон")
    print("Введите необходимый ингредиент: ")
    val searchItem = readln()
    var flag = false
    for (ingredient in ingredients) {
        if (ingredient == searchItem) {
            println("Ингредиент $ingredient в рецепте есть")
            flag = true
            break
        }
    }
    if (!flag) {
        println("Такого ингредиента в рецепте нет")
    }
}