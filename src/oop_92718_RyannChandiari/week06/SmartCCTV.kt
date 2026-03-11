package oop_92718_RyannChandiari.week06

// Mewarisi 1 Device dan 2 Kemampuan (Compound Interfaces)
class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV '$name' menyala.")
        startRecord() // Otomatis merekam saat dinyalakan
    }

    override fun turnOff() {
        println("CCTV '$name' dimatikan.")
        stopRecord() // Memanggil default method dari interface
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam video keamanan.")
    }
}