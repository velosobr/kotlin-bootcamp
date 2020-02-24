fun getGretting(anyWrd: String) = "Hello $anyWrd"

fun sayHello(anyWrd: String) {
    println(getGretting(anyWrd))
}

fun main() {

    sayHello("World")
}