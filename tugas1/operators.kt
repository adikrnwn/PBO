fun main(args: Array<String>) {
    var x = 100 + 50
    println(x)

    var sum1 = 100 + 50        // 150 (100 + 50)
    var sum2 = sum1 + 250      // 400 (150 + 250)
    var sum3 = sum2 + sum2     // 800 (400 + 400)
    println(sum1)
    println(sum2)
    println(sum3)

    // modulus
    var x1 = 5
    var y1 = 2
    println(x1 % y1)

    // increment
    var x2 = 5
    ++x2
    println(x2)

    // decrement
    --x2
    println(x2)

    // x3+5
    var x3 = 10
    x3 += 5
    println(x3)

    // x3-3
    x3 -= 3
    println(x3)

    // x3*3
    x3 *= 3
    println(x3)

    // x3/3
    x3 /= 3
    println(x3)

    // x3%3
    x3 %= 3
    println(x3)

    // comparison operators
    var a = 5
    var b = 3
    println(a == b) // returns false because 5 is not equal to 3
    println(a != b) // returns true because 5 is not equal to 3
    println(a > b) // returns true because 5 is greater than 3
    println(a < b) // returns false because 5 is not less than 3
    println(a >= b) // returns true because five is either greater than, or equal, to 3
    println(a <= b) // returns false because 5 is neither less than or equal to 3

    // logical operators
    var m = 5
    println(m > 3 && m < 10) // returns true because 5 is greater than 3 AND 5 is less than 10
    println(m > 3 || m < 4) // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
    var myBool = true
    println(!myBool) // returns false because the ! (not) operator reverses the result
}