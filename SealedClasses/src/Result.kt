sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    sealed class Error(val exception: Exception) : Result<Nothing>(){
        class RecoverableError(exception: Exception) : kotlin.Error(exception)
        class NonRecoverableError(exception: Exception): kotlin.Error(exception)
    }
    object InProgress : Result<Nothing>()
}

fun handleResult(result: Result<Int>) {
    val action = when (result) {
        is Result.Success -> {

        }
        is Result.Error -> {

        }
        InProgress -> TODO()
        Result.InProgress -> TODO()
    }.exhaustive
}