fun main(args: Array<String>) {
    // while loop to print line 5 times
    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }

    // compute sum
    var sum = 0
    var j = 100

    while (j != 0) {
        sum += j     // sum = sum + i;
        --j
    }
    println("sum = $sum")

    // do while loop
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")
}