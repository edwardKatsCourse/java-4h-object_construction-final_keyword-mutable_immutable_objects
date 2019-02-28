package com.company.construction.visibility_zones;

public class Main {
    public static void main(String[] args) {
        A a = new C();
        a.z(); //C.z
    }
}
//A a = new C()
//Only A class methods
class A {
    void z() {System.out.println("A.z");}
}

//B b = new C();
//Only B and A methods
class B extends A {
    @Override
    void z() {System.out.println("B.z");}
    void b() { System.out.println("B.b"); }
}
class C extends B {
    void c() { System.out.println("C.c"); }
}
