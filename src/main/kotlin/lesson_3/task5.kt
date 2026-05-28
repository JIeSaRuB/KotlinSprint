package lesson_3

fun main() {
    val data = "D2-D4;0"
    val parsedData = data.split('-', ';')
    val start = parsedData[0]
    val finish = parsedData[1]
    val step = parsedData[2]
    println(start)
    println(finish)
    println(step)
}