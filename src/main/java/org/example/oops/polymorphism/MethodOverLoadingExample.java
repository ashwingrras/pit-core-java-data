package org.example.oops.polymorphism;

/*
    method overloading: same name different parameter/argument

 */

public class MethodOverLoadingExample
{
    public static void main(String[] args)
    {
        System.out.println("at MethodOverLoadingExample");
        sum("1", "1.5");
    }

    public static  int sum(int a, int b)
    {
        return a + b;
    }

    public static  float sum(int a, float b)
    {
        return a + b;
    }

    public static  int sum(float a, float b)
    {
        return (int) (a + b);
    }

    public static  double sum(double a, double b)
    {
        return a + b;
    }


    public static  double sum(String a, String b)
    {

        return Double.parseDouble(a) + Double.parseDouble(b);
    }

}
