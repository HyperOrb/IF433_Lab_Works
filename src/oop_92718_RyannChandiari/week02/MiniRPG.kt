package oop_92718_RyannChandiari.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- MINI RPG BATTLE ---")

    print("Nama Hero: ")
    val name = scanner.nextLine()
    print("Base Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)
    var enemyHp = 100

    println("Pertarungan Dimulai! ${hero.name} VS Enemy (HP: $enemyHp)")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nGiliranmu: 1. Serang  2. Kabur")
        print("Pilih: ")
        val action = scanner.nextInt()

        if (action == 1) {
            // Hero menyerang
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Enemy HP tersisa: $enemyHp")

            // Enemy membalas jika masih hidup
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas!")
                hero.takeDamage(enemyDamage)
            }
        } else if (action == 2) {
            println("${hero.name} melarikan diri...")
            break
        }
    }

    // Hasil Akhir
    println("\n--- GAME OVER ---")
    if (hero.isAlive() && enemyHp == 0) {
        println("Selamat! ${hero.name} Menang!")
    } else if (!hero.isAlive()) {
        println("Yah.. ${hero.name} Kalah.")
    }
}