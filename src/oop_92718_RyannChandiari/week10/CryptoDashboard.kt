package oop_92718_RyannChandiari.week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")

    // 1. Inisialisasi dan Mengisi Data Koin
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 500.0))

    // 2. Simulasi Response Jaringan (Membungkus List Koin)
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // 3. Menampilkan Data Koin
    println("\nStatus Jaringan: ${response.status}")
    println("Daftar Aset Koin:")
    response.data.forEach { coin ->
        println("- ${coin.name}: ${coin.balance}")
    }

    // Tes fungsi pencarian khusus (Berhasil karena Coin punya 'name')
    val searchResult = coinRepo.findByName("ETH")
    println("\nHasil Pencarian Koin 'ETH': $searchResult")

    // 4. Inisialisasi dan Mengisi Data Transaksi
    println("\n=== RIWAYAT TRANSAKSI ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX1001", 0.5))
    txRepo.add(Transaction("TX1002", 2.0))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())
    txResponse.data.forEach { tx ->
        println("- [${tx.id}] Jumlah: ${tx.amount}")
    }

    // txRepo.findByName("TX1001") // JIKA DI-UNCOMMENT INI AKAN ERROR karena Transaction tidak punya 'name'. (Aman secara tipe!)
}