package oop_92718_RyannChandiari.week10

// Interface ini akan kita gunakan sebagai Constraint (Syarat)
interface NamedItem {
    val name: String
}

data class Coin(override val name: String, val balance: Double) : NamedItem
data class Transaction(val id: String, val amount: Double)