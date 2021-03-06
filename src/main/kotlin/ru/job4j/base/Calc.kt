package ru.job4j.base

fun add(first: Int, second: Int): Int = first + second

fun subtract(first: Int, second: Int): Int = first - second

fun div(first: Int, second: Int): Int = first / second

fun multiply(first: Int, second: Int): Int = first * second

fun max(first: Int, second: Int): Int = if (first > second) first else second

fun max(first: Int, second: Int, third: Int): Int = max(first, max(second, third))

fun main() {
    val plus = add(1, 1)
    println("1 + 1 = $plus")

    val minus = subtract(1, 1)
    println("1 - 1 = $minus")

    val division = div(4, 2)
    println("4 / 2 = $division")

    var multiply = multiply(2, 2)
    multiply = multiply(multiply, 2)
    println("2 * 2 * 2 = $multiply")

    val rslForTwo = max(1, 2)
    println("max from 1 and 2 is $rslForTwo")

    val rslForThree = max(4, 2, 3)
    println("max from 4, 2 and 3 is $rslForThree")
}