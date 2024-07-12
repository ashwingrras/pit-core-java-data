package org.example.oops.inheritance;

public class hierarchical_InheritanceExample
{
    public static void main(String[] args) {

        B b = new B();

    }
}

class A
{
    String name = "ashwin";
}

class B extends A
{

    int age = 32;

}

class C extends A
{
    String designation = "software architect";
}
