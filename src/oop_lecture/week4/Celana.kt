package oop_lecture.week4

class Celana : Pakaian() {
    private var stock: Int = 20

    fun update_stock() {
        super.harga = stock * 150000
        println("Stock celana tersedia $stock, harga total stok: ${super.harga}")
    }
}