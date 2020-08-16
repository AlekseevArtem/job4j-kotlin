package ru.job4j.lambda

import java.util.*

data class Campaign(var name: String, var address: String, var created: Date) {
    companion object {
        fun convertToString(campaigns: List<Campaign>): List<String> {
            return campaigns.map { "Name: ${it.name}, Address: ${it.address}, Date: ${it.created}" }
        }
    }
}

fun main() {
    val campaigns = listOf(
        Campaign("Coca-Cola", "WallStreet", Calendar.getInstance().time),
        Campaign("Oracle", "London", Calendar.getInstance().time),
        Campaign("job4j", "Russia", Calendar.getInstance().time)
    )
    Campaign.convertToString(campaigns).forEach { println(it) }
}


