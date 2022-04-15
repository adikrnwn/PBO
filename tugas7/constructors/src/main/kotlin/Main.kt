fun main(args: Array<String>) {
    // primary constructor
    val person1 = Person("Joe", 25)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")

    // primary constructor and initializer blocks
    val person1 = Person("joe", 25)

    // default value in primary constructor
    println("person1 is instantiated")
    val person1 = Person("joe", 25)
    println("person2 is instantiated")
    val person2 = Person("Jack")
    println("person3 is instantiated")
    val person3 = Person()

    // Secondary Constructor
    val p1 = AuthLog("Bad Password")
}
// primary constructor
class Person(val firstName: String, var age: Int) {
}

// primary constructor and initializer blocks
class Person(fName: String, personAge: Int) {
    val firstName: String
    var age: Int

    // initializer block
    init {
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}

class Person(fName: String, personAge: Int) {
    val firstName = fName.capitalize()
    var age = personAge

    // initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age")
    }
}

// default value in primary constructor
class Person(_firstName: String = "UNKNOWN", _age: Int = 0) {
    val firstName = _firstName.capitalize()
    var age = _age

    // initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age\n")
    }
}

// Secondary Constructor
open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}
class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10) {
    }

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
    }
}