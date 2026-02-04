package oop_92718_RyannChandiari.week01

fun main() {
    val title = "Elden Ring"
    val price = 600000
}

// Logic: Jika > 500k bayar 80% (diskon 20%), selain itu bayar 90% (diskon 10%)
fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()