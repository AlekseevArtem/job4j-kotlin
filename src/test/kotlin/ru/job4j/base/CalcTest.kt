package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalcTest : StringSpec({
    "1 + 1 = 2" {
        add(1, 1) shouldBe 2
    }

    "1 - 1 = 0" {
        subtract(1, 1) shouldBe 0
    }

    "4 / 2 = 2" {
        div(4, 2) shouldBe 2
    }

    "2 * 2 = 4" {
        multiply(2, 2) shouldBe 4
    }
})