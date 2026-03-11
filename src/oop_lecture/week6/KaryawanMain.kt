package oop_lecture.week6

fun main() {
    val kry = Karyawan(
        namaKerjaan = "Ngoding",
        gaji = 10000,
        jmlHari = 23,
        namaGame = "Mobile Legends",
        waktuMain = 23
    )

    println("--- Output Program ---")
    kry.ngoding()
    kry.main_game()

    println("\n--- Output Tester ---")
    kry.tester()
}