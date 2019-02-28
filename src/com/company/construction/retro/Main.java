package com.company.construction.retro;

public class Main {

    /**
     * 1. Object construction
     * 2. Mutable-Immutable objects
     * 3. "final" keyword
     */

    public static void main(String[] args) {

        Person john = new Person("John", "Smith");

        Person sarah = new Person("Sarah", "Smith");

//        Person jack = new Person();

        System.out.println(john.toString());
        System.out.println(sarah.toString());
    }
}

class Person {
    /**
     * Each class MAY have
     *
     * Fields - (global | class variables)
     * Methods
     *
     * Each class HAS constructors
     */

    String firstName;
    String lastName;


    //default constructor
//    Person() {
//    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "First name " + firstName + ", Last name " + lastName;
    }

}
