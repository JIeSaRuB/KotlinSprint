package lesson_4

const val LOWER_THRESHOLD = 35
const val UPPER_THRESHOLD = 100
const val MAX_VOLUME = 100

fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100
    println("Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л " +
            "соответствует категории 'Average': ${firstCargoWeight > LOWER_THRESHOLD &&
                    firstCargoWeight <= UPPER_THRESHOLD && firstCargoVolume < MAX_VOLUME}")
    println("Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л " +
            "соответствует категории 'Average': ${secondCargoWeight > LOWER_THRESHOLD &&
                    secondCargoWeight <= UPPER_THRESHOLD && secondCargoVolume < MAX_VOLUME}")
}