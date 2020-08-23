package ru.job4j.safe

import java.util.*

class Purchase(var name: String, var created: Date, var address: Address?) {

    fun getHtml(): String {
        val addressNotNull = address?.let { "Address: ${it.street}, home ${it.home}, zip ${it.zip}" } ?: ""
        return StringBuilder().apply {
            append("<table>")
            append("<caption>Table</caption>")
            append("<tr>")
            append("<th> Name: $name </th>")
            append("<th> Date: $created </th>")
            append("<th> $addressNotNull </th>")
            append("</tr>")
            append("</table>")
        }.toString()
    }
}

data class Address(val street: String, val home: String, val zip: String)

fun main() {
    val withNull = Purchase("bread", Calendar.getInstance().time, null)
    println(withNull.getHtml())
    val withoutNull = Purchase("bread", Calendar.getInstance().time, Address("ул.Пушкина", "2", "23"))
    println(withoutNull.getHtml())
}