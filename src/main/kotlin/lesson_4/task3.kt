package lesson_4

const val AIR_HUMIDITY = 20

fun main() {
    val isSunnyWeather = true
    val isAwningOpen = true
    val airHumidity = 20
    val timeOfYear = "зима"

    println("Благоприятные ли сейчас условия для роста бобовых?" +
            " ${isSunnyWeather && isAwningOpen && airHumidity == AIR_HUMIDITY && timeOfYear != "зима"}")
}
