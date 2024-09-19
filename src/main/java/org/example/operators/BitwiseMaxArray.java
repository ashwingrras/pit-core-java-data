package org.example.operators;

public class BitwiseMaxArray {
    public static int getMax(int a, int b) {
        int difference = a - b;
        int k = (difference >> 31) & 1;
        return a - k * difference;
    }

    public static int findMaxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = getMax(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 9, 1, 4};
        System.out.println("Max in array is: " + findMaxInArray(arr));
    }
}

