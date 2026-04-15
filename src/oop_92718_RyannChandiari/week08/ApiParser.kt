package oop_92718_RyannChandiari.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak ID dan Name (Wajib). Kalau null, langsung throw Exception.
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" }.toString()
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" }.toString()

        // Ekstrak tipe sebagai String
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Ekstrak warranty. Jika gagal jadi Int atau null, fallback ke 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Ekstrak size. Jika gagal jadi String atau null, fallback ke "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null // Tipe tidak dikenal, return null
        }
    }

    // --- TAMBAHAN CHECKPOINT 18 ---
    fun checkout(product: Product) {
        // Ekstrak ID dari Sealed Class menggunakan when
        val id = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        // Panggil Java Service. Karena kita YAKIN balasan Java tidak akan null, kita berani pakai !!
        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Berhasil checkout dengan nomor resi: $transactionId")
    }
}