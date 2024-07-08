package org.example.java_overview;

/*
    java overview
    1. keywords: 51 approx
    2. access modifier: public, private, protected and default
        public: allow outside with different package
        private: allow only same class
        default: allow only same package
        protected: allow only same package and on sublcass also
    3. data types:
        primitive:
        int, float, double, char, boolean, byte,
        non-primitive:
        String,
        Array,
        Object
    4. variable: local, instance and static
    5. methods: normal, static

 */

import java.util.*;

public class FirstExample {

    public int a = 10; // instance variable
    protected static int b = 6; // static variable
    int no = 16;
    String continues = "10";
    public static void main(String[] args)
    {
        System.out.println(" at First Example ");
        FirstExample firstExample = new FirstExample();
        int a = 10; // local variable
        System.out.println(b);
        float b = 10.0f; // local variable
        System.out.println(FirstExample.b);
        double c = 10.09;
        byte d = 20;
        System.out.println(Integer.toBinaryString(d));
        firstExample.sum(10, 5);
        subtrack(10, 5);
    }

    public int sum(int a, int b)
    {
        System.out.println(no);
        System.out.println(b);
        subtrack(10, 7);
        main();
        return a + b;
    }

    public static int subtrack(int a, int b)
    {
        return a - b;
    }

    public static void main()
    {
        subtrack(19,7);
        new FirstExample().sum(16,8);
        System.out.println(" at First Example without params ");
    }

    public static void main(int a)
    {
        subtrack(19,7);
        new FirstExample().sum(16,8);
        System.out.println(" at First Example without params ");
    }
}
