package org.example.recursive;

public class CheckPrime
{
    public static void main(String[] args)
    {

        int n = 15;

        if (isPrime(n, 5))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean isPrime(int n, int i)
    {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

}
