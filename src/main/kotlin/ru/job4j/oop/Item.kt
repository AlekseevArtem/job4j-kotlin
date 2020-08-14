package ru.job4j.oop

class Item(private var name: String) {
    private var id = ""

    fun getId() = id

    fun setId(id : String) {
        this.id = id
    }

    fun getName() = name

    fun setName(name : String) {
        this.name = name
    }
}