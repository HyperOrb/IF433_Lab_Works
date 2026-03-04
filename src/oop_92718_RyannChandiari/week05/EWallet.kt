package oop_92718_RyannChandiari.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Sukses bayar Rp $amount pakai E-Wallet. Sisa saldo: Rp $balance")
        } else {
            println("Gagal bayar Rp $amount. Saldo E-Wallet tidak cukup (Sisa: $balance).")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up Rp $amount berhasil. Saldo sekarang: Rp $balance")
    }
}