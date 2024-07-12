package org.example.pattern_logics;

public class FlagPattern
{
    public static void main(String[] args)
    {
        int n = 3;
        int maxRowCol = n * 2 + 1; // 7
        int spaceCreate = n - 1; // 2
        int standIndex = maxRowCol - spaceCreate;
        int standStartIndex = 1;
        for(int i=0; i < maxRowCol; i++)
        {
            for(int j=0; j < maxRowCol; j++)
            {
                if(j < spaceCreate)
                {
                    System.out.print(" ");
                }
                else
                {
                    /////
                    if(i < standIndex)
                    {
                        if(j >= spaceCreate && i < spaceCreate || j == spaceCreate)
                        {
                            System.out.print("*");
                        }
                    }
                    else
                    {
                        /*
                        if(j == spaceCreate || j <= spaceCreate + standStartIndex || j >= spaceCreate - standStartIndex)
                        {
                            System.out.print("*");
                            standStartIndex++;
                        }
                        */
                    }
                }
            }
            System.out.println();
        }
    }
}
