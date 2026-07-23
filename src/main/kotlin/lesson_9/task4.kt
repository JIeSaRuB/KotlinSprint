package lesson_9

fun main() {
    print("Введите через запятую пять ингредиентов: ")
    val ingredients = readln()
    val ingredientsList = ingredients.split(", ")
    val sortedIngredientsList = ingredientsList.sorted()
    for (ingredient in sortedIngredientsList) {
        print("$ingredient ")
    }
}