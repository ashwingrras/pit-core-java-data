package org.example.array;

/*
    Array
    1. single dimension
    2. multi dimension
    3. jagged array
 */

import java.util.Arrays;

public class ArrayExample1
{
    public static void main(String[] args)
    {
        String name = "ashwin";
        // first approach / way
        String[] names = {"aman","suman","rajesh","ashwin"}; // 4
        System.out.println(names);
        for(String item : names)
        {
            System.out.println(item);
        }
        int namesLength = names.length;
        for(int i=0; i < namesLength; i++)
        {
            System.out.println(names[i]);
        }
        // second way
        String[] values = new String[5];
        System.out.println(values);
        System.out.println(Arrays.toString(values));
        values[2] = "sourabh";
        System.out.println(Arrays.toString(values));
    }
}
