package ru.job4j.lambda

data class Account(val name: String, var balance: Int = 0)

fun haveMoney(accounts: List<Account>): List<Account> = accounts.filter { it.balance > 0 }

fun onlyIvan(accounts: List<Account>): List<Account> = accounts.filter { it.name.contains("Ivan") }
