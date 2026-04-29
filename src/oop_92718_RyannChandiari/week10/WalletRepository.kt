package oop_92718_RyannChandiari.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}

// Fungsi pencarian ini HANYA aktif jika tipe datanya mewarisi NamedItem (contoh: Coin)
fun <T : NamedItem> WalletRepository<T>.findByName(query: String): List<T> {
    return this.getAll().filter { it.name.equals(query, ignoreCase = true) }
}