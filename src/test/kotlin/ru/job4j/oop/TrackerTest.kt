package ru.job4j.oop

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class TrackerTest : StringSpec({
    "Add new Item" {
        val tracker = Tracker()
        val item = Item("test1")
        val result = tracker.add(item)
        result.name shouldBe item.name
    }


    "Find all" {
        val tracker = Tracker()
        val item1 = Item("test1")
        val item2 = Item("test2")
        val item3 = Item("test3")
        tracker.add(item1)
        tracker.add(item2)
        tracker.add(item3)
        tracker.add(item2)
        tracker.add(item1)
        tracker.findAll() shouldBe arrayListOf(item1, item2, item3, item2, item1)
    }

    "Find by name. two copies" {
        val tracker = Tracker()
        val item1 = Item("test1")
        val item2 = Item("test2")
        val item3 = Item("test3")
        tracker.add(item1)
        tracker.add(item2)
        tracker.add(item3)
        tracker.add(item2)
        tracker.add(item1)
        tracker.findByName("test1") shouldBe arrayListOf(item1, item1)
    }

    "Replace" {
        val tracker = Tracker()
        val bug = Item("Bug")
        tracker.add(bug)
        val id: String = bug.id
        val bugWithDesc = Item("Bug with description")
        tracker.replace(id, bugWithDesc)
        tracker.findById(id)!!.name shouldBe "Bug with description"
    }

    "Delete" {
        val tracker = Tracker()
        val bug = Item("Bug")
        tracker.add(bug)
        val id: String = bug.id
        tracker.delete(id)
        tracker.findById(id) shouldBe null
    }
})