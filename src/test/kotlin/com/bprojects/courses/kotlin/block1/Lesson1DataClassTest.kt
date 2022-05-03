package com.bprojects.courses.kotlin.block1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * @author ebasanez
 * @since 2022-03-31
 */
internal class Lesson1DataClassTest {

    @Test
    fun dataClassConstructorFillsFields() {
        val myDataClass = MyDataClass("name", 10)
        assertEquals("name", myDataClass.name)
        assertEquals(10, myDataClass.age)
    }

    @Test
    fun dataClassesWithSameFieldValuesAreEqual() {
        val myDataClass1 = MyDataClass("name", 10)
        val myDataClass2 = MyDataClass("name", 10)
        assertTrue(myDataClass1 == myDataClass2)
    }

    @Test
    fun dataClassCopy() {
        val myDataClass1 = MyDataClass("name", 10)
        val myDataClass2 = myDataClass1.copy()
        assertTrue(myDataClass1 == myDataClass2)
    }

}