package lesson_5

const val FIRST_LOTTERY_NUMBER = 42
const val SECOND_LOTTERY_NUMBER = 0

fun main() {
    print("Введите первое число из лотереи: ")
    val firstInputNum = readln().toInt()
    print("Введите второе число из лотереи: ")
    val secondInputNum = readln().toInt()

    if ((firstInputNum == FIRST_LOTTERY_NUMBER && secondInputNum == SECOND_LOTTERY_NUMBER)
        || (firstInputNum == SECOND_LOTTERY_NUMBER && secondInputNum == FIRST_LOTTERY_NUMBER)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (((firstInputNum == FIRST_LOTTERY_NUMBER || firstInputNum == SECOND_LOTTERY_NUMBER)
                && (secondInputNum != FIRST_LOTTERY_NUMBER && secondInputNum != SECOND_LOTTERY_NUMBER))
        || ((secondInputNum == FIRST_LOTTERY_NUMBER || secondInputNum == SECOND_LOTTERY_NUMBER)
                && (firstInputNum != FIRST_LOTTERY_NUMBER && firstInputNum != SECOND_LOTTERY_NUMBER))
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Выигрышными были числа: $FIRST_LOTTERY_NUMBER и $SECOND_LOTTERY_NUMBER")
}