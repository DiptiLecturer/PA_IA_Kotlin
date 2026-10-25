/*fun main(args: Array<String>) {
    val myBA: MyBankAccount = MyBankAccount()
    myBA.balance

    val atm = MyAtm()
    atm.atmBalance = 500.0
}
open class MyBankAccount {
    internal var balance: Double = 0.0
    fun deposit(amount: Double) {
        balance += amount
    }
    fun withdraw(amount: Double) {
        balance -= amount
        println(balance)
    }
}
class MyAtm() : MyBankAccount() {
    var atmBalance: Double = balance
}
class BKash() : MyBankAccount() {
    var bKashBalance: Double = balance
}*/
fun main() {

    val account = OurBankAccount()

    account.deposit(5000.0)

    println("Balance: ${account.getBalance()}")

    account.withdraw(2000.0)

    println("Balance: ${account.getBalance()}")

    // account.balance = 100000.0  // ❌ Not allowed
}


open class OurBankAccount {

    // Encapsulated data
    private var balance: Double = 0.0


    // Controlled way to add money
    fun deposit(amount: Double) {

        if (amount > 0) {
            balance += amount
            println("$amount deposited successfully")
        } else {
            println("Invalid amount")
        }
    }


    // Controlled way to withdraw money
    fun withdraw(amount: Double) {

        if (amount <= 0) {
            println("Invalid amount")

        } else if (amount > balance) {
            println("Insufficient balance")

        } else {
            balance -= amount
            println("$amount withdrawn successfully")
        }
    }


    // Controlled way to view balance
    fun getBalance(): Double {
        return balance
    }
}
class a:OurBankAccount(){

}
