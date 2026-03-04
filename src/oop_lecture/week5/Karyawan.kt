package oop_lecture.week5

abstract class Karyawan {
    val nama: String = "Budi"
    abstract fun bekerja(kecepatan: Int = 3): String
}

class Staff: Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Staff ngetik, kecepatan $kecepatan"
    }
}

class Manager: Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Manager mengawasi $kecepatan km/jam"
    }
}

fun main() {
    val staf = Staff()
    println(staf.bekerja(kecepatan = 7))

    val mgr = Manager()
    println(mgr.bekerja(kecepatan = 12))
}