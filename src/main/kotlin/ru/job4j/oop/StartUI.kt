package ru.job4j.oop

class StartUI : Action {
    private val tracker = Tracker()

    override fun add() {
        println(tracker.add(Item("name")))
    }

    override fun all() {
        val all: List<Item> = tracker.findAll()
        all.forEach {
            println(it)
        }
    }

    override fun exit() {
    }
}

fun main() {
    val startUI = StartUI()
    startUI.add()
    startUI.all()
}