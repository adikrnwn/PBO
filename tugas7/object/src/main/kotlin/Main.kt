//object Test {
//    private var a: Int = 0
//    var b: Int = 1
//
//    fun makeMe12(): Int {
//        a = 12
//        return a
//    }
//}
//
//open class Person() {
//    fun eat() = println("Eating food.")
//
//    fun talk() = println("Talking with people.")
//
//    open fun pray() = println("Praying god.")
//}

open class Person(name: String, age: Int) {
    init {
        println("name: $name, age: $age")
    }
    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Praying god.")
}


fun main(args: Array<String>) {
//    // object declaration
//    val result: Int
//    result = Test.makeMe12()
//    println("b = ${Test.b}")
//    println("result = $result")
//
//    // object expression
//    val atheist = object : Person() {
//        override fun pray() = println("I don't pray. I am an atheist.")
//    }
//    atheist.eat()
//    atheist.talk()
//    atheist.pray()

    val atheist = object : Person("Jack", 29) {
        override fun pray() = println("I don't pray. I am an atheist.")
    }
    atheist.eat()
    atheist.talk()
    atheist.pray()
}