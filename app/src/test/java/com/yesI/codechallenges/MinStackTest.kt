package com.yesI.codechallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class MinStackTest {

    @Test
    fun addingItemsToStack() {
        val testObj = MinStack()
        testObj.push(1)
        assertEquals(testObj.min, 1)
    }
}