package lesson_4

fun main() {
    println("Введите наличие повреждений корпуса (true/false):")
    val hasDamage = readln().toBoolean() ?: false

    println("Введите текущий состав экипажа:")
    val crewSize = readln().toInt() ?: 0

    println("Введите количество ящиков с провизией:")
    val suppliesCount = readln().toInt() ?: 0

    println("Введите благоприятность погоды (true/false):")
    val isWeatherFavorable = readln().toBoolean() ?: false

    val canDepart = (!hasDamage && crewSize in 55..70 && suppliesCount > 50) ||
            (hasDamage && crewSize == 70 && isWeatherFavorable && suppliesCount >= 50)

    println(if (canDepart) "Корабль может отправиться в плавание." else "Корабль не может отправиться в плавание.")
}