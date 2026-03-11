package oop_92718_RyannChandiari.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    // Default method (punya body)
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}