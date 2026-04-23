package oop_92718_RyannChandiari.week09

fun main() {
    // Checkpoint 11: Inisialisasi Data Uji
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 50, 45.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 100, -12.0, "CLOSED"),
        TradeLog("ADAUSDT", "LONG", 5, 2.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 0.0, "OPEN") // Status OPEN akan terfilter
    )

    // Checkpoint 12: Ekstraksi Data Valid (Hanya yang CLOSED)
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    // Checkpoint 13: Memisahkan Winning Trades (ROE > 0)
    val winningTrades = closedTrades.filter { it.roe > 0 }

    // Checkpoint 14: Memisahkan Losing Trades (ROE <= 0)
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    // Checkpoint 15: Analisis Koin Profit Tertinggi (Sorting & Mapping)
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Checkpoint 16: Analisis Koin Loss (Sorting & Mapping)
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Checkpoint 17: Ekstraksi Unik Koin yang ditradingkan (Set)
    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    // Checkpoint 18: Menampilkan Dashboard Utama
    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }

    // Checkpoint 19: Menampilkan Sisa Dashboard
    worstPerformersString.forEach { println(it) }
    println("\nUnique Pairs Traded: $uniquePairs")
}