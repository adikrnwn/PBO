fun main(args: Array<String>) {
//    val t1 = MathTeacher(25, "Jack")
//    t1.teachMaths()
//    println()
//    val f1 = Footballer(29, "Christiano")
//    f1.playFootball()
//
//    // second example
//    val f1 = Footballer(29, "Cristiano", "LA Galaxy")
//
//    // using super keyword
//    val p1 = AuthLog("Bad Password")
//
//    // overriding member function
//    val girl = Girl()
//    girl.age = 31
//    println("My fake age is ${girl.age}.")

    // Calling Members of Base Class from Derived Class
    val girl = Girl()
    girl.displayAge(31)
}


//// inheritance
//open class Person(age: Int, name: String) {
//    init {
//        println("My name is $name.")
//        println("My age is $age")
//    }
//}
//class MathTeacher(age: Int, name: String): Person(age, name) {
//
//    fun teachMaths() {
//        println("I teach in primary school.")
//    }
//}
//class Footballer(age: Int, name: String): Person(age, name) {
//    fun playFootball() {
//        println("I play for LA Galaxy.")
//    }
//}
//
//// second example
//open class Person(age: Int, name: String) {
//    // some code
//}
//class Footballer(age: Int, name: String, club: String): Person(age, name) {
//    init {
//        println("Football player $name of age $age and plays for $club.")
//    }
//
//    fun playFootball() {
//        println("I am playing football.")
//    }
//}
//
//// using super keyword
//open class Log {
//    var data: String = ""
//    var numberOfData = 0
//    constructor(_data: String) {
//
//    }
//    constructor(_data: String, _numberOfData: Int) {
//        data = _data
//        numberOfData = _numberOfData
//        println("$data: $numberOfData times")
//    }
//}
//class AuthLog: Log {
//    constructor(_data: String): this("From AuthLog -> + $_data", 10) {
//    }
//
//    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
//    }
//}
//
//// overriding member function
//open class Person() {
//    open var age: Int = 0
//        get() = field
//
//        set(value) {
//            field = value
//        }
//}
//class Girl: Person() {
//
//    override var age: Int = 0
//        get() = field
//
//        set(value) {
//            field = value - 5
//        }
//}

// Calling Members of Base Class from Derived Class
open class Person() {
    open fun displayAge(age: Int) {
        println("My actual age is $age.")
    }
}
class Girl: Person() {
    override fun displayAge(age: Int) {
        // calling function of base class
        super.displayAge(age)
        println("My fake age is ${age - 5}.")
    }
}
