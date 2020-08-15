package ru.job4j.oop

object StartUI {
    internal fun init(tracker: Tracker, select: Int) {
        var run = true
        while (run) {
            when (select) {
                0 -> {
                    println(tracker.add(Item("name")))
                }
                1 -> {
                    val all: List<Item> = tracker.findAll()
                    all.forEach {
                        println(it)
                    }
                }
                2 -> {
                    run = false
                }
            }
        }
    }
}