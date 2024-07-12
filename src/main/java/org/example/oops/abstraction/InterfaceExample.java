package org.example.oops.abstraction;

public interface InterfaceExample
{

    static void main(String[] argrs)
    {
        System.out.println("at InterfaceExample main method");
    }


    int sumOne(int a, int b);

    static int multiply(int a, int b)
    {
        return a * b;
    }

    default int divide(int a, int b)
    {
        return a / b;
    }

}
