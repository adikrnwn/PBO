class Car(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive() {
        println("Wrooom!")
    }

    // Class function with parameters
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)

    // print model
    println(c1.model)
    // Call the function
    c1.drive()
    c1.speed(200)
}