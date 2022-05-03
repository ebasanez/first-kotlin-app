package com.bprojects.courses.kotlin.block1

/**
 * @author ebasanez
 * @since 2022-03-09
 */
class Lesson3Interfaces {

    // Interfaces are declared in a similar way to Java:
    interface MyInterface {

        // Interfaces can have properties (mutable or final)
        val myAbstractField: String

        // Interface properties can be initialized by defining an accessor method
        val myConcreteField: String
            // This can be replaced by inline formula: get() = "myStringValue"
            get() {return "myStringValue"}

        fun myAbstractMethod()

        // Default methods can be declared by just adding a body to the method declaration
        fun myConcreteMethod() {
            println("This is a method implemented in the interface")
        }
        // Default methods can be public or private
        private fun myPrivateConcreteMethod() {
            println("This is a private method implemented in the interface")
        }
    }

    // Interfaces implementation syntax is similar to class extension
    class MyClass: MyInterface {

        // To implement interface properties and methods, override keyword must be added

        override val myAbstractField = "fieldValue"

        override fun myAbstractMethod() {
            /*...*/
            myConcreteMethod()
        }

    }

    // An interface can be extended by another interface, that can implement any of its properties or methods, an add new ones
    interface MyChildInterface: MyInterface {

        override val myAbstractField: String
            get() = "myValueDefinedByChildInterface"

        override fun myAbstractMethod() {
            println("This method implements parent interface abstract method")
        }

        fun anotherAbstractMethod()

        /*...*/

    }

    // To solve conflict due to multiple interfaces inheritance with default methods, interface to be used must be explicitly named:
    interface A {
        fun foo() { print("A") }
        fun bar()
    }

    interface B {
        fun foo() { print("B") }
        fun bar() { print("bar") }
    }
    class C : A, B {
        // This implementation invokes both interfaces default implementations (but is not mandatory)
        override fun foo() {
            super<A>.foo()
            super<B>.foo()
            /*...*/
        }

        // This method declaration is necessary to implement interface A, but not B
        override fun bar() {
            // In this method implementation, we do not invoke interface B default method, so it will not be used in this class at all (but can be invoked in any other point of this class by explicitly invoking it: super<b>.bar())
            /*...*/
        }
    }

}