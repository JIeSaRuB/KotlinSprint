package lesson_11

class Forum() {
    val userList = mutableListOf<ForumParticipant.ForumParticipantBuilder>()
    val messageList = mutableListOf<ForumMessage.ForumMessageBuilder>()
    var nextUserId = 1
    fun createNewUser(userName: String): ForumParticipant.ForumParticipantBuilder {
        val participant = ForumParticipant.ForumParticipantBuilder()
        participant.setUserId(nextUserId)
        participant.setUserName(userName)
        userList.add(participant)
        return participant
    }

    fun createNewMessage(userId: Int) {
        if (userId < nextUserId) {
            val forumMessage = ForumMessage.ForumMessageBuilder()
            forumMessage.authorId = userId
            print("Пользователь с ID = ${forumMessage.authorId}, введите сообщение: ")
            forumMessage.message = readln()
            messageList.add(forumMessage)
        } else println("Пользователя с таким ID не существует")
    }

    fun printThread() {
        for (msg in messageList) {
            var printUserName = ""
            for (user in userList) {
                if (msg.authorId == user.getUserId()) {
                    printUserName = user.userName
                }
            }
            println("$printUserName: ${msg.message} ")
        }
    }
}

class ForumParticipant(userId: Int, userName: String) {
    class ForumParticipantBuilder {
        var userId = 0
        var userName = ""
        fun setUserId(_userId: Int) {
            val userId = _userId
        }
        fun setUserName(_userName: String) {
            val userName = _userName
        }
        fun getUserId(): Int {
            return userId
        }
        fun getUserName(): String {
            return userName
        }
        fun build(): ForumParticipant {
            return ForumParticipant(userId, userName)
        }
    }
}

class ForumMessage(authorId: Int, message: String) {
    class ForumMessageBuilder {
        var authorId = 0
        var message = ""
        fun setAuthorId(_authorId: Int) {
            authorId = _authorId
        }
        fun setMessage(_message: String) {
            message = _message
        }
        fun getUserId(): Int {
            return authorId
        }
        fun getMessage(): String {
            return message
        }
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