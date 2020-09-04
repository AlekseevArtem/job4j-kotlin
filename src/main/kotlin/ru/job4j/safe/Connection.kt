package ru.job4j.safe

class Response {
    fun exec(sql: String): String {
        return "INSERT INTO table1 (name) VALUES ($sql)"
    }
}

class Connection {
    private lateinit var response: Response

    fun init() {
        response = Response()
    }
}