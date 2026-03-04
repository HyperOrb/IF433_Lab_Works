package oop_92718_RyannChandiari.week05

fun main() {
    // --- BAGIAN 1: GUIDED LAB (PEGAWAI) ---
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    // Polymorphic Collection: List bertipe Parent, tapi isinya objek Child
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Runtime Polymorphism: Memanggil metode sesuai objek aslinya
        pegawai.bekerja()

        // Smart Casting dengan 'is'
        when (pegawai) {
            is Dosen -> {
                // Kotlin otomatis tahu ini Dosen, jadi bisa panggil .nidn dan .mengajar()
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }

    // --- BAGIAN 2: TUGAS MANDIRI 1 (MATH HELPER) ---
    // Checkpoint 6: Test MathHelper Overloading
    println("=== TEST MATH HELPER (OVERLOADING) ===")
    val math = MathHelper()

    // Memanggil hitungLuas(Int) -> Persegi
    println("Luas Persegi (5): ${math.hitungLuas(5)}")

    // Memanggil hitungLuas(Int, Int) -> Persegi Panjang
    println("Luas Persegi Panjang (4, 6): ${math.hitungLuas(4, 6)}")

    // Memanggil hitungLuas(Double) -> Lingkaran
    println("Luas Lingkaran (7.0): ${math.hitungLuas(7.0)}")

    // --- BAGIAN 3: TUGAS MANDIRI 2 (PAYMENT SYSTEM) ---
    println("\n=== TEST PAYMENT SYSTEM (POLYMORPHISM & SMART CAST) ===")

    // Checkpoint 10: Setup Objek
    val myEWallet = EWallet("RyannOVO", 50000.0) // Saldo awal 50rb
    val myCreditCard = CreditCard("RyannBCA", 100000.0) // Limit 100rb

    // Polymorphic Collection
    val paymentMethods: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    val billAmount = 75000.0 // Tagihan 75rb

    for (method in paymentMethods) {
        println("--- Memproses pembayaran Rp $billAmount dengan ${method.accountName} ---")

        // Panggil method polymorphic (akan gagal untuk EWallet karena saldo 50rb < 75rb)
        method.processPayment(billAmount)

        // Checkpoint 11: Smart Casting Challenge (Auto Recovery)
        // Logika: Jika metode ini aslinya EWallet DAN saldonya masih kurang, lakukan TopUp
        if (method is EWallet && method.balance < billAmount) {
            println(">> [SYSTEM] Saldo tidak cukup. Melakukan Auto-TopUp Rp 50.000...")
            method.topUp(50000.0) // Smart Cast membolehkan panggil fungsi topUp milik EWallet

            println(">> [SYSTEM] Mencoba pembayaran ulang...")
            method.processPayment(billAmount) // Coba bayar lagi
        }
        println()
    }
}