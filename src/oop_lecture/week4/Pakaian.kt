package oop_lecture.week4

open class Pakaian {
    var merk: String = ""
    protected var harga: Int = 0

    init {
        this.merk = "Uniqlo"
        println("Merk adalah $merk")
    }

    fun jumlah_penjualan() {
        println("Pakaian terjual")
    }
}