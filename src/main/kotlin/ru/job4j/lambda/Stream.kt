package ru.job4j.lambda

import java.util.stream.Collectors

fun count(list: List<Int>): Int {
    val result = list.stream()
        .filter { it % 2 == 0 }
        .map { it + 1 }
        .collect(Collectors.toList())
    return result.fold(0, { total, next -> total + next })
}

fun main() {
    val list = listOf(listOf(1, 2, 3, 4, 5), listOf(6)).flatten()
    println(count(list))
}