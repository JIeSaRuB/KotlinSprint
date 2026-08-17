package lesson_11

class User {
    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var mail: String = ""
}
fun printUserData(user: User): String {
    return "Пользователь номер ${user.id}. Логин: ${user.login}, пароль: ${user.password}, почта: ${user.mail}"
}

fun main() {
    val firstUser = User()
    firstUser.id = 1
    firstUser.login = "first"
    firstUser.password = "firstpass"
    firstUser.mail = "userFirst@gmail.com"
    val secondUser = User()
    secondUser.id = 2
    secondUser.login = "second"
    secondUser.password = "secondpass"
    secondUser.mail = "userSecond@gmail.com"
    println(printUserData(firstUser))
    println(printUserData(secondUser))
}

