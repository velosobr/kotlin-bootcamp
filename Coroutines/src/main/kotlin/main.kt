import javafx.application.Application.launch
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val list = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90)
    runBlocking {
        val time = measureTimeMillis {
            list.map { value ->
                async {
                    delay(2000L)
                    println("processing value $value")
                    value
                }
            }.awaitAll()
        }
        println("Processed in $time ms")
    }


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