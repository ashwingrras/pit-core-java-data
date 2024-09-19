package org.example.recursive;

// 5: 5 * 4 * 3 * 2 * 1: 120

public class FactorialWithoutRecursive
{
    static int value = 1;
    public static void main(String[] args)
    {
        int no = 5;
        factorial(no);
        System.out.println("value: "+value);
    }

    public static void factorial(int no)
    {
        //System.out.println("no : "+no);
        //System.out.println("value :"+value);
        if(no > 1)
        {
            value *= no;
            //no--;
            factorial(no - 1);
        }
    }

}
