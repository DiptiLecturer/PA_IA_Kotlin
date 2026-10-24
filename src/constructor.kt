//primary constructor
class Add(val a: Int, val b: Int) {
    val c = a + b
}

fun main() {
    val add = Add(5, 6)
    println("The Sum of two numbers is: ${add.c}")

    val person = Person("Geeks")
    //println("Name = ${person.name}")
}
//init block
class Person(val name: String) {
    init { println("This is first init block") }
    init { println("This is second init block") }
    init { println("This is third init block") }
}

