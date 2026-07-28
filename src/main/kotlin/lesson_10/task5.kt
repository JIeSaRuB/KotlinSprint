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

fun getBasket(token: String): List<String> {
    val goods = listOf("Лапша", "Помидор", "Сливки", "Бекон", "Сыр")
    return goods
}

fun main() {
    val token = createAuthorizationToken(LOGIN, PASSWORD)
    if (token != null) {
        for (good in getBasket(token)) {
            println(good)
        }
    }
    else {
        println("Произошла неудачная верификация!")
    }
}

