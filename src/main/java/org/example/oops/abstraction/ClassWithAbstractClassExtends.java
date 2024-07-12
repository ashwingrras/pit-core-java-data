package org.example.oops.abstraction;

public class ClassWithAbstractClassExtends extends AbstractClassExample implements InterfaceExample
{

    @Override
    public int sumOne(int a, int b)
    {
        return a + b;
    }

    @Override
    public int multiply(int a, int b)
    {
        System.out.println("at ClassWithAbstractClassExtends multiply method");
        return a * b;
    }


    public int divide(int a, int b)
    {
        return a / b;
    }

}
