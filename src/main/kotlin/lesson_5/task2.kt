package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val yearOfBirthday: Int = readlnOrNull()?.toInt() ?: 0
    val currentYear = 2026

    if ((currentYear - yearOfBirthday) >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}