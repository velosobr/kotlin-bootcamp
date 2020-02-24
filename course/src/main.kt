fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {

val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
val arrayOfNames= arrayOf("Lino","Karla","Duda","Maria")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
    //using "it"
    println("using \"it\"")
    arrayOfNames.forEach {
        println(it)
    }
//    Using a convencional way
    println("Using a convencional way")
    arrayOfNames.forEach { name -> println(name) }

}