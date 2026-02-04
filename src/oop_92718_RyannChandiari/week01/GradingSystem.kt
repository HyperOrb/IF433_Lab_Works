package oop_92718_RyannChandiari.week01

fun main() {
    val name = "John Thor"
    val score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    // Panggil fungsi status di sini
    println("Status: ${calculateStatus(score)}")
}

// Fungsi dibuat DI LUAR main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"