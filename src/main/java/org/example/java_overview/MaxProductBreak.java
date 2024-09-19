package org.example.java_overview;

public class MaxProductBreak {
    public static int maxProduct(int n) {
        // Special cases
        if (n == 2) return 1; // 1 * 1
        if (n == 3) return 2; // 1 * 2

        // Initialize the product
        int product = 1;

        // Break n into parts of 3 until n is reduced to 4 or less
        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        // Multiply the remaining part
        product *= n;

        return product;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = maxProduct(n);
        System.out.println("Maximum product for " + n + " is: " + result); // Output: 36
    }
}

