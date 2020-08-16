package ru.job4j.lambda

fun main() {
    val max = { x: Int, y: Int -> if (x > y) x else y }
    val inc = { x: Int -> x + 1 }
    val dec = { x: Int -> x - 1 }
    val square = { x: Int -> x * x }
    val rsl = max(square(5), inc(5 * dec(6)))
    println(rsl)
}