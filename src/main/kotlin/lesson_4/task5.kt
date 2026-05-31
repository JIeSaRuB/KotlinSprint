package lesson_4

const val minCrew = 55
const val maxCrew = 70
const val minSuppliesCount = 50

fun main() {
    println("Введите наличие повреждений корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crewSize = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val suppliesCount = readln().toInt()

    println("Введите благоприятность погоды (true/false):")
    val isWeatherFavorable = readln().toBoolean()

    val canDepart = (!hasDamage && crewSize in minCrew..maxCrew && suppliesCount > minSuppliesCount) ||
            (hasDamage && crewSize == maxCrew && isWeatherFavorable && suppliesCount >= minSuppliesCount)

    println(if (canDepart) "Корабль может отправиться в плавание." else "Корабль не может отправиться в плавание.")
}