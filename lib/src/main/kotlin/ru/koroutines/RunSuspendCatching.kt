package ru.koroutines

import kotlin.coroutines.cancellation.CancellationException

/**
 * Use this function instead of [runCatching] when working with coroutines to ensure
 * that cancellation signals are properly propagated while still safely handling
 * other types of exceptions.
 * @author K
 * @see Result
 * @see runCatching
 * @see CancellationException
 */
inline fun <R> runSuspendCatching(block: () -> R): Result<R> {
    return try {
        Result.success(block())
    } catch (e: CancellationException) {
        throw e
    } catch (e: Throwable) {
        Result.failure(e)
    }
}
