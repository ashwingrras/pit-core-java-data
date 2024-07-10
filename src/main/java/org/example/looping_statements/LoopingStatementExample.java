package org.example.looping_statements;

public class LoopingStatementExample
{
    /*
    loops:
        1. for
        2. while
        3. do while
        4. enhanced for / for each
        5. labelled loop

        jump statement
        1. break;
        2. continue;
     */
    {
        System.out.println(" at block statement, before main");
    }

    public static void main(String[] args)
    {
        // initialize ; condition ; increment/ decrement
        {
            System.out.println("inside block statement");
        }
        System.out.println("1");
        System.out.println("2");
        System.out.println("before for loop");
        for(int i = 0; i < 10; i++)
        {

            if(i == 2)
            {
                continue;
            }
            System.out.println(" i is : "+i);
        }
        System.out.println("after for loop");
        System.out.println("now using while loop");
        int i = 0;
        while( i < 10)
        {
            i++;
        }
        System.out.println(i);
        int j = 10;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 10);

        // for each, enhanced for loop
        int[] values = {2, 4, 1, 3, 5};
        for(int k =0; k < values.length; k++)
        {
            System.out.println(values[k]);
        }
        for(int value : values)
        {
            System.out.println(value);
        }
        String[] names = {"aman","simran","ashwin","kapil"};
        for(String name : names)
        {
            System.out.println(name);
        }
        var testVar = 10.5f;
        testVar = 10.0f;
        System.out.println("test var "+testVar);
    }

    {
        System.out.println(" at block statement, after main");
    }
}
