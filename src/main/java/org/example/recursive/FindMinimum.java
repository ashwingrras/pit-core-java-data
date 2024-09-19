package org.example.recursive;

public class FindMinimum
{
    public static void main(String args[])
    {
        int[] array = {10, 4, 6, 12, 0};
        int n = array.length;

        System.out.println(findMinRec(array, n));
    }
    public static int findMinRec(int[] array, int n)
    {
        if(n == 1)
            return array[0];

        return Math.min(array[n-1], findMinRec(array, n-1));
    }
}
