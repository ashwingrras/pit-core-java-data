package org.example.operators;

/*
    operators;
    1. Arithmatic: +, -, *, %, /
    2. Increment / Decrement: ++, -- ( prefix and postfix)
    3. Relational: ==, <, > <=, >=
    4. Assignment: +=, -=, *=, /=, %=
    5. Logical: &&, ||
    6. Bitwise ( shift operator), &, |, left shift, right shift, unsigned right shift
    7. Ternary: ? :

 */

public class JavaOperatorsExample
{
    String name;
    int c;
    static int d;
    public static void main(String[] args)
    {
        System.out.println(" at Java Operator Example");
        //arithmaticOperator();
        //incrementDecrementOperator();
        //bitwiseOperatorExample();
        //logicalOperator();
        //bitwiseOperatorExample();
        //assignmentOperator();
        ternaryOperator();
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
        /*
                    logical And &&
              condition 1   condition 2   result
                true         true          true
                t            f             false
                f            t             false
                f            f             false

                logical OR ||
              condition 1   condition 2   result
                true         true          true
                t            f             true
                f            t             true
                f            f             false
         */


        // &&, ||
        int a = 10;
        int b = 5;
        // true  || false  || true && false
        if(a != b || a == b || a > b && a < b)
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
        System.out.println(a & b);
        System.out.println(Integer.toBinaryString(15));
        System.out.println("plus and minus binary");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(-5));
        System.out.println("left shift -2 << 2");
        System.out.println(2 << 3);
        System.out.println();
        System.out.println("-----");
        System.out.println(20 << 3);
        System.out.println(20 >> 3);
        System.out.println(Integer.toBinaryString(80));
    }

    public static void assignmentOperator()
    {
            // +=, -=, *=, \= , %=
        int a = 10;
        a = a + 5;
        System.out.println(a += 5);
        System.out.println(a);
        int n = 20;
        for(int i =0; i <= 20; i+=2)
        {
            System.out.println(i);
        }
    }

    public static void ternaryOperator()
    {
        //System.out.println(name);
        //System.out.println(c);
        // ? :
        int a = 19;
        int b = 17;
        int c = 11;
        String greaterValue = null;
        /*
        if(a > b && a > c)
        {
            greaterValue = "A";
        }
        else
        {
            if(b > c)
            {
                greaterValue = "B";
            }
            else
            {
                greaterValue = "C";
            }
        }
        */
        //greaterValue = a > b ? "A" : "B";
        //greaterValue = a > b ? a > c ? "a" : b > c ? "b":  "c" : b > c ? "b" : "c";
        greaterValue = a > b ? a > c ? "a" : "c" : b > c ? "b" : "c" ;
        System.out.println("greaterValue "+greaterValue);
    }

}
