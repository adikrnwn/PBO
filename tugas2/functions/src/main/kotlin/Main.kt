fun myFunction() {
    println("I just got executed!")
}

fun myFunction(fname: String) {
    println(fname + " Doe")
}

fun myFunction(fname: String, age: Int) {
    println(fname + " is " + age)
}

fun myFunction(x: Int): Int {
    return (x + 5)
}

fun myFunction(x: Int, y: Int): Int {
    return (x + y)
}

fun myFunction1(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    myFunction() // Call myFunction
    myFunction()
    myFunction()

    myFunction("John")
    myFunction("Jane")
    myFunction("George")

    myFunction("John", 35)
    myFunction("Jane", 32)
    myFunction("George", 15)

    var result = myFunction(3)
    println(result)

    var results = myFunction(3, 5)
    println(results)

    var hasil = myFunction1(3, 5)
    println(hasil)
}