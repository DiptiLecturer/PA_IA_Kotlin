fun main() {
//    print("enter first number: ")
//    val a = readln().toInt()
//    print("enter second number: ")
//    val b = readln().toInt()
//    print("enter third number: ")
//    val c = readln().toInt()
//    if (a == b && b == c) {
//        println(" a b and c are equal")
//    } else if (a > b && a > c) {
//        println("a is greater than b and c")
//    } else if (b > a && b > c) {
//        println("b is greater than a and c")
//    } else {
//        println("c is greater than a and b")
//    }
    //||
//    print(" enter ur number : ")
//    val number = readln().toInt()
//
//    if (number < 0 ) {
//        println("number is negative")
//    }else if (number > 100) {
//        println("number is invalid")
//    }else{
//        if (number in 1..<50) {
//            println("Fail ")
//        } else if (number in 50..<80) {
//            println("A ")
//        } else {
//            println("A+ ")
//        }
//    }
    print(" enter ur number : ")
    val number = readln().toInt()

    when (number) {
        in 0..49 -> println("F")
        in 50..79 -> println("A")
        in 80..100 -> println("A+")
        else -> println("Invalid")
    }


}