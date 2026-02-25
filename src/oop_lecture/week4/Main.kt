package oop_lecture.week4

fun main() {
    println("--- Inisialisasi Baju ---")
    val bajuku = Baju()
    bajuku.update_stock(3)

    println("\n--- Inisialisasi Celana ---")
    val celanaku = Celana()
    celanaku.update_stock()
}