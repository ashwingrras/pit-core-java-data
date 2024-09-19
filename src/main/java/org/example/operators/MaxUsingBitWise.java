package org.example.operators;

public class MaxUsingBitWise
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 11;
        int max = a - ((a - b) & ((a - b) >> 31));
        System.out.println("The maximum is " + max);
    }
}
