package lesson_4

const val ALL_TABLES = 13

fun main() {
    val tableReservationToday = 13
    val tableReservationTomorrow = 9
    println("[Доступность столиков на сегодня: ${tableReservationToday < ALL_TABLES}],\n[Доступность столиков на завтра: ${tableReservationTomorrow < ALL_TABLES}]")
}
