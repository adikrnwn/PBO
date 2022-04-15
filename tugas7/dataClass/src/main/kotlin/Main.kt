//data class User(val name: String, val age: Int)

data class User(val name: String, val age: Int, val gender: String)

fun main(args: Array<String>) {
//    val jack = User("jack", 29)
//    println("name = ${jack.name}")
//    println("age = ${jack.age}")
//
//    // copying
//    val u1 = User("John", 29)
//    // using copy function to create an object
//    val u2 = u1.copy(name = "Randy")
//    println("u1: name = ${u1.name}, name = ${u1.age}")
//    println("u2: name = ${u2.name}, name = ${u2.age}")

//    // toString()
//    val u1 = User("John", 29)
//    println(u1.toString())

//    // hashCode() and equals()
//    val u1 = User("John", 29)
//    val u2 = u1.copy()
//    val u3 = u1.copy(name = "Amanda")
//    println("u1 hashcode = ${u1.hashCode()}")
//    println("u2 hashcode = ${u2.hashCode()}")
//    println("u3 hashcode = ${u3.hashCode()}")
//    if (u1.equals(u2) == true)
//        println("u1 is equal to u2.")
//    else
//        println("u1 is not equal to u2.")
//    if (u1.equals(u3) == true)
//        println("u1 is equal to u3.")
//    else
//        println("u1 is not equal to u3.")

//    // destructing declaration
//    val u1 = User("John", 29, "Male")
//    val (name, age, gender) = u1
//    println("name = $name")
//    println("age = $age")
//    println("gender = $gender")

    // destructing declaration
    val u1 = User("John", 29, "Male")
    println(u1.component1())     // John
    println(u1.component2())     // 29
    println(u1.component3())     // "Male"
}