package com.bprojects.courses.kotlin.block1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import com.bprojects.courses.kotlin.block1.Lesson4CompanionObjects.MyClassWithCompanionObject
/**
 * @author ebasanez
 * @since 2022-03-31
 */
internal class Lesson4CompanionObjectsTest {

    @Test
    fun companionObjectConstructorGeneratesInstance() {

        val myInstance = MyClassWithCompanionObject.ofMale("name",10)
        assertEquals("name", myInstance.name)
        assertEquals(10, myInstance.age)
        assertEquals("male", myInstance.gender)

    }

}