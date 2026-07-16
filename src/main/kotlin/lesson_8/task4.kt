package lesson_8

fun main() {
    val ingredients = arrayOf("лапша", "сыр", "сливки", "бекон")
    ingredients.forEach { ingredient ->
        println(ingredient)
    }
    print("Введите ингредиент, который Вы хотели бы заменить: ")
    val toReplaceIngredient = readln()
    if (ingredients.indexOf(toReplaceIngredient) != -1) {
        print("Введите ингредиент, на который Вы хотели бы заменить $toReplaceIngredient: ")
        val forReplaceIngredient = readln()
        ingredients[ingredients.indexOf(toReplaceIngredient)] = forReplaceIngredient
        print("Готово! Вы сохранили следующий список: [")
        for (index in (0..ingredients.size - 2)) {print("${ingredients[index]}, ")}
        print("${ingredients[ingredients.size - 1]}]")
    }
    else {
        println("Такого ингредиента в рецепте нет")
    }
}