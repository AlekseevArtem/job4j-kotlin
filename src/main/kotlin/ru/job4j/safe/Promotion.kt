package ru.job4j.safe

import java.util.*

data class Promotion(var name: String, var currency: String, var date: Date) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other != null && javaClass == other.javaClass) {
            val promo: Promotion = other as Promotion
            return date == promo.date &&
                    name == promo.name &&
                    currency == promo.currency
        }
        return false
    }

    override fun hashCode(): Int {
        return Objects.hash(name, currency, date)
    }
}