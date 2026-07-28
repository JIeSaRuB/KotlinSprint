package lesson_10

fun generateDiceRoll(): Int {
    return (1..6).random()
}
fun roundBlock(): String {
    val playerDice = generateDiceRoll()
    println("Бросил игрок, значение: $playerDice")
    val computerDice = generateDiceRoll()
    println("Бросил компьютер, значение: $computerDice")
    if (playerDice > computerDice) return "Победило человечество"
    else if (playerDice < computerDice) return "Победила машина"
    else return "Победила дружба"
}

fun main() {
    var answer: String
    var counter = 0
    var result: String
    do {
        result = roundBlock()
        if (result == "Победило человечество") counter++
        println(result)
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        answer = readln()
    } while (answer == "Да")
    println("Вы выиграли раундов: $counter")
}