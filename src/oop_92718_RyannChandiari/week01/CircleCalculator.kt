package oop_92718_RyannChandiari.week01

fun main(args: Array<String>) {
    // REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val radius = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius * radius

    // REFACTOR: Gunakan String Template
    println("Radius: $radius, Area: $area")

    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}