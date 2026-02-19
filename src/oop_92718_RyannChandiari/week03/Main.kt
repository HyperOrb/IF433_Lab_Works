package oop_92718_RyannChandiari.week03

fun main() {
    // --- GUIDED LAB: EMPLOYEE ---
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    e.printStatus()
    println("Pajak yang harus dibayar: ${e.tax}")

    // --- TUGAS MANDIRI 1: WEAPON ---
    println("\n--- Test Weapon ---")
    val sword = Weapon("Excalibur")
    sword.damage = -50
    sword.damage = 9999
    println("Senjata: ${sword.name}, Damage: ${sword.damage}, Tier: ${sword.tier}")

    // --- TUGAS MANDIRI 2: PLAYER ---
    println("\n--- Test Player ---")
    val p1 = Player("RyannZ")

    // p1.xp = 100 // Coba hapus komen (//) di awal baris ini, pasti error karena xp itu private!

    println("Player ${p1.username} dibuat. Level awal: ${p1.level}")
    p1.addXp(50) // Tambah 50 XP (Total 50, Masih Level 1)
    p1.addXp(60) // Tambah 60 XP (Total 110, Naik ke Level 2!)

    println("Level akhir: ${p1.level}")
}