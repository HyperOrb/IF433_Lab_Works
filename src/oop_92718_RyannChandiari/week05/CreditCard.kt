package oop_92718_RyannChandiari.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Sukses gesek Kartu Kredit Rp $amount. Limit terpakai: $usedAmount / $limit")
        } else {
            println("Transaksi ditolak! Pembayaran Rp $amount melebihi sisa limit Kartu Kredit.")
        }
    }
}