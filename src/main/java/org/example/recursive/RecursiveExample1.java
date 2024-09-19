package org.example.recursive;

public class RecursiveExample1
{
    static int sumWithRecursive = 0;
    public static void main(String[] args)
    {
            int[] array = {2,1,5,4,3};
            int arrayLength = array.length;
            int sum = 0;
            for(int i=0; i < arrayLength; i++)
            {
                sum += array[i];
            }
            System.out.println("sum : "+sum);
            sumOfArray(array, arrayLength, 0);
            System.out.println("sum with recursive : "+sumWithRecursive);
    }

    public static void sumOfArray(int[] array, int length, int counter)
    {
        if(counter != length)
        {
         sumWithRecursive += array[counter];
         counter++;
         sumOfArray(array, length, counter);
        }
    }

}
