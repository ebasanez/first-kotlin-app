package com.bprojects.courses.kotlin.block1

import com.bprojects.courses.kotlin.block1.Lesson2Inheritance.MyChildClassWithNoConstructor
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * @author ebasanez
 * @since 2022-05-03
 */
internal class Lesson2InheritanceTest {

    @Test
    fun childClassWithNoConstructor_usingPrimaryConstructorTest() {
        // Act
        val instance = MyChildClassWithNoConstructor()
        // Assert
        assertNotNull(instance)
    }

    @Test
    fun childClassWithNoConstructor_usingArgConstructorTest() {
        // Act
        val instance = MyChildClassWithNoConstructor(1)
        // Assert
        assertNotNull(instance)
    }

    @Test
    fun childClassWithPrimaryConstructor_usingPrimaryConstructorTest() {
        // Act
        val instance = Lesson2Inheritance.MyChildClassWithPrimaryConstructor(1)
        // Assert
        assertNotNull(instance)
        assertEquals(1, instance.arg)
    }

    @Test
    fun childClassWithPrimaryConstructor_usingSecondaryConstructorTest() {
        // Act
        val instance = Lesson2Inheritance.MyChildClassWithPrimaryConstructor(1, 2)
        // Assert
        assertNotNull(instance)
        assertEquals(1, instance.arg)
    }

}