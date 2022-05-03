package com.bprojects.courses.kotlin.block1

/**
 * @author ebasanez
 * @since 2022-03-09
 */
class Lesson1ClassesAndMethods {

    // Methods are public by default. Class variables are private by default

    // Main method need not be static or have String[] argument
    fun main() {
        println("This is the main method of this class")
    }

    // Methods can be declared as usual java methods
    fun methodWithBody(): String {
        return "Welcome to kotlin skeleton!!!"
    }

    // Abbreviated method declaration formula, with return type identified by Kotlin compiler.
    fun methodInlined() = "Welcome to kotlin skeleton (inline)!!!"

    // Constructors

    // Primary constructor can be declared as part of class header (final fields are generated to store arguments values)
    // Arguments can be public of private
    class MyClassWithPrimaryConstructor(private val arg1: Int, val arg2: String) {

        // Primary constructor argument value can be used on instance field declaration
        val arg3 = arg2.uppercase()

        fun isArgs1GreaterThanZero() = arg1 > 0
    }

    // A class can have multiple constructors and no primary constructor.
    // In this case, no field is automatically generated
    class MyClassWithMultipleConstructors {

        constructor(i: Int) {
            /*...*/
        }

        constructor(i: Int, j: String) {
            /*...*/
        }
    }

    // A class can have both a primary constructor and secondary constructors.
    // In that case, all secondary constructors must delegate (invoke) the primary constructor, as primary constructor fields must be initialized
    class MyClassWithPrimaryAndSecondaryConstructors(var arg1: Int, var arg2: String) {

        constructor(i: Int) : this(i, "defaultString") {
            /*...*/
        }

        constructor(s: String) : this(0, s) {
            /*...*/
        }

    }

    // If be do not want a class not to be implemented, a private constructor can be declared
    class MyClassWithPrivateConstructor private constructor() {/*...*/ }

}

// A data class is a class with final fields auto-generated from a constructor method signature.
// In addition, class equals and hashCode are based on fields, and provide copy() method.
data class MyDataClass(val name: String, val age: Int)



