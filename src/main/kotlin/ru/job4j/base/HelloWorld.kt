package ru.job4j.base

fun add(first : Int, second : Int) : Int {
    return first + second
}

fun subtract(first : Int, second : Int) : Int {
    return first - second
}

fun div(first : Int, second : Int) : Int {
    return first / second
}

fun multiply(first : Int, second : Int) : Int {
    return first * second
}

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
}