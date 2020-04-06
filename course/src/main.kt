import java.util.*

fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {

    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    val arrayOfNames = mutableListOf("Lino", "Karla", "Duda", "Bubba", "Maria", "Bronx")

    sayHello("Hello", "Lino", "Karla", "Dud")


    /**
    arrayOfNames.add("Neymar")

    arrayOfNames.forEach { name ->
    println(name)
    }

    var aliens = TreeMap<String, Int>()

    aliens["Bubba"] = 123
    aliens["anotherPoke"] = 425

    aliens["Neiggi"] = 312

    for ((name, age) in aliens)
    println("The name is $name, and the age is $age")

    for (name in interestingThings)
    println("The name of one the interestings things is $name")

    var carros = TreeMap<Int, Carro>()

    var Lino = Motorista("Lino", 26)
    var Alexandre = Motorista("Alexandre", 21)
    var carro1 = Carro(4, Lino)
    var carro2 = Carro(3, Alexandre)

    carros[1] = carro1
    carros[2] = carro2

    var superCarros: Map<Int, Carro> = carros


    for ((chave, valor) in superCarros) {
    println("A chave do carro é essa: $chave e o carro é este: $valor. Já o nome do motorista é: $valor")
    }
     */
}

class Carro(var numeroPortas: Int, private var motorista: Motorista)

class Motorista(var nome: String, var idade: Int)