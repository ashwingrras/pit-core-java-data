package org.example.recursive;

public class StringLength
{

    public static void main(String[] args)
    {


        String str ="vikash";
        System.out.println(recLen(str));
    }

    private static int recLen(String str)
    {
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }

}
