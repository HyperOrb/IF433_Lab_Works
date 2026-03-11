package oop_lecture.week6

class Karyawan(
    override val namaKerjaan: String,
    override val gaji: Int,
    override val jmlHari: Int,
    override val namaGame: String,
    override val waktuMain: Int
) : Bekerja, Bermain {

    override fun ngoding() {
        println("kerjaan kamu $namaKerjaan")
        println("Gaji kamu ${super.gajiDidapat}")
    }

    override fun main_game() {
        println("main $namaGame selama $waktuMain jam")
    }

    override fun tester() {
        super<Bekerja>.tester()
        super<Bermain>.tester()
    }
}