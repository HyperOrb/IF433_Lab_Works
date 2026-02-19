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
}