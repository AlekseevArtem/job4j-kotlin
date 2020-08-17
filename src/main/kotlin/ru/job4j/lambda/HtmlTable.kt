package ru.job4j.lambda

class HtmlTable {
    fun table(row: Int, cell: Int): String = StringBuilder().apply {
        append("<table>")
        append("<caption>Table</caption>")
        append("<tr>")
        for (index in 0..row) {
            append("<th>$index row</th>")
        }
        append("</tr>")
        append("</table>")
    }.toString()
}