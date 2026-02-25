package oop_92718_RyannChandiari.week04

// Car "Is-A" Vehicle
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    // Override honk
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    // Override accelerate dengan super
    override fun accelerate() {
        super.accelerate() // Panggil milik Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}