package ru.job4j.oop

import java.util.*

internal class Tracker {
    private val items: MutableList<Item> = ArrayList()

    internal fun add(item: Item): Item {
        item.id = (generateId())
        items.add(item)
        return item
    }

    internal fun findAll(): List<Item> {
        return items
    }

    internal fun replace(id: String, newItem: Item): Boolean {
        val index = indexOf(id)
        newItem.id = (items[index].id)
        if (index != -1) {
            items[index] = newItem
            return true
        }
        return false
    }

    internal fun delete(id: String): Boolean {
        return items.remove(findById(id))
    }

    private fun indexOf(id: String): Int {
        for (item in items) {
            if (item.id == id) return items.indexOf(item)
        }
        return -1
    }

    internal fun findByName(key: String): List<Item> {
        val itemsWithSameName: MutableList<Item> = ArrayList()
        for (item in items) {
            if (item.name == key) {
                itemsWithSameName.add(item)
            }
        }
        return itemsWithSameName
    }

    internal fun findById(id: String): Item? {
        val index = indexOf(id)
        return if (index < 0) null else items[index]
    }

    private fun generateId(): String {
        return (Random().nextLong() + System.currentTimeMillis()).toString()
    }
}