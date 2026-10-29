fun main(args: Array<String>) {
    val object1 = BankAccountM()
    val saving = SavingsAccountM()
    val current = CurrentAccountM()
    object1.calculateTheInterest()
    saving.calculateTheInterest()
}
open class BankAccountM{
   open fun calculateTheInterest(){
       println("General bank account interest")
    }
}
open class CurrentAccountM : BankAccountM(){
    open fun currentFun(){
        println("Current fun")
    }
    override fun calculateTheInterest() {
        println("Current bank account interest")
    }
}
class SavingsAccountM : BankAccountM(){
    override fun calculateTheInterest() {
        println("Saving bank account interest")
    }

}
class Fix :CurrentAccountM(){
    override fun currentFun() {

    }
    override fun calculateTheInterest() {

    }
}