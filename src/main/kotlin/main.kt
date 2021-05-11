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
}

fun calculator(function: (List<Int>) -> Double, numberArg:List<Int>) = function(numberArg)

fun minus(numbers:List<Int>):Double{
    var minus = 0
    numbers.forEach{minus -=it }
    return minus.toDouble()                                
}
