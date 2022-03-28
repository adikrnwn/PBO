fun main(args: Array<String>) {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    // Outputs Volvo

    cars[0] = "Opel"
    println(cars[0])
    // Now outputs Opel instead of Volvo

    println(cars.size)
    // Outputs 4

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (x in cars) {
        println(x)
    }
}