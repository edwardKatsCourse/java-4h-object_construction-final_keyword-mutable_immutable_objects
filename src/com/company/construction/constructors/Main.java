package com.company.construction.constructors;

public class Main {

    public static void main(String[] args) {
        C c = new C();
    }
}

/**
 * this();
 * this.
 *
 * super();
 * super.
 */
class A extends Object {
    public A() {
        super();
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }
}

class C extends B {
    //new C();
    public C() {
        super();
        System.out.println("C");
    }
}
