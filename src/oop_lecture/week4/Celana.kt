package oop_lecture.week4

class Celana : Pakaian() {
    private var stock: Int = 20

    fun update_stock() {
        super.harga = stock * 120
        println("Stock $stock cellaannaa Terupdate, harga ${super.harga}")
    }
}