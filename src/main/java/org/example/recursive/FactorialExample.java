package org.example.recursive;


public class FactorialExample {

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    public static int factorial(int n) {
        // Base case
        if (n == 0)
        {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
}

/*
Explanation:
 */