package oop_92718_RyannChandiari.week01

fun main() {
    // REFACTOR: Gunakan val (bukan var) dan hapus tipe data (: String/: Int)
    val name = "John Thor"
    val score = 80

    // REFACTOR: Pakai String Template ($variable) biar lebih ringkas
    println("Nama: $name, Nilai: $score")

    // Checkpoint 3: Tambahkan logika when sebagai Expression
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}