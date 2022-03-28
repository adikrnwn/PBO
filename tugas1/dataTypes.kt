val myNum: Int = 5                // Int
val myDoubleNum: Double = 5.99    // Double
val myLetter: Char = 'D'          // Char
val myBoolean: Boolean = true     // Boolean
val myText: String = "Hello"      // String

fun main(args: Array<String>) {
    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)

    // byte
    val myNum: Byte = 100
    println(myNum)

    // short
    val myNum2: Short = 5000
    println(myNum2)

    // long
    val myNum3: Long = 15000000000L
    println(myNum3)

    // float
    val myNum4: Float = 5.75F
    println(myNum4)

    // double
    val myNum5: Double = 19.99
    println(myNum5)

    // scientific numbers
    val myNumb1: Float = 35E3F
    val myNumb2: Double = 12E4
    println(myNumb1)
    println(myNumb2)

    // boolean
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    // characters
    val myGrade: Char = 'B'
    println(myGrade)

    // strings
    val myText: String = "Hello World"
    println(myText)

    // type conversion
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
}