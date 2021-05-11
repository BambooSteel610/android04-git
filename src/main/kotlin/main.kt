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

fun LogaritNepe(n:Int):Double{
    var sum:Double = 0.0
    var base:Double = 0.0
    var divisor:Double = 0.0
    var pow:Double = 0.0
    base = ((n-1) / (n+1)).toDouble()
    for(i in 1..10000){
        divisor = ((2 * i) - 1).toDouble()
        pow = Math.pow(base,divisor)
        pow = pow / divisor
        sum = sum + pow
    }
    return 2*sum
}
