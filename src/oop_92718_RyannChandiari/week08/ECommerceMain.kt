package oop_92718_RyannChandiari.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()
    println("=== E-COMMERCE BATCH PROCESSING ===")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                if (it is Product.Electronic) {
                    println("\nMemproses Produk: ${it.name}")
                    println("Garansi: ${it.warrantyMonths} bulan")
                } else if (it is Product.Clothing) {
                    println("\nMemproses Produk: ${it.name}")
                    println("Ukuran: ${it.size}")
                }

                parser.checkout(it)
            } ?: println("\nINFO: Tipe produk tidak dikenali, di-skip.")

        } catch (e: IllegalArgumentException) {
            println("\nERROR TERTANGKAP: ${e.message} (Data diabaikan)")
        }
    }
}