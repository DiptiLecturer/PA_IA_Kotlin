fun main() {

    println("""
    Add: ${add(10, 4)}
    Sub: ${sub(10, 5)}
    Multiply: ${multiply(10, 8)}
    Multiply: ${multiply(10, 4)}
    Divide: ${div(5, 2)}
    Mod: ${mod(10, 6)}
""".trimIndent())


}

fun add (a:Int ,b:Int):Int = a+b
fun sub (a:Int ,b:Int):Int = a-b
fun multiply (a:Int ,b:Int):Int = a*b
fun div (a:Int ,b:Int):Int = a/b
fun mod (a:Int ,b:Int):Int = a%b

/*
fun sub (a:Int ,b:Int){
    println(a - b)
}
fun multiply (){
    print("enter a : ")
    val a = readln().toInt()
    print("enter b : ")
    val b = readln().toInt()
    println(a * b)
}
fun division (){
    print("enter a : ")
    val a = readln().toInt()
    print("enter b : ")
    val b = readln().toInt()
    println(a / b)
}
fun mod (){
    print("enter a : ")
    val a = readln().toInt()
    print("enter b : ")
    val b = readln().toInt()
    println(a % b)
}
*/
