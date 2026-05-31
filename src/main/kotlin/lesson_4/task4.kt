package lesson_4

fun main() {
    val trainingDay = 5
    val isEvenDay = trainingDay % 2 == 0

    val handsAndPress = !isEvenDay
    val backAndLegs = isEvenDay

    println(
        """
        Упражнения для рук: $handsAndPress
        Упражнения для ног: $backAndLegs
        Упражнения для спины: $backAndLegs
        Упражнения для пресса: $handsAndPress
    """.trimIndent()
    )
}