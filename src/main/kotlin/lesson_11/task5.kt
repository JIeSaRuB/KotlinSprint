package lesson_11

class Forum() {
    val userList = mutableListOf<ForumParticipant>()
    val messageList = mutableListOf<ForumMessage>()
    var nextUserId = 1
    fun createNewUser(userName: String): ForumParticipant {
        val participant = ForumParticipant(userId = nextUserId, userName = userName)
        nextUserId++
        userList.add(participant)
        return participant
    }

    fun createNewMessage(userId: Int) {
        if (userList.find { it.userId == userId } in userList) {
            print("Пользователь с ID = ${userId}, введите сообщение: ")
            val forumMessage = ForumMessage(authorId = userId, message = readln())
            messageList.add(forumMessage)
        } else println("Пользователя с таким ID не существует")
    }

    fun printThread() {
        for (msg in messageList) {
            var printUserName = ""
            for (user in userList) {
                if (msg.authorId == user.userId) {
                    printUserName = user.userName
                }
            }
            println("$printUserName: ${msg.message} ")
        }
    }
}

class ForumParticipant(userId: Int, userName: String) {
    var userId = userId
    var userName = userName
    class ForumParticipantBuilder {
        var userId = 0
        var userName = ""
        fun build(): ForumParticipant {
            return ForumParticipant(userId, userName)
        }
    }
}

class ForumMessage(authorId: Int, message: String) {
    var authorId = authorId
    var message = message
    class ForumMessageBuilder {
        var authorId = 0
        var message = ""
        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}

fun main() {
    val forum = Forum()
    forum.createNewUser("Alex")
    forum.createNewUser("SecondAlex")
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.printThread()

}
