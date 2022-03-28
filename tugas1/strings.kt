fun main(args: Array<String>) {
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)

    println(txt.toUpperCase())   // Outputs "HELLO WORLD"
    println(txt.toLowerCase())   // Outputs "hello world"

    var txt3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txt3.length);

    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    var txt4 = "Please locate where 'locate' occurs!"
    println(txt4.indexOf("locate"))  // Outputs 7

    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    println(firstName.plus(lastName))
    println("My name is $firstName $lastName")
}