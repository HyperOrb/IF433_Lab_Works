package oop_lecture.week4

class Baju : Pakaian() {
    private var stock: Int = 10

    fun update_stock(terjual: Int) {
        super.harga = stock * 100
        println("Stock $stock baju Terupdate, harga ${super.harga}")
    }

    override fun jumlah_penjualan() {
        println("Baju terjual !!!!")
    }
}