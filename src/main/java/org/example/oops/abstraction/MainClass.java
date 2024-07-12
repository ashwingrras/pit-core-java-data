package org.example.oops.abstraction;

/*
    Abstraction: hiding method body
    1. abstract class
    2. interface
 */
public class MainClass
{
    public static void main(String[] args)
    {

        AbstractClassExample abstractClassExample = new ClassWithAbstractClassExtends();
        abstractClassExample.multiply(4, 5);
        abstractClassExample.sum(1, 4);

        InterfaceExample interfaceExample = new ClassWithAbstractClassExtends();
        interfaceExample.sumOne(2, 4);


    }
}
