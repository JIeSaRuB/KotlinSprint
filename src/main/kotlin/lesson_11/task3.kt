package lesson_11

class Participant {
    val statusVersions = arrayOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    var avatar = ""
    var name = ""
    var status = ""
}

class ParticipantsRoom {
    var cover = ""
    var title = ""
    var participantList = mutableListOf<Participant>()
    fun addParticipant(participant: Participant) {
        participantList.add(participant)
    }
    fun changeStatus(name: String, newStatus: String) {
        val user = participantList.find {it.name == name}
        user?.status = newStatus
    }
}

fun main() {
    val firstParticipant = Participant()
    val secondParticipant = Participant()
    val thirdParticipant = Participant()
    firstParticipant.avatar = "Аватар первого пользователя"
    firstParticipant.name = "Первый пользователь"
    firstParticipant.status = firstParticipant.statusVersions[0]
    secondParticipant.avatar = "Аватар второго пользователя"
    secondParticipant.name = "Второй пользователь"
    secondParticipant.status = secondParticipant.statusVersions[1]
    thirdParticipant.avatar = "Аватар третьего пользователя"
    thirdParticipant.name = "Третий пользователь"
    thirdParticipant.status = thirdParticipant.statusVersions[2]
    val firstParticipantsRoom = ParticipantsRoom()
    firstParticipantsRoom.cover = "Обложка первой комнаты"
    firstParticipantsRoom.title = "Первая комната"
    firstParticipantsRoom.addParticipant(firstParticipant)
    firstParticipantsRoom.addParticipant(secondParticipant)
    firstParticipantsRoom.addParticipant(thirdParticipant)
}