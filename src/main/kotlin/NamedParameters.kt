fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0
    var toggle = true //create a toggle boolean to check
    for (number in numbers) {
        if (toggle) { //if toggle is true add number to sum
            sum += number
        } else { //if toggle is false subtract number from sum
            sum -= number
        }
        toggle = !toggle //at the end of each iteration swap if true then false if false then true
    }
    return sum
}

fun searchFor(search: String, searchEngine: String = "Google") { //have a parameter value that can be used as the default value
    println("Searching for '$search' on $searchEngine ")
}


fun printDetails(name: String, age: Int = 0, city: String = "Unknown") {
    println("Name: $name, Age: $age, City: $city")
}

/*In Kotlin, named parameters allow you to specify the name of the parameter along with its value when calling a function.
This can make your code more readable and self-explanatory,
especially when dealing with functions that have a large number of parameters or optional parameters.
 */
