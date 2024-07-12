package org.example.oops.inheritance;

public class ParentClass extends GrandParentClass
{


    ParentClass(String name)
    {
        super(name);
        System.out.println(" at ParentClass Constructor");
    }

    public int sum(int a, int b)
    {
        System.out.println(" at ParentClass sum method");
        return a + b;
    }

    public int multiply(int a, int b)
    {
        System.out.println(" at ParentClass multiply method");
        return a * b;
    }

}
