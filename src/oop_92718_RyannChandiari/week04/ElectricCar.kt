package oop_92718_RyannChandiari.week04

// ElectricCar mewarisi (extends) class Car
class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : Car(brand, numberOfDoors) { // Constructor chaining ke Parent (Car)

    // Mengunci method menggunakan keyword 'final'
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}