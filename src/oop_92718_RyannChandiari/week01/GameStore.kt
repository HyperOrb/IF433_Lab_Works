package oop_92718_RyannChandiari.week01

fun main() {
    val title = "Elden Ring"
    val price = 600000

    // CHECKPOINT 13: Variabel nullable
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    // Logika Elvis Operator: Jika userNote null, gunakan "Tidak ada catatan"
    val finalNote = userNote ?: "Tidak ada catatan"

    // Panggil fungsi dengan Named Arguments
    printReceipt(title = title, finalPrice = finalPrice, note = finalNote)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

// Update fungsi untuk menerima parameter note
fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("=== STRUK BELANJA ===")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: $note")
}