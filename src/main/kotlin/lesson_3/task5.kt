package lesson_3

fun main() {
    val data = "D2-D4;0"
    val start = data.split('-')[0]
    val finish = data.split('-')[1].split(';')[0]
    val step = data.split(';')[1]
    println(start)
    println(finish)
    println(step)
}