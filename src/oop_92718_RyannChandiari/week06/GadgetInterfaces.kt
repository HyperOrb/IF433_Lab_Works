package oop_92718_RyannChandiari.week06

interface Camera {
    // Fungsi ini punya "body" (Default Method)
    fun turnOn() { println("Lensa kamera terbuka dan sensor aktif.") }
}

interface Phone {
    fun turnOn() { println("Sinyal seluler mencari jaringan.") }
}