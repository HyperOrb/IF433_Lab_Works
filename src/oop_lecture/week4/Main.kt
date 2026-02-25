package oop_lecture.week4

fun main() {
    val bajuku = Baju()
    bajuku.update_stock(3)
    bajuku.jumlah_penjualan()

    val celanaku = Celana()
    celanaku.jumlah_penjualan()
    celanaku.update_stock()
}