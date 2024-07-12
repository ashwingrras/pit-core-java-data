package org.example.oops.inheritance;

public class ChildrenClass extends ParentClass
{
    ChildrenClass(String name)
    {
        super(name);
        System.out.println(" at ChildrenClass Constructor");
        System.out.println(sum(5, 5)); // local method
        System.out.println(super.sum(5, 5)); // parent method
        System.out.println(multiply(5, 5));
        //new GrandParentClass("").sum(1, 3);
        ((GrandParentClass)this).modulus(2, 4); // grandparent class method
    }

    public int sum(int a, int b)
    {
        System.out.println(" at ChildrenClass sum method");
        return a + b;
    }

    public int divide(int a, int b)
    {
        System.out.println(" at ChildrenClass divide method");
        return a / b;
    }

}
