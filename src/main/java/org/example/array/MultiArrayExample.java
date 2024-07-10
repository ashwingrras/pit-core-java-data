package org.example.array;

import java.util.Arrays;

public class MultiArrayExample
{
    public static void main(String[] args)
    {
        // first way
        System.out.println("first way of array define");
        String[][] values = { {"aman","raman"} , {"kapil","ashish"} };
        System.out.println(Arrays.toString(values));
        System.out.println(values[1][1]);
        for(int i =0; i < values.length; i++)
        {
            System.out.println("row/i "+i);
            System.out.println(Arrays.toString(values[i]));
            for(int j =0; j < values[i].length; j++)
            {
                //System.out.println(values[i][j]);
            }
        }
        // second way
        System.out.println("second way of array define");
        String[][] names = new String[2][2];
        names[0][0] = "aman";
        names[0][1] = "raman";
        names[1][0] = "kapil";
        names[1][1] = "ashish";
        for(int i =0; i < names.length; i++)
        {
            System.out.println("row/i "+i);
            System.out.println(Arrays.toString(names[i]));
            for(int j =0; j < names[i].length; j++)
            {
                //System.out.println(names[i][j]);
            }
        }
        // jagged array
        String[][] collegeCourse =
                { {"b.tech, m.tech"}, {"b.com","b.a","bsc","bca"}, {"mca","mba","mcom"}};

        //jagged
        String[][] courses = new String[3][];
        courses[0] = new String[2];
        courses[1] = new String[4];
        courses[2] = new String[3];
        for(int i =0; i < courses.length; i++)
        {
            //courses[i] = new String[courses.length + (i+1)];
            System.out.println("size of row "+i+", size "+courses[i].length);
            System.out.println(Arrays.toString(courses[i]));
            for(int j=0; j < courses[i].length; j++)
            {
                System.out.println(courses[i][j]);
            }
        }

    }
}
