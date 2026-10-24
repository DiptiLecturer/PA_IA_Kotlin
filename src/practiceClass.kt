fun main() {

    val morsalin = Studentt()
    morsalin.id=1
    morsalin.name = "Morsalin"
    morsalin.age = 20
    morsalin.showDetails()
    println("-------------")
    val nazmul = Studentt()
    nazmul.id=2
    nazmul.name = "Nazmul"
    nazmul.age = 21
    nazmul.showDetails()

}
class Studentt(){

    //class properties
    var id :Int = 0//member variable
    var name :String = ""
    var age :Int = 0
    fun showDetails(){ //member method
        println("id : $id")
        println("Name: $name")
        println("Age: $age")
    }
}