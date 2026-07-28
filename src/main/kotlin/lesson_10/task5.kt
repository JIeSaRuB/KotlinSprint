package lesson_10

const val LOGIN = "UserLogin"
const val PASSWORD = "UserPassword"

fun createAuthorizationToken(login: String, password: String): String? {
    if (login == LOGIN && password == PASSWORD) {
        var resultToken = ""
        for (item in (1..32)) {
            when ((1..3).random()) {
                1 -> resultToken += ('A'..'Z').random()
                2 -> resultToken += ('a'..'z').random()
                3 -> resultToken += ('0'..'9').random()
            }
        }
        return resultToken
    }
    else return null
}

fun getBasket(token: String): Array<String> {
    val goods = arrayOf("Лапша", "Помидор", "Сливки", "Бекон", "Сыр")
    return goods
}

fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()
    val token = createAuthorizationToken(userLogin, userPassword)
    if (token != null) {
        for (good in getBasket(token)) {
            println(good)
        }
    }
    else {
        println("Произошла неудачная верификация!")
    }
}

