import java.math.*
fun main() {
//    val obj1 = MOL()
//    val c = obj1.add(4,4.0,)
//    print(c)
    val object2 = MOL()
    object2.area(3.2,)
}
class MOL {
//    fun add(a: Int, b: Int): Int {
//        return a + b
//    }
//    fun add(a: Int, b: Double): Double {
//        return a + b
//    }

    fun area(b: Double,h: Double) {
        val result = .5*b*h
        print("area of a triangle is $result")
    }
    fun area(r: Double,) {
        val result = Math.PI *r*r
        print("area of a Circle is $result")
    }
}
