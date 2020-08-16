package ru.job4j.oop

open class Profession(name: String, surname: String) {
    private var birthday: String = ""

    constructor(name: String, surname: String, birthday: String) : this(name, surname) {
        this.birthday = birthday
    }
}

class Doctor(name: String, surname: String, birthday: String, specialty: String) : Profession(name, surname, birthday)

class Developer(name: String, surname: String, level: String) : Profession(name, surname, birthday = "11.11.1999")

class Singer(name: String, surname: String, voiceType: String) : Profession(name, surname)