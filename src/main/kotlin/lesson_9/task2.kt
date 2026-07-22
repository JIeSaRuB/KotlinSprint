package lesson_9

fun main() {
    val ingredients = mutableListOf("лапша", "сливки", "сыр", "бекон")
    println("В рецепте есть базовые ингредиенты: $ingredients")
    print("Желаете добавить ещё? ")
    val answer = readln()
    if (answer.equals("да", ignoreCase = true)){
        print("Какой ингредиент вы хотите добавить? ")
        val additionIngredient = readln()
        ingredients.add(additionIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }

}