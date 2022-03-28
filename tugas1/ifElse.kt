fun main(args: Array<String>) {
    if (20 > 18) {
        println("20 is greater than 18")
    }

    val x = 20
    val y = 18
    if (x > y) {
        println("x is greater than y")
    }

    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
    // Outputs "Good evening.

    val time1 = 20
    val greeting = if (time1 < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    val greetings = if (time1 < 18) "Good day." else "Good evening."
    println(greetings)
}