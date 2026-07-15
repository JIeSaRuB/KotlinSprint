package lesson_8

fun main() {
    val viewsArray = IntArray(7) {0}
    for (day in viewsArray.indices) {
        viewsArray[day] = (100..10000).random()
    }
    println("Всего просмотров за неделю: ${viewsArray.sum()}")

}