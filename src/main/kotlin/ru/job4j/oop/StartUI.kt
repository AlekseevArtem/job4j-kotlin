package ru.job4j.oop

class StartUI private constructor() {
    companion object {
        fun add(tracker: Tracker) {
            println(tracker.add(Item("name")))
        }

        fun all(tracker: Tracker) {
            val all: List<Item> = tracker.findAll()
            all.forEach {
                println(it)
            }
        }

        fun exit(tracker: Tracker) {
        }
    }
}

fun main() {
    val tracker = Tracker()
    StartUI.add(tracker)
    StartUI.all(tracker)
}