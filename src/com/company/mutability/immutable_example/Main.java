package com.company.mutability.immutable_example;


/**
 * final keyword
 *
 * 1. final class A {}
 * Unable to extends form such class
 *
 * 2. class A {
 *     final String name;
 * }
 *
 * Field MUST be initialized with value AND only once
 * Compiler checks that we INDEED initialize such field
 * Reference on such field cannot be changed EVER
 *
 * 3. public final void method() {
 *    }
 *
 * Unable to override such method
 *
 * 4. Method parameters
 *
 * public void method(final Person name)
 */

public class Main {

    public static void main(String[] args) {
        Person person = new Person("ABC");
//        person.name = "ABC";

        method(person);
        System.out.println(person.name);
    }

    private static void method(final Person person) {
//        person.name = "stolen";
    }
}

//class A {
//    public final void method() {
//    }
//}
//
//class B extends A {
//}

final class Person {
    final String name;

    public Person(String name) {
        this.name = name;
//        this.name = new String();

//        this.name = "abc";
//        this.name = this.name.toUpperCase();
    }
}






final class MyString {

    protected String name;

    public MyString(String name) {
        this.name = name;
    }

    public MyString toUpperCase() {
        return new MyString(this.name.toUpperCase());
    }
}