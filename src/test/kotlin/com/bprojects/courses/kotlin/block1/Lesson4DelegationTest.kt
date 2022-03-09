package com.bprojects.courses.kotlin.block1

import com.bprojects.courses.kotlin.block1.Lesson4Delegation.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * @author ebasanez
 * @since 2022-03-09
 */
internal class Lesson4DelegationTest {

    @Test
    fun delegatesByInterface(){
        // Arrange
        val delegatedClass = MyDelegatedClass()
        val delegatingClass = MyDelegatingByInterfaceClass(delegatedClass)
        // Act
        val result = delegatingClass.myMethod()
        // Assert
        val expectedValue = delegatedClass.myMethod()
        assertEquals(expectedValue, result)
    }

    @Test
    fun delegatesByClass(){
        // Arrange
        val delegatedClass = MyDelegatedClass()
        val delegatingClass = MyDelegatingByClassClass(delegatedClass)
        // Act
        val result = delegatingClass.myMethod()
        // Assert
        val expectedValue = delegatedClass.myMethod()
        assertEquals(expectedValue, result)
    }

    @Test
    fun delegatesMultipleInterfaces(){
        // Arrange
        val delegatedClass = MyDelegatedClass()
        val anotherDelegatedClass = MyAnotherDelegatedClass()
        val delegatingClass = MyMultipleInterfaceDelegationClass(delegatedClass, anotherDelegatedClass)
        // Act
        val result1 = delegatingClass.myMethod()
        val result2 = delegatingClass.myAnotherMethod()
        // Assert
        val expectedValue1 = delegatedClass.myMethod()
        val expectedValue2 = anotherDelegatedClass.myAnotherMethod()
        assertEquals(expectedValue1, result1)
        assertEquals(expectedValue2, result2)
    }

}
