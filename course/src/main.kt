import java.util.*

fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {

val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
val arrayOfNames= mutableListOf("Lino","Karla","Duda","Bubba","Maria","Bronx")
    arrayOfNames.add("Neymar")

    arrayOfNames.forEach { name ->
        println(name)
    }

    var aliens = TreeMap<String, Int>()

    aliens["Bubba"] = 123

    aliens["Neiggi"] = 312

    for ((name, age) in aliens)
        println("The name is $name, and the age is $age")

}