var name = "John"      // String (text)
val birthyear = 1975   // Int (number)

val pi = 3.14159265359

val firstName = "John "
val lastName = "Doe"

val x = 5
val y = 6


fun main(args: Array<String>) {
    println(name)          // Print the value of name
    println(birthyear)     // Print the value of birthyear

    name = "Robert"
    println(name)

    println(pi)

    val fullName = firstName + lastName
    println(fullName)

    println(x + y) // Print the value of x + y
}