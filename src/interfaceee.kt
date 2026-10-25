fun main(args: Array<String>) {
val mobile = Mobile()
    mobile.battery()
}
interface Camera{

}
interface Gps  {

}
interface Battery {

    fun battery(){
        println("Battery level")
    }
}
interface Display  {
    fun display(){
        println("Big screen")
    }
}

class Mobile() : Display,Battery ,Camera {

}