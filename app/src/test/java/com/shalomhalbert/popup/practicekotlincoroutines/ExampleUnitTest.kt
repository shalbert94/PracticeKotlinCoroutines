package com.shalomhalbert.popup.practicekotlincoroutines

import kotlinx.coroutines.experimental.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    suspend fun suspendedFun(): Int = 0
    fun hello(): Int = 0

    @Test
    fun `Can test suspended fun`() = runBlocking {
        val result = suspendedFun()
        assertEquals(result, 0)
    }
}
