package oop_lecture.week7

fun main() {
    println("server: " + Koneksi.alamatServer)
    Koneksi.konek_db()

    println("Kampus: " + Hitungan.namaKampus)
    println("Nomor: " + Hitungan.noIndukKampus)
    println("Tambahan: " + Hitungan.penambahan(10, 5))

    Hitungan.pindah_halaman(namaHal = "Profile")

    val siswa = Murid(nama = "Andi", nim = "123", angkatan = 2024);
    val siswa2 = siswa.copy(nama="Andi", nim = "123", angkatan = 2024);
    println(siswa);
    println(siswa2);
    println("Nama siswa1: "+ siswa.nama + " angkatan: "+ siswa.nim);
}