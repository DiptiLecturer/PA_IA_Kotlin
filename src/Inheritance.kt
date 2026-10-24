fun main(args: Array<String>) {
    val atm = ATM()
    println(atm.balance)
    atm.deposit(500.00)
    println(atm.balance)
    atm.withdraw(200.00)
}
open class BankAccount {
    var balance: Double = 0.0
    fun deposit(amount: Double) {
        balance += amount
    }
    fun withdraw(amount: Double) {
        balance -= amount
        println(balance)
    }
}
class ATM() :BankAccount(){

}

//vehicle -> parent
//class bike -> Child,parent
//class car -> Child
//parent - Child
//super - sub
//Base - Derived