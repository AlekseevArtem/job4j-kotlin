package ru.job4j.lambda

import java.util.ArrayList

data class Account(val name: String, var balance: Int = 0){
    class Filter{
        companion object {
            fun haveMoney(accounts: List<Account>): List<Account> {
                return accounts.filter { it.balance > 0 }
            }

            fun onlyIvan(accounts: List<Account>): List<Account> {
                return accounts.filter { it.name.contains("Ivan") }
            }
        }
    }
}


