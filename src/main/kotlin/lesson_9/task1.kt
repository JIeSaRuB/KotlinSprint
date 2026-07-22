package lesson_9

fun main() {
    val ingredients = listOf<String>("лапша", "сливки", "сыр", "бекон")
    println("В рецепте есть следующие ингредиенты: $ingredients")
    ingredients.forEach {
        println(it)
    }
}
