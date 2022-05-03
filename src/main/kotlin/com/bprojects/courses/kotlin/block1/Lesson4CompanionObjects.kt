package com.bprojects.courses.kotlin.block1

/**
 * @author ebasanez
 * @since 2022-03-31
 */
class Lesson4CompanionObjects {

    // Companion objects is the tool Kotlin provides to add "static" methods to classes

    class MyClassWithCompanionObject(val name: String, val age: Int, val gender: String) {

        companion object {

            // Here we are using the companion object to generate some static constructors

            fun ofMale(name: String, age: Int): MyClassWithCompanionObject {
                return MyClassWithCompanionObject(name, age, "male")
            }

            fun ofFemale(name: String, age: Int): MyClassWithCompanionObject {
                return MyClassWithCompanionObject(name, age, "female")
            }
        }

    }
}
