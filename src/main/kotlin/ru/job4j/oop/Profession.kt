package ru.job4j.oop

open class Profession(private val name: String, private val surname: String) {
    private var birthday: String = ""

    constructor(name: String, surname: String, birthday: String) : this(name, surname) {
        this.birthday = birthday
    }

    open fun action() {
        println("execute some actions")
    }

    open fun getName(): String {
        return name
    }
}

class Doctor(name: String, surname: String, birthday: String, specialty: String) : Profession(name, surname, birthday) {
    override fun action() {
        super.action()
        println("action from doctor")
    }

    override fun getName(): String {
        return "doctor " + super.getName()
    }
}

class Developer(name: String, surname: String, level: String) : Profession(name, surname, birthday = "11.11.1999") {
    override fun action() {
        super.action()
        println("action from developer")
    }

    override fun getName(): String {
        return "developer " + super.getName()
    }
}

class Singer(name: String, surname: String, voiceType: String) : Profession(name, surname) {
    override fun action() {
        super.action()
        println("action from singer")
    }

    override fun getName(): String {
        return "singer " + super.getName()
    }
}