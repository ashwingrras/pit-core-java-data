package org.example.control_statements;

public class ControlStatementExamples
{
    /*
        control structure / statement
        1. if
        2. if else
        3. nested if else
        4. else if
        5. switch ( 1. case 2. with lambda)

     */

    public static void main(String[] args)
    {

        //int age = o to 60;
        //String category =// "normal" , "ex-emp", "army"
        // case 1: 18 >= && <= 30
        // case 2: 30 > && <= 35 && ex-employee
        // case 3: 35 > && <= 40 && army
        int age = 31;
        String category = "normal";
        boolean isEligible = false;
        if(age >= 18 && age <= 30)
        {
            isEligible = true;
        }
        else
        {
            if(age > 30 && age <= 35 && category.equals("ex-emp"))
            {
                isEligible = true;
            }
            else
            {
                if(age > 35 && age <= 40 && category.equals("army"))
                {
                    isEligible = true;
                }
            }
        }
        System.out.println("isEligible = "+isEligible);

        int day = 0;

        switch (day) // expression
        {
            case 0:
                System.out.println("today is sunday");
                break;
            case 1:
                System.out.println("today is monday");
                break;
            default:
                System.out.println("not a valid day");
        }

        switch (day) // expression
        {
            case 0 ->
                System.out.println("today is sunday");
            case 1 ->
                System.out.println("today is monday");
            default ->
                System.out.println("not a valid day");
        }
    }
}
