package oop_92718_RyannChandiari.week01

fun main() {
    val title = "Elden Ring"
    val price = 600000

    val finalPrice = calculateDiscount(price)

    // CHECKPOINT 12: Panggil fungsi dengan Named Arguments (wajib pakai title = ...)
    printReceipt(title = title, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

// Fungsi baru untuk cetak struk
fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK BELANJA ===")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
}