package oop_92718_RyannChandiari.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1 // Default 1 hari
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}