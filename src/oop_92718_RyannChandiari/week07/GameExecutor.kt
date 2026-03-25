package oop_92718_RyannChandiari.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Bertemu monster: ${event.monsterName}")
        is BattleState.LootDropped -> println("Loot Drop: ${event.item.name} (${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over! Alasan: ${event.reason}")
        BattleState.SafeZone -> println("Berada di zona aman.")
    }
}