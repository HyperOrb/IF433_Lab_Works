package oop_lecture.week7

// Menambahkan private constructor agar class tidak bisa di-instantiate langsung dari luar
class Hitungan private constructor(var halaman: String) {

    companion object {
        const val namaKampus: String = "UMN"
        const val noIndukKampus: String = "123456"

        fun penambahan(a: Int, b: Int): Int {
            return a + b
        }

        // Fungsi ini bisa memanggil constructor karena berada di dalam companion object
        fun pindah_halaman(namaHal: String) {
            Hitungan(halaman = namaHal)
        }
    }

    // init block akan otomatis jalan setiap kali instance Hitungan dibuat
    init {
        if (halaman == "home") {
            println("Welcome Home")
        } else {
            println("Halaman lainnya")
        }
    }
}