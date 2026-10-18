fun main(args: Array<String>) {

    val result = calculate(6, 5, ::subb)
    val result1 = calculate(4, 5, ::sum)
    println( result )
    println( result1 )

}
fun sum(a: Int, b: Int) = a + b
fun subb(x: Int, y: Int) = x - y

fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
    return operation(a, b)
}