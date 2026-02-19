package oop_92718_RyannChandiari.week03

class Player(val username: String) {
    // XP dibuat private agar tidak bisa diubah langsung dari Main
    private var xp: Int = 0

    // Level dihitung otomatis dari XP (Computed Property)
    val level: Int
        get() = (xp / 100) + 1

    // Fungsi aman untuk menambah XP
    fun addXp(amount: Int) {
        if (amount > 0) { // Hanya menerima angka positif
            val oldLevel = this.level // Simpan level sebelum ditambah XP
            xp += amount // Tambahkan XP

            // Jika level setelah ditambah XP lebih besar dari level lama, berarti Level Up!
            if (this.level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}