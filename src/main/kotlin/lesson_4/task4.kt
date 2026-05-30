package lesson_4

fun main() {
    val trainingDay = 5
    val isFirstGroupTraining = trainingDay % 2 == 1

    val hands = isFirstGroupTraining
    val legs = !isFirstGroupTraining
    val back = !isFirstGroupTraining
    val press = isFirstGroupTraining

    println(
        """
        Упражнения для рук: $hands
        Упражнения для ног: $legs
        Упражнения для спины: $back
        Упражнения для пресса: $press
    """.trimIndent()
    )
}
