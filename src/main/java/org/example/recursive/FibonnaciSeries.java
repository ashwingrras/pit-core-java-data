package org.example.recursive;

public class FibonnaciSeries
{
    public static void main (String args[])
    {
        for(long i=1; i<=9; i++)
        {
            System.out.print(fibonacci(i) +" ");
        }
        System.out.println();
    }

    public static long fibonacci(long number)
    {
        if (number == 1 || number == 2)
        {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
