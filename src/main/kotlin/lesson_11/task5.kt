package lesson_11

class Forum() {
    val userList = mutableListOf<ForumParticipant>()
    val messageList = mutableListOf<ForumMessage>()
    var nextUserId = 1
    fun createNewUser(userName: String) {
        val participant = ForumParticipant()
        participant.userId = nextUserId
        nextUserId++
        participant.userName = userName
        userList.add(participant)
    }
    fun createNewMessage(userId: Int) {
        if (userId < nextUserId) {
            val forumMessage = ForumMessage()
            forumMessage.authorId = userId
            print("Пользователь с ID = ${forumMessage.authorId}, введите сообщение: ")
            forumMessage.message = readln()
            messageList.add(forumMessage)
        }
        else println("Пользователя с таким ID не существует")
    }
    fun printThread() {
        for (msg in messageList) {
            var printUserName = ""
            for (user in userList) {
                if (msg.authorId == user.userId) {
                    printUserName = user.userName
                }
            }
            print("$printUserName: ${msg.message} ")
        }
    }
}

class ForumParticipant() {
    var userId = 0
    var userName = ""
}

class ForumMessage() {
    var authorId = 0
    var message = ""
}

fun main() {
    val forum = Forum()
    forum.createNewUser("Alex")
    forum.createNewUser("SecondAlex")
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.printThread()
}