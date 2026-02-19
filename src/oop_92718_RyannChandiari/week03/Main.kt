package oop_92718_RyannChandiari.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000 // Harusnya print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    e.printStatus()
    // e.performanceRating = 5 // Coba hapus komen (//) di awal baris ini, pasti error karena private

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}