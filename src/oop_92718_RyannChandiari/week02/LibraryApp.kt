package oop_92718_RyannChandiari.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- PERPUSTAKAAN UMN ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi durasi tidak boleh minus
    if (duration < 0) duration = 1

    val loan = Loan(title, borrower, duration)
    println("Detail Peminjaman: Buku '${loan.bookTitle}' dipinjam oleh ${loan.borrower}")
    println("Total Denda: Rp ${loan.calculateFine()}")
}