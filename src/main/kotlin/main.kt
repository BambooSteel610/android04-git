import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.lang.Exception
import java.sql.DriverManager

const val errNoNumber = "please input only numbers separated with space"
fun main() {
    val inputNumbers = input()
    if(inputNumbers != null) output(inputNumbers)
}
fun input(): Double? {
    return try {
        print("Logarit Nepe of: ")
        readLine()?.toDouble()
    } catch (e: Exception) {
        println(errNoNumber)
        return null
    }
}



fun output(inputNumbers: Double){
    val Ln = calculator(::LogaritNepe, inputNumbers)
    println("Logarit nepe result: $Ln")
}

fun calculator(function: (Double) -> Double, numberArg:Double) = function(numberArg)

fun LogaritNepe(n:Double):Double{
    var sum:Double = 0.0
    println("N: $n");
    var base = ((n-1) .div (n+1))
    println("base: $base");
    for(i in 1..10000){
        var divisor = ((2 * i) - 1).toDouble()
        var pow:Double = Math.pow(base,divisor)
        pow = pow .div(divisor)
        sum = sum.plus(pow)
    }
    return 2*sum
}
