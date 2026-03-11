package oop_92718_RyannChandiari.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    // --- LATIHAN TERBIMBING ---
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    // --- TUGAS MANDIRI: SMART HOME ---
    println("\n=== TESTING SMART HOME SYSTEM ===")

    // Checkpoint 19: Instansiasi Perangkat
    val lamp = SmartLamp("LMP-01", "Ruang Tamu")
    val speaker = SmartSpeaker("SPK-01", "Google Nest Dapur")
    val cctv = SmartCCTV("CAM-01", "Ezviz Garasi")

    // Checkpoint 20: Instansiasi Hub dan Testing Logika
    val hub = SmartHomeHub()

    // Tambahkan semua perangkat ke Hub
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n--- Menyalakan Perangkat Manual ---")
    lamp.turnOn()
    speaker.turnOn()
    cctv.turnOn() // Harusnya langsung otomatis merekam!

    // Uji fitur canggih Smart Hub (Polymorphism & Smart Casting)
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}