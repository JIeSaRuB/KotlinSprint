package lesson_4

fun main() {
    val trainingDay = 5
    val choiceTrainingProgram = trainingDay % 2 == 0

    val handsAndPress = !choiceTrainingProgram
    val backAndLegs = choiceTrainingProgram

    println(
        """
        Упражнения для рук: $handsAndPress
        Упражнения для ног: $backAndLegs
        Упражнения для спины: $backAndLegs
        Упражнения для пресса: $handsAndPress
    """.trimIndent()
    )
}