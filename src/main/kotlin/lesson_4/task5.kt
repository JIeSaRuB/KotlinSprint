package lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_SUPPLIES_COUNT = 50

fun main() {
    println("Введите наличие повреждений корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crewSize = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val suppliesCount = readln().toInt()

    println("Введите благоприятность погоды (true/false):")
    val isWeatherFavorable = readln().toBoolean()

    val canDepart = (!hasDamage && crewSize in MIN_CREW..MAX_CREW && suppliesCount > MIN_SUPPLIES_COUNT) ||
            (hasDamage && crewSize == MAX_CREW && isWeatherFavorable && suppliesCount >= MIN_SUPPLIES_COUNT)

    println(if (canDepart) "Корабль может отправиться в плавание." else "Корабль не может отправиться в плавание.")
}