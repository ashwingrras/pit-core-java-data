package org.example.looping_statements;

public class Example2
{
    public static void main(String[] args)
    {
        int[] values = {2, 4, 1, 3, 5};
        for(int k =0; k < values.length; k++)
        {
            //System.out.println(values[k]);
        }
        int n = 3;
        // labelled loop
        iLoop :for(int i = 0; i < n; i++)
        {
            System.out.println("i = "+i +", ");
               jLoop: for(int j = 0; j < n; j++)
                {
                    System.out.print(" j = "+j +" , ");

                    kLoop: for(int k = 0 ; k < n; k++)
                    {
                        System.out.print(" k = "+k +" , ");
                        if( k == 0)
                        {
                            continue iLoop;
                        }
                    }
                    System.out.println();
                }
            System.out.println();
                //
        }
    }
}
