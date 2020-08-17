package ru.job4j.lambda

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class AccountTest : StringSpec({
    "filtered Ivan" {
        var result = listOf(
            Account("Artem", 100),
            Account("Ivan", 200),
            Account("Sergey")
        )
        result = onlyIvan(result)
        val expected = listOf(Account("Ivan", 200))
        result shouldBe expected
    }

    "filtered have money" {
        var result = listOf(
            Account("Artem", 100),
            Account("Ivan", 200),
            Account("Sergey")
        )
        result = haveMoney(result)
        val expected = listOf(
            Account("Artem", 100),
            Account("Ivan", 200)
        )
        result shouldBe expected
    }

    "filtered Ivan have money" {
        var result = listOf(
            Account("Artem", 100),
            Account("Ivan", 200),
            Account("Ivan"),
            Account("Sergey")
        )
        result = haveMoney(onlyIvan(result))
        val expected = listOf(
            Account("Ivan", 200)
        )
        result shouldBe expected
    }
})