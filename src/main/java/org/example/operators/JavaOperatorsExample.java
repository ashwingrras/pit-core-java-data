package org.example.operators;

/*
    operators;
    1. Arithematic: +, -, *, %, /
    2. Increment / Decrement: ++, -- ( prefix and postfix)
    3. Relational: ==, <, > <=, >=
    4. Assignment: +=, -=, *=, /=, %=
    5. Logical: &&, ||
    6. Bitwise ( shift operator), &, |, left shift, right shift, unsigned right shift
    7. Ternary: ? :

 */

public class JavaOperatorsExample
{
    public static void main(String[] args)
    {
        System.out.println(" at Java Operator Example");
        //arithmaticOperator();
        //incrementDecrementOperator();
        //bitwiseOperatorExample();
        logicalOperator();
    }

    public static void arithmaticOperator()
    {
        int a = 10;
        int b = 5;
        int c = a + b * a / (b + a);
        //  50 / 15 = 3
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("c = "+c);

    }

    public static void incrementDecrementOperator()
    {
        int a = 10;
        //a++;
        a = a++;
        a = a++;
        a = a++;
        a = a++;
        a = a++;
        a = a++;
        a = a++;
        int b = a++;
        System.out.println(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println("with ++i");
        for(int i =0; i < 5; ++i)
        {
            System.out.println(i);
        }
        System.out.println("with i++");
        for(int i =0; i < 5; i++)
        {
            System.out.println(i);
        }
    }

    public  static void  logicalOperator()
    {
        // &&, ||
        int a = 10;
        int b = 5;
        // f
        if(a != b && a == b || a > b && a < b)
        {
            System.out.println("inside if");
        }
        else
        {
            System.out.println("inside else");
        }
    }

    public static void bitwiseOperatorExample()
    {
        int a = 10;
        int b = 5;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(a | b);
        System.out.println(Integer.toBinaryString(15));
    }

}
