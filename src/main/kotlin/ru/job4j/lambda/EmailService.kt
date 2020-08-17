package ru.job4j.lambda

class EmailService {

    fun emailTo(message: Message): String = with(StringBuilder()) {
        append("Subject : ").append(message.email)
        append("Body : ").append("Hello, ").append(message.email).append(" ")
        append("You win!")
    }.toString()
}

data class Message(val username: String, val email: String)