fun main() {

   /* for(i in 10 downTo 2 step 2) {
        println(i)
    }*/

   /* print("Enter number: ")
    val number = readln().toInt()
    for(i in 1..10) {
        println("$number * $i = ${number * i} ")
    } */

    var sum = 0
    for(i in 1..4) {
        if(i%2 == 0) {
            sum += i
        }
    }
    println(sum)



}