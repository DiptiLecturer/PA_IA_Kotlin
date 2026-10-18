fun main(args: Array<String>) {
    print("enter number: ")
    val a = readln().toInt()

    val result = factorial(a)
    println( result )

}

fun factorial(a:Int):Int{
    val result:Int

    if( a <= 1){
        result = a
    }else{
        result = a*factorial(a-1)
    }

    return result
}