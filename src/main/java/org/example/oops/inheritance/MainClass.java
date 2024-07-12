package org.example.oops.inheritance;

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(" at main class");
        ParentClass parentClass = new ParentClass("test parent user");
        parentClass.multiply(3, 5);
        ChildrenClass childrenClass = new ChildrenClass("test child user");
        /*childrenClass.divide(10,2);
        childrenClass.multiply(2,4);*/
    }
}
