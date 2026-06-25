package lesson_5

import kotlin.random.Random

fun main() {
    val firstLotteryNumber = Random.nextInt(43)
    val secondLotteryNumber = Random.nextInt(43)
    val thirdLotteryNumber = Random.nextInt(43)

    val lotteryNumberArray = listOf(firstLotteryNumber, secondLotteryNumber, thirdLotteryNumber)


    print("Введите первое число: ")
    val firstUserNumber = readln().toInt()
    print("Введите второе число: ")
    val secondUserNumber = readln().toInt()
    print("Введите третье число: ")
    val thirdUserNumber = readln().toInt()

    val userNumberArray = listOf(firstUserNumber, secondUserNumber, thirdUserNumber)

    val listCount = (lotteryNumberArray.intersect(userNumberArray.toSet())).count()

    when (listCount) {
        3 -> println("Поздравляем! Вы отгадали все три числа и выиграли джекпот!")
        2 -> println("Вы отгадали два числа и выиграли крупный приз!")
        1 -> println("Вы отгадали одно число и выиграли утешительный приз!")
        0 -> println("Вы не отгадали ни одного числа :(")
    }
    println("Выигрышные числа: $firstLotteryNumber, $secondLotteryNumber, $thirdLotteryNumber")



}
