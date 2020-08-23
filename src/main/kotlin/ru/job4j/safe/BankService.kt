package ru.job4j.safe

class BankService {
    private val users: MutableMap<User, MutableList<Account>> = mutableMapOf()

    fun addUser(user: User) = users.putIfAbsent(user, mutableListOf())

    fun findByRequisite(passport: String, requisite: String): Account? {
        users[findByPassport(passport)]?.forEach { if (it.requisite == requisite) return it }
        return null
    }

    fun addAccount(passport: String, account: Account) =
        users[findByPassport(passport)]?.add(account)

    fun findByPassport(passport: String): User? {
        users.keys.forEach { if (it.passport == passport) return it }
        return null
    }

    fun transferMoney(srcPassport: String, srcRequisite: String,
        destPassport: String, descRequisite: String, amount: Double
    ): Boolean {
        val source = findByRequisite(srcPassport, srcRequisite)
        val destination = findByRequisite(destPassport, descRequisite)
        return if (source != null && destination != null) {
            source.balance -= amount
            destination.balance += amount
            true
        } else false
    }

}

fun main() {
    val bank = BankService()
    bank.addUser(User("321", "Petr Arsentev"))
    println(bank.findByPassport("3211")?.username)
    println(bank.findByPassport("321")?.username)
}