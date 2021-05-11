import java.lang.Exception

const val errNoNumber = "Please input only numbers separated with space"

fun main() {
    val inputNumbers = input()
    if(inputNumbers != null) output(inputNumbers)
}

fun input(): Int? {
    return try {
        print("Exponential of: ")
        readLine()?.toInt()
    } catch (e: Exception) {
        println(errNoNumber)
        return null
    }
}

fun output(inputNumbers: Int){
    val result = calculator(::exponential, inputNumbers)
    println("Is : $result")
}

fun calculator(function: (Int) -> Int, numberArg:Int) = function(numberArg)

fun exponential(number : Int) : Int{
    var exponentialOf = 1
    for(i in 1..number){
        exponentialOf *= i
    }

    return exponentialOf
}