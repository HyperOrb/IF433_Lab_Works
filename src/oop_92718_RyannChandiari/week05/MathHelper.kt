package oop_92718_RyannChandiari.week05

class MathHelper {
    // 1. Luas Persegi (sisi x sisi)
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // 2. Luas Persegi Panjang (panjang x lebar)
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // 3. Luas Lingkaran (3.14 x r x r)
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}