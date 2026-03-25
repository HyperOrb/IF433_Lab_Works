package oop_lecture.week7

object Koneksi {
    var alamatServer: String = "http://localhost:8080"

    fun konek_db() {
        println("Konek ke db saya di $alamatServer")
    }
}