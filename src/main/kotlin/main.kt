import java.lang.Exception

const val errNoNumber = "please input only numbers separated with space"
fun main() {
    val inputNumbers = input()
    if(inputNumbers != null) output(inputNumbers)
}
fun input(): List<Int>? {
    return try {
        readLine()?.split(" ")?.map { it.toInt() }
    } catch (e: Exception) {
        println(errNoNumber)
        return null
    }
}
fun output(inputNumbers: List<Int>){
    val resultAdd = calculator(::add, inputNumbers)
    println("add result: $resultAdd")

    val resultDivide = calculator(::divide, inputNumbers)
    println("add result: $resultDivide")
}

fun calculator(function: (List<Int>) -> Double, numberArg:List<Int>) = function(numberArg)

fun add(numbers:List<Int>):Double{
    var sum = 0
    numbers.forEach{sum += it}
    return sum.toDouble()
}

fun divide(numbers:List<Int>):Double{
    var sum = numbers[0]*numbers[0].toDouble()
    numbers.forEach{sum /= it.toDouble()}
    return sum
}