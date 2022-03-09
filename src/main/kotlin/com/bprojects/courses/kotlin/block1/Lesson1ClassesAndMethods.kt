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

    // Abbreviated method declaration formula
    fun methodInlined() = "Welcome to kotlin skeleton (inline)!!!"

    // Method return types are automatically identified by Kotlin compiler, but can be explicitly declared
    fun methodReturningString(): String {
        return "StringValueToReturn"
    }

    // Data classes are classes with final fields auto-generated from a constructor method signature.
    data class MyDataClass(val name: String, val age: Int)

    fun usingDataClass() {
        // Unlike Java object instantiation does not require new word
        val dataClass = MyDataClass("myName", 18)
        val name = dataClass.name
        val age = dataClass.age
    }

    // Primary constructor can be declared as part of class header (final fields are generated to store arguments values)
    // Arguments can be public of private
    class MyClassWithPrimaryConstructor(private val arg1: Int, val arg2: String) {

        // Primary constructor argument value can be used on instance field declaration
        val arg3 = arg2.uppercase()

        fun main(args: Array<String>) {
            val instance = MyClassWithPrimaryConstructor(100, "myString")
            val arg1Value = instance.arg1
            val arg2Value = instance.arg2
            val arg3Value = instance.arg3
        }

    }

    // A clas can have multiple constructors and no primary constructor.
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
    class MyClassWithPrimaryAndSecondaryConstructors(arg1: Int, arg2: String) {

        constructor(i: Int) : this(i, "defaultString") {            /*...*/
        }

        constructor(s: String) : this(0, s) {
            /*...*/
        }

    }

    // If be do not want a class to be implemented, a private constructor can be declared
    class MyClassWithPrivateConstructor private constructor() {/*...*/ }

}


