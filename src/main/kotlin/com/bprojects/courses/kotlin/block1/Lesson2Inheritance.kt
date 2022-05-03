package com.bprojects.courses.kotlin.block1

/**
 * @author ebasanez
 * @since 2022-03-09
 */
// To encourage composition over inheritance, all classes are final by default
class Lesson2Inheritance {

    // To declare a class as non-final, open modifier must be added
    open class MyOpenClassWithNoConstructor {/*...*/ }

    open class MyOpenClassWithPrimaryConstructor(private val i: Int) {/*...*/ }

    // Class extension declaration depends on the constructors of the parent class:

    // If class has a primary constructor (it has only one constructor, considering the no-args constructor as a primary constructor,
    // its usage must be specified in the extension declaration
    class MyChildClassWithNoConstructor() : MyOpenClassWithNoConstructor() {
        // Child class can declare secondary constructors, that must call primary constructor (of child class)
        constructor (i: Int) : this() {
            /*...*/
        }
        /*...*/
    }

    // Child class can modify primary constructor arguments visibility and mutability (thus modifying auto-generated class fields declaration)
    class MyChildClassWithPrimaryConstructor(var arg: Int) : MyOpenClassWithPrimaryConstructor(arg) {
        // Child class can declare secondary constructors, that must call primary constructor (of child class)
        constructor(arg1: Int, arg2: Int) : this(arg1) {
            /*...*/
        }
        /*...*/
    }

}