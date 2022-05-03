package com.bprojects.courses.kotlin.block1

import com.bprojects.courses.kotlin.block1.Lesson1ClassesAndMethods.MyClassWithPrimaryAndSecondaryConstructors
import com.bprojects.courses.kotlin.block1.Lesson1ClassesAndMethods.MyClassWithPrimaryConstructor
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * @author ebasanez
 * @since 2022-05-03
 */
class Lesson1ConstructorsTest {

    @Test
    fun primaryConstructorTest() {
        // Act
        val instance = MyClassWithPrimaryConstructor(100, "myString")
        // Assert
        assertEquals("myString", instance.arg2)
        assertEquals("MYSTRING", instance.arg3)
        assertTrue(instance.isArgs1GreaterThanZero())
    }

    @Test
    fun primaryAndSecondaryConstructorsTest() {
        // Act
        val instance = MyClassWithPrimaryAndSecondaryConstructors("myString")
        // Assert
        assertEquals(0, instance.arg1)
        assertEquals("myString", instance.arg2)
    }

    @Test
    fun primaryAndSecondaryConstructorsTest2() {
        // Act
        val instance = MyClassWithPrimaryAndSecondaryConstructors(10)
        // Assert
        assertEquals(10, instance.arg1)
        assertEquals("defaultString", instance.arg2)
    }

}