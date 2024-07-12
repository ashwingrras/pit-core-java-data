package org.example.oops;

/*
    1. class
    2. object
    3. constructor
    4. inheritance
    5. abstraction
    6. polymorphism
    7. encapsulation
    8. aggregation : has a relation


 */

public class OOPS_Example
{


    public static void main(String[] args)
    {
        String name = "ashwin";
        String name2 = new String("ashwin");
        name2.intern();
        int a = 10;
        System.out.println(" at OOPS Example");
        Parent parent = new Parent();
        parent.setId(1001);
        parent.setName("devashish");
        System.out.println(parent.name);
        Student student = new Student(201, "rohit");
        System.out.println(student.name);
        Student student1 = new Student(202, "raman");
        System.out.println(student1.name);
    }

    {
        System.out.println(" at OOPS_Example block statement");
    }
}
