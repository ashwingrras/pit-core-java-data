package org.example.oops.abstraction;

public class ClassOne implements Interface1, Interface2
{

    @Override
    public int divide(int a, int b) {
        return Interface1.super.divide(a, b);
    }


}
