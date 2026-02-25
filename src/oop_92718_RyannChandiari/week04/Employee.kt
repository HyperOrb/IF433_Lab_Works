package oop_92718_RyannChandiari.week04

// Class Parent wajib 'open'
open class Employee(val name: String, val baseSalary: Int) {

    // Method wajib 'open' agar bisa di-override
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        // Bonus default 10% dari gaji pokok
        return (baseSalary * 0.1).toInt()
    }
}