package oop_92718_RyannChandiari.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    // Test Smartwatch (Multiple Implementations)
    val myWatch = Smartwatch()
    myWatch.showTime()

    // Test Smartphone (Diamond Problem Resolution)
    val myPhone = Smartphone()
    myPhone.turnOn()

    // Test Pembayaran (Decoupling)
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)
}