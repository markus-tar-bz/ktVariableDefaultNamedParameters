

fun main() {
    val array  = intArrayOf(10, 20, 25) //intArrayOf takes vararg elements
    val max = getMax(1, 4, 5, 6, 3, *array, 8, 9, 10, 15) //vararg can also be used to insert arrays inside parameter list
    println("The maximum is $max\n")

    searchFor("How to become a good programmer") //uses default value for 2nd parameter
    searchFor("How to become the best kotlin programmer", "Bing")
    searchFor(search = "How to become the best kotlin programmer", searchEngine = "Bing") //specify we want to use parameter search
    // you don't need named args to be in the same order as parameters, ::searchEngine can come first
    // named parameters helpful in fns with many parameters and don't remember the order you put them

    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    println("The alternating sum is $sum\n")

    val numArray = intArrayOf(1, 2, 3, 4, 5)
    printNumbers(*numArray)
    /*Here, the * operator is used to spread the elements of the numArray array as individual arguments when calling the printNumbers function.
    It's important to note that a vararg parameter must be the last parameter in the parameter list.
     */

    // Calling the function with only the required parameter
    printDetails(name = "Alice")

    // Calling the function with some named parameters
    printDetails(name = "Bob", city = "Paris")

    /*In the second printDetails example, the age parameter has a default value of 0,
    and the city parameter has a default value of "Unknown". When calling the function,
    you can choose to provide values only for the parameters you want to override.
     */


}

fun getMax(vararg numbers: Int): Int { //arg replaces (list: List<Int>)
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

/*In Kotlin, the vararg keyword is used to define a function parameter that allows a variable number of arguments of the same type.
The term "vararg" is short for "variable number of arguments."

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main() {
    printNumbers(1, 2, 3, 4, 5)
}

In this example, the printNumbers function accepts an arbitrary number of Int values.
You can call this function with any number of integer arguments, and it will print each of them.
 */

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println("Number $number\n")
    }
}


