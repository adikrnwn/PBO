fun main(args: Array<String>) {
    var number = 5.5
    println("Result = ${Math.sqrt(number)}")

    println("---------------")

    callMe()
    println("Printing outside from callMe() function.")

    println("---------------")

    val number1 = 12.2
    val number2 = 3.4
    val result: Int
    result = addNumbers(number1, number2)
    println("result = $result")

    println("---------------")

    println(getName("John", "Doe"))
}

fun callMe() {
    println("Printing from callMe() function.")
    println("This is cool (still printing from inside).")
}

fun addNumbers(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun getName(firstName: String, lastName: String): String = "$firstName $lastName"