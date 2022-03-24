// Superclass
open class MyParentClass {
    val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x) // x is now inherited from the superclass
    }
}

fun main(args: Array<String>) {
    val myObj = MyChildClass()
    myObj.myFunction()
}