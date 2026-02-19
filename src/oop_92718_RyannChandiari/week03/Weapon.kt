package oop_92718_RyannChandiari.week03

// name menggunakan val agar Read-only (tidak bisa diubah setelah dibuat)
class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                // Jika negatif, print peringatan dan JANGAN ubah nilai field-nya
                println("Peringatan: Damage tidak boleh negatif! Nilai tidak diubah.")
            } else if (value > 1000) {
                // Jika over 1000, paksa jadi 1000
                field = 1000
            } else {
                field = value
            }
        }

    // tier menggunakan Computed Property (Getter)
    val tier: String
        get() {
            return if (damage > 800) {
                "Legendary"
            } else if (damage > 500) {
                "Epic"
            } else {
                "Common"
            }
        }
}