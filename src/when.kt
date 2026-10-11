fun main(args: Array<String>) {
    print("enter first number: ")
    val a = readln().toInt()
    print("enter second number: ")
    val b = readln().toInt()
    print("enter operator: + - * / : ")
    val operator = readln()
  when (operator) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> if (b == 0) {
            println("divide by 0 not possible.")
        } else {
            println(a / b)
        }
        else -> println("Invalid")
    }

}