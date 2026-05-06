package oop_92718_RyannChandiari.week11

fun main() {
    println("=== SMART HOME SETUP PIPELINE ===")

    // Checkpoint 13: Inisialisasi Sistem
    val homeDevices = mutableListOf<SmartDevice>()

    // Checkpoint 14: Konfigurasi Pencahayaan (apply & also)
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // Checkpoint 15: Konfigurasi Keamanan (apply & also)
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // Checkpoint 16: Konfigurasi AC & Kabel (run)
    val ac = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)

    // Menambah alat pakan peliharaan
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    // Checkpoint 17: Pencarian Aman dengan let
    println("\n=== DEVICE SEARCH ===")
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    // Checkpoint 18: Menggunakan with untuk Summary
    println("\n=== SUMMARY ===")
    with(homeDevices) {
        println("Total perangkat: ${this.size}")
    }

    // Checkpoint 19: Kalkulasi Daya dengan run
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total penggunaan daya: $totalPower Watt")

    // Checkpoint 20: Eksekusi Dashboard (Iterasi & Diagnosis)
    println("\n=== FULL SYSTEM DIAGNOSTIC ===")
    homeDevices.forEach {
        println(it.diagnose())
    }
}