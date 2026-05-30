package lesson_4

const val AIR_HUMIDITY = 20
const val TIME_OF_YEAR = "зима"

fun main(){
    val weather = true
    val awningStatus = true
    val airHumidity = 20
    val timeOfYear = "зима"

    println("Благоприятные ли сейчас условия для роста бобовых? ${weather && awningStatus && airHumidity == AIR_HUMIDITY && timeOfYear != TIME_OF_YEAR}")
}