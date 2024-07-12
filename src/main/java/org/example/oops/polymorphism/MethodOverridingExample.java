package org.example.oops.polymorphism;

import javax.xml.crypto.Data;
import java.util.Date;

public class MethodOverridingExample
{
    public static void main(String[] args)
    {
        System.out.println("at MethodOverridingExample");
        A b = new B(); // dynamic dinding / upcasting
        //b.sum(4,5);
        //b.multiply(2,4);
    }
}

class A
{
    A()
    {
        System.out.println(" at class A");
        sum(3, 5);
    }

    public int sum(int a, int b)
    {
        System.out.println(" at class A sum method");
        return a + b;
    }

    public int multiply(int a, int b)
    {
        System.out.println(" at class A multiply method");
        return  a * b;
    }

}

class B extends A
{
    B()
    {
        System.out.println("at class B");
    }
    @Override
    public int sum(int a, int b)
    {
        System.out.println(" at class B sum method");
        return a + b;
    }

    public double sum(double a, double b)
    {
        System.out.println(" at class B sum method with double type argument");
        return a + b;
    }

    public int divide(int a, int b)
    {
        return a / b;
    }

}