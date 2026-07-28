package lesson_10

fun rollDice(): Int {
    return (1..6).random()
}

fun main() {
    val playerDice = rollDice()
    println("Бросил игрок, значение: $playerDice")
    val computerDice = rollDice()
    println("Бросил компьютер, значение: $computerDice")
    if (playerDice > computerDice) println("Победило человечество")
    else if (playerDice < computerDice) println("Победила машина")
    else println("Победила дружба")
}