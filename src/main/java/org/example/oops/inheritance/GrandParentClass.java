package org.example.oops.inheritance;

public class GrandParentClass
{
    GrandParentClass(String name)
    {
        System.out.println(" at GrandParentClass constructor, name "+name);
    }

    public int modulus(int a, int b)
    {
        System.out.println(" at GrandParentClass modulus method");
        return a % b;
    }
}
