fun main(args: Array<String>) {
    val a = 12
    val b = 5

    // simple when
    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }
    println("result = $result")

    println("Enter operator either +, -, * or /")
    val operators = readLine()

    when (operators) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operators is invalid")
    }

    // few possibilities
    // combine two or more branch
    val n = -1

    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }

    // check value in the range
    val c = 100

    when (c) {
        in 1..10 -> println("C positive number less than 11.")
        in 10..100 -> println("C positive number between 10 and 100 (inclusive)")
    }

    // check if a value is of a particular type
    val d = 11
    val e = "11"

    when (e) {
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close but not close enough.")
        d.toString() -> println("Bingo! It's eleven.")
    }
}