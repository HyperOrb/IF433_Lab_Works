package oop_92718_RyannChandiari.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    // REFACTOR: Panggil fungsi di dalam println
    println(checkSize(area))
}

// REFACTOR: Ubah jadi Expression Body (mengembalikan String)
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"