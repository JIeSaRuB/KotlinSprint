package lesson_9

fun main() {
    val ingredientsList = mutableListOf<String>()
    var counter = 1
    while (counter < 6) {
        print("Введите ингредиент №$counter: ")
        val input = readln()
        if (ingredientsList.contains(input)) {
            continue
        }
        else {
            ingredientsList.add(input)
            counter++
        }
    }
    ingredientsList.sort()
    ingredientsList[0] = ingredientsList.first().replaceFirstChar { it.uppercase() }
    println(ingredientsList.joinToString(", "))
}