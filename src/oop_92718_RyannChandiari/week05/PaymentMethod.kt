package oop_92718_RyannChandiari.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}