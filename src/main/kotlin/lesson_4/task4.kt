package lesson_4

fun main() {
    val trainingDay = 5
    val isSecondGroupTraining = trainingDay % 2 == 0

    val handsAndPress = !isSecondGroupTraining
    val legsAndBack = isSecondGroupTraining

    println(
        """
        Упражнения для рук: $handsAndPress
        Упражнения для ног: $legsAndBack
        Упражнения для спины: $legsAndBack
        Упражнения для пресса: $handsAndPress
    """.trimIndent()
    )
}
