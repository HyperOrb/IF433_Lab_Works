package oop_92718_RyannChandiari.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil di-pairing ke Hub.")
    }

    // Checkpoint 17: Logika matikan semua switch
    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Switch ---")
        for (device in devices) {
            // Smart Casting: Jika device bisa di-switch, matikan!
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    // Checkpoint 18: Logika Security Mode
    fun activateSecurityMode() {
        println("\n--- MENGAKTIFKAN SECURITY MODE ---")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan") // Casting otomatis!
            }
        }
    }
}