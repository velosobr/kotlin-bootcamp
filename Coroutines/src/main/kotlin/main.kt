import javafx.application.Application.launch
import kotlinx.coroutines.*

fun main(args: Array<String>) {
    sampleLaunchGlobal()
}

fun sampleOfBlocking() = runBlocking {
    println("1")
    printDelayed("This is just the test Message")
    println("Teste3")
    printDelayed("This is the second suspend test")
}

fun sampleOfBlockingDispatcher() {
    runBlocking(Dispatchers.Default) {
        println("One - from thread ${Thread.currentThread().name}")
        printDelayed("Two - from thread ${Thread.currentThread().name}")
    }
    println("Three - from thread ${Thread.currentThread().name}")
}

fun sampleLaunchGlobal() = runBlocking() {
    println("One - from thread ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Two - from thread ${Thread.currentThread().name}")
    }

    printDelayed("Three - from thread ${Thread.currentThread().name}")
}


suspend fun printDelayed(message: String) {
    delay(3000L)

    println(message)

}

//fun exampleLaunchGlobal()