package ru.job4j.safe

class Directory {
    val cities: List<String> by lazy { loadCities() }

    private fun loadCities() = listOf("Moscow", "Saint-Petersburg", "Bryansk")
}

fun main() {
    val directory = Directory()
    println(directory.cities)
}