package lesson_8

fun main() {
    val ingredients = arrayOf("лапша", "сыр", "сливки", "бекон")
    print("Введите нужный ингредиент: ")
    val searchIngredient = readln()
    if (ingredients.indexOf(searchIngredient) != -1) {
        println("Ингредиент ${ingredients[ingredients.indexOf(searchIngredient)]} в рецепте есть")
    }
    else {
        println("Такого ингредиента в рецепте нет")
    }
}
