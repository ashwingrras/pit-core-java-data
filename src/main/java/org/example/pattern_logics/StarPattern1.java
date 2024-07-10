package org.example.pattern_logics;

public class StarPattern1
{

    public static void main(String[] args)
    {
        int n = 5;
        /*
        for(int i=0; i < n; i++)
        {
            for(int j=n; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        for(int i=0; i < n; i++)
        {
            for(int j=0; j <=n; j++)
            {
                if(j <= i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
