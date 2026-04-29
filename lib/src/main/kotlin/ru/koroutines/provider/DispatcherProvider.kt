package ru.koroutines.provider

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Provides a centralized abstraction for obtaining [CoroutineDispatcher] instances.
 *
 * @author K
 */
interface DispatcherProvider {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}
