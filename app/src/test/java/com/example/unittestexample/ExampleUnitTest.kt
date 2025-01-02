package com.example.unittestexample

import com.example.unittestexample.objects.TheThing
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class ExampleUnitTest {

    private val theThing = TheThing()

    @Before
    fun printTimestamp() {
        val currentTimestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        println("Test started at: $currentTimestamp")
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testTwo() {
        assertTrue(1 > 0)
    }

    @Test
    fun testMethodB() {
        val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
        val result = theThing.methodB(cars)
        assertNotEquals("BMW", result)
    }

    @Test
    fun testMultiplyXY() {
        val x = 3
        val y = 4
        val result = theThing.multiplyXY(x, y)
        // Verify the multiplication result
        assertEquals("Multiplication result should be 12", 12, result)
        // Verify the result is positive
        assertTrue("Result should be positive", result > 0)
    }
}
