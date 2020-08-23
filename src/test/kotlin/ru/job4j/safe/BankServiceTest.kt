package ru.job4j.safe

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class BankServiceTest : StringSpec({
    "add User" {
        val user = User("3434", "Petr Arsentev")
        BankService().apply {
            addUser(user)
            findByPassport("3434") shouldBe user
        }
    }

    "add Account" {
        val user = User("3434", "Petr Arsentev")
        BankService().apply {
            addUser(user)
            addAccount(user.passport, Account("5546", 150.0))
            findByRequisite("3434", "5546")?.balance shouldBe 150.0
        }
    }

    "transfer money success" {
        val user = User("3434", "Petr Arsentev")
        BankService(). apply {
            addUser(user)
            addAccount(user.passport, Account("5546", 150.0))
            addAccount(user.passport, Account("113", 50.0))
            transferMoney(user.passport, "5546", user.passport, "113", 150.0)
            findByRequisite("3434", "113")?.balance shouldBe 200.0
        }
    }

    "transfer money failed" {
        val user = User("3434", "Petr Arsentev")
        BankService(). apply {
            addUser(user)
            addAccount(user.passport, Account("5546", 150.0))
            addAccount(user.passport, Account("113", 50.0))
            transferMoney(user.passport, "5546", user.passport, "00000", 150.0)
            findByRequisite("3434", "5546")?.balance shouldBe 150.0
        }
    }

})