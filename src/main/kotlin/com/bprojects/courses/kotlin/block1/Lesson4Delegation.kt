package com.bprojects.courses.kotlin.block1

/**
 * @author ebasanez
 * @since 2022-03-09
 * @see <a href="https://en.wikipedia.org/wiki/Delegation_pattern">Delegation pattern</a>
 */
// Kotlin has a potent feature: automatic delegate class generation {@link }
class Lesson4Delegation {

    interface MyInterface {
        fun myMethod(): String
    }

    class MyDelegatedClass : MyInterface {
        override fun myMethod() = "This is myMethod implementation in class MyDelegatedClass"

    }

    // To delegate, it must be passed as argument in delegating class primary constructor
    // By using the keyword by when declaring inheritance of an interface, Kotlin compiler automatically generates necessary methods and field accessors that will delegate on primary constructor delegated instance
    class MyDelegatingByInterfaceClass(i: MyInterface) : MyInterface by i {
        /*...*/
    }

    // Delegation can be done by class also
    class MyDelegatingByClassClass(i: MyDelegatedClass) : MyInterface by i {
        /*...*/
    }

    // A class can delegate multiple interfaces

    interface MyAnotherInterface {
        fun myAnotherMethod(): String
    }

    class MyAnotherDelegatedClass : MyAnotherInterface {
        override fun myAnotherMethod() = "This is myAnotherMethod implementation in class MyAnotherDelegatedClass"
    }

    class MyMultipleInterfaceDelegationClass(i: MyInterface, i2: MyAnotherInterface) : MyInterface by i, MyAnotherInterface by i2 {
        /*...*/
    }

}