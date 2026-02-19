package oop_92718_RyannChandiari.week03

fun main() {
    val e = Employee("Budi")

    // Test Validasi Salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // Test Encapsulation
    e.increasePerformance()
    e.printStatus()

    // Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")

    // --- TUGAS MANDIRI 1: WEAPON ---
    println("\n--- Test Weapon ---")
    val sword = Weapon("Excalibur")

    // Coba set damage ke -50 (harus gagal dan print peringatan)
    sword.damage = -50

    // Coba set damage ke 9999 (harus dipaksa mentok di 1000)
    sword.damage = 9999

    // Print hasil akhir beserta Tier-nya
    println("Senjata: ${sword.name}, Damage: ${sword.damage}, Tier: ${sword.tier}")
}