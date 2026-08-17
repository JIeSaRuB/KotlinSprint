package lesson_11

class User2 {
    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var email: String = ""
    var bio: String = ""
    fun printUserData() {
        println("Пользователь номер $id. Логин: $login, пароль: $password, почта: $email, биография: $bio")
    }
    fun setBiography() {
        print("Введите биографию: ")
        val textForBio = readln()
        bio = textForBio
    }
    fun changePassword(): String {
        print("Введите текущий пароль: ")
        val checkPassword = readln()
        if (checkPassword == password) {
            print("Введите новый пароль: ")
            val newPassword = readln()
            password = newPassword
            return "Пароль успешно изменён\n"
        }
        return "Текущий пароль введён неверно\n"
    }
}

fun main() {
    val user = User2()
    user.id = 1
    user.login = "first"
    user.password = "firstpass"
    user.email = "userFirst@gmail.com"
    user.setBiography()
    print(user.changePassword())
    user.printUserData()
}