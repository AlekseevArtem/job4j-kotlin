package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.StringSpec

class ArrayTest : StringSpec({
    "defragment with three elements" {
        val result = arrayOfNulls<String>(10)
        result[1] = "one"
        result[4] = "two"
        result[7] = "three"
        val expected = arrayOfNulls<String>(10)
        expected[0] = "one"
        expected[1] = "two"
        expected[2] = "three"
        defragment(result) shouldBe expected
    }

    "defragment with one element" {
        val result = arrayOfNulls<String>(10)
        result[0] = "one"
        val expected = arrayOfNulls<String>(10)
        expected[0] = "one"
        defragment(result) shouldBe expected
    }

    "defragment without null" {
        val result = arrayOfNulls<String>(3)
        result[0] = "one"
        result[1] = "two"
        result[2] = "three"
        val expected = arrayOfNulls<String>(3)
        expected[0] = "one"
        expected[1] = "two"
        expected[2] = "three"
        defragment(result) shouldBe expected
    }

    "defragment with different size" {
        val result = arrayOfNulls<String>(9)
        val expected = arrayOfNulls<String>(10)
        defragment(result) shouldNotBe expected
    }
})