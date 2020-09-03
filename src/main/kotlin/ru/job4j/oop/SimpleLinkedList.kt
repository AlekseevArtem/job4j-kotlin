package ru.job4j.oop

import java.util.*
import kotlin.NoSuchElementException

class SimpleLinkedList<T>(
    override var size: Int = 0,
    var first: Node<T>? = null
) : Queue<T> {
    private var head: Node<T>? = null

    override fun add(element: T): Boolean {
        if (head != null) {
            head = Node(element)
        }
        return true
    }

    override fun addAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun iterator(): MutableIterator<T> {
        return LinkedIt()
    }

    override fun remove(): T {
        TODO("Not yet implemented")
    }

    override fun contains(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun remove(element: T): Boolean {
        var x: Node<T>? = first
        if (element == null) {
            while (x != null) {
                if (x.value == null) {
                    unlink(x)
                    return true
                }
                x = x.next
            }
        } else {
            while (x != null) {
                if (element == x.value) {
                    unlink(x)
                    return true
                }
                x = x.next
            }
        }
        return false
    }

    private fun unlink(x: Node<T>): T {
        val element: T = x.value
        x.next = null
        size--
        return element
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun offer(e: T) = add(e)

    override fun poll(): T? {
        if (first != null) {
            val element: T? = first!!.value
            val next: Node<T>? = first!!.next
            first!!.next = null
            first = next
            size--
            return element
        }
        return null
    }

    override fun element(): T = first?.value ?: throw NoSuchElementException()

    override fun peek() = first?.value

    inner class LinkedIt : Iterator<T>, MutableIterator<T> {

        override fun hasNext(): Boolean {
            return head != null
        }

        override fun next(): T {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            return head!!.value
        }

        override fun remove() {

        }

    }

    class Node<K>(var value: K, var next: Node<K>? = null)
}

fun main() {
    val list = SimpleLinkedList<String>()
    list.add("awd")
    for (value in list) {
        println(value)
    }
}