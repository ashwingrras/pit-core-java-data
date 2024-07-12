package org.example.oops;

/*
      constructor:
      1. default
      2. parameterized

 */

public class Parent
{

    /*{

        System.out.println("at Parent class block statement");
    }*/

    int id = 101;
    String name;

    /*{
        System.out.println("at Parent class block statement 1");
    }

    {

        System.out.println("at Parent class block statement 2");
    }*/

    Parent()
    {
        System.out.println(" at Parent Class constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
