package lesson_3

fun main() {
    val data = "D2-D4;0"
    val firstParse = data.split('-')
    val secondParse = firstParse[1].split(';')
    val start = firstParse[0]
    val finish = secondParse[0]
    val step = secondParse[1]
    println(start)
    println(finish)
    println(step)
}