package lesson_9

fun main() {
    val ingredientsList = mutableListOf<String>()
    for (counter in (1..5)) {
        print("Введите ингредиент №$counter: ")
        ingredientsList.add(readln())
    }
    val resultIngredientsList = ingredientsList.toSet().toMutableList()
    resultIngredientsList.sort()
    resultIngredientsList[0] = resultIngredientsList.first().replaceFirstChar { it.uppercase() }
    print(resultIngredientsList.joinToString(", "))
}