package oop_92718_RyannChandiari.week07

// Constructor di-private agar tidak bisa dipanggil langsung
class Weapon private constructor(val item: GameItem, val durability: Int) {

    // Pabriknya ada di sini
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Pedang Keadilan", 150, ItemRarity.EPIC)
            return Weapon(epicItem, 100)
        }
    }
}