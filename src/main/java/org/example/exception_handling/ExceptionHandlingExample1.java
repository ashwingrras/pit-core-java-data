package org.example.exception_handling;

/*
    1. checked exception: Innterupted, filenotfound, IOException, parse, sql, class not found
    2. unchecked exception: Arithmetic, null pointer, out of bound , numberformatexception
    3. error: memoryoutofbound, stack overflow,
 */

/*
    checked exception
    unchecked exception
    throw
    throws
    try
    catch
    finally

 */

public class ExceptionHandlingExample1
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("abcd");
            String a = "10 ";
            //int b = Integer.parseInt(a);
            int b = printParseValueWithThrows(a);
            System.out.println("b "+b);
            int c = 10 + b;
            System.out.println("c "+c);
            //FileInputStream fileInputStream = new FileInputStream("");
        }
        catch (NullPointerException e)
        {
            System.out.println("at main method NullPointerException exception");
            e.printStackTrace();
            System.out.println(e.getMessage());
            //System.out.println(e.getCause());
        }
        catch (Exception e)
        {
            System.out.println("at main method NumberFormatException exception");
            e.printStackTrace();
            System.out.println(e.getMessage());
            //System.out.println(e.getCause());
        }
    }

    public static int printParseValue(String a)
    {
        int b = -1;
        try
        {
            b = Integer.parseInt(a);
            System.out.println("b "+b);
            if(b == 10)
            {
                throw new ArithmeticException("devesh dhyan nhi de rha hai");
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("at printParseValue method exception");
            System.out.println(e);
            //throw new RuntimeException("lalit");
            //e.printStackTrace();
        }
        catch (Exception e)
        {

        }
        return b;
    }

    public static int printParseValueWithThrows(String a) throws Exception
    {
        System.out.println("at printParseValueWithThrows");
        int b = Integer.parseInt(a);
        System.out.println("b "+b);
        return b;
    }

}
