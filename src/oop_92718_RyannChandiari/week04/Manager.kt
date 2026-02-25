package oop_92718_RyannChandiari.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Panggil perhitungan bonus asli (10%), lalu tambah 500.000
        return super.calculateBonus() + 500000
    }
}