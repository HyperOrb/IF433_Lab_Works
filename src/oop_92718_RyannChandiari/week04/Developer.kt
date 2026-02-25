package oop_92718_RyannChandiari.week04

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String // Properti khusus Developer
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}