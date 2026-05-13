package oop_lecture.week12

sealed class ATMException(val pesan: String) : Exception(pesan)

class cek_saldo(val saldo: Int) : ATMException(
    "Saldo gak cukup, karena sisa saldo kamu Rp$saldo"
)

class batas_jajan(val amount: Int) : ATMException(
    "Jajan $amount melebihi limit harian 1000"
)

fun mulai_jajan(saldoSaya: Int, jajanSaya: Int): Int {
    if (jajanSaya > 1000) {
        throw batas_jajan(amount = jajanSaya)
    } else if (saldoSaya < jajanSaya) {
        throw cek_saldo(saldoSaya)
    } else {
        return saldoSaya - jajanSaya
    }
}

fun main() {
    // Run Catching IDIOM
    runCatching {
        mulai_jajan(saldoSaya = 800, jajanSaya = 400)
    }
        .onSuccess { sisaSaldo ->
            println("Transaksi Sukses")
            println("Sisa saldo kamu adalah Rp$sisaSaldo")
        }
        .onFailure {
            println("Transaksi Gagal: ${it.message}")
        }
}