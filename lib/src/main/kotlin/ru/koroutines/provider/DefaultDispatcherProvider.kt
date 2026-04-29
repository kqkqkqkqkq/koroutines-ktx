package ru.koroutines.provider

import kotlinx.coroutines.Dispatchers

/**
 * Default realization of [DispatcherProvider]
 *
 * @author K
 */
class DefaultDispatcherProvider : DispatcherProvider {
    override val main = Dispatchers.Main
    override val io = Dispatchers.IO
    override val default = Dispatchers.Default
    override val unconfined = Dispatchers.Unconfined
}
