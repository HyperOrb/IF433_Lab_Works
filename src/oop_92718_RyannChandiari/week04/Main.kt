package oop_92718_RyannChandiari.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    // --- TAMBAHAN TUGAS MANDIRI 1 ---
    println("\n--- Testing ElectricCar ---")
    val myEv = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myEv.accelerate() // Memanggil method yang sudah di-final-kan
    myEv.honk()       // Memanggil method turunan dari Car
    myEv.openTrunk()  // Memanggil method turunan dari Car

    // --- TAMBAHAN TUGAS MANDIRI 2 ---
    println("\n--- Testing Employee Hierarchy ---")

    val boss = Manager("Pak Budi", 10000000)
    boss.work()
    println("Bonus Manager: Rp ${boss.calculateBonus()}")

    val dev = Developer("Ryann", 8000000, "Swift")
    dev.work()
    println("Bonus Developer: Rp ${dev.calculateBonus()}")
}