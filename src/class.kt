class Car{

    var carName: String ="Toyota"
    var model : String ="2010"
    var colour = "black"
    fun car(){
        println("$carName medel: $model colour: $colour")
    }

}

fun main() {
  val car1 = Car()
    car1.car()
    val car2 = Car()
    car2.carName = "FOrd"
    car2.model = "2020"
    car2.colour = "Green"
    car2.car()

}
//class is blueprint of an Object .
// Object is instance of a class.