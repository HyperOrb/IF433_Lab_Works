package oop_lecture.week4

class Baju : Pakaian() {
    private var stock: Int = 10

    fun update_stock(terjual: Int) {
        stock -= terjual
        super.harga = stock * 100000
        println("Stock baju sisa $stock, harga total stok: ${super.harga}")
    }
}