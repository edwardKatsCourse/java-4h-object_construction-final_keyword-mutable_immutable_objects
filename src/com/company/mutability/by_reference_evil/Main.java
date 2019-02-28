package com.company.mutability.by_reference_evil;

public class Main {

    /**
     * Immutable classes:
     * String
     * All Wrapping Types (Integer, Double, Short ... )
     */
    public static void main(String[] args) {
        Person person = new Person(); //10B
        person.name = "John Smith";

        int age = 30; //4B

        System.out.println("Name before");
        System.out.println(person.name);

        System.out.println();
        System.out.println("Age before");
        System.out.println(age);
        System.out.println();

        method(person, age);


        System.out.println("Name after");
        System.out.println(person.name);
        System.out.println();

        System.out.println("Age after");
        System.out.println(age);

    }

    private static void method(Person person, int age) {
        //int +4B
        //person - nothing
        person.name = "Stolen";
        age = 100;
    }
}


class Person {
    String name;
}
