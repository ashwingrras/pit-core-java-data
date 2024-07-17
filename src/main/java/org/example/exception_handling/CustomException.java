package org.example.exception_handling;

import java.io.FileWriter;
import java.io.Writer;

class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        // Calling constructor of parent Exception
        super(str);
    }
}
// Class that uses above MyException
public class CustomException
{
    public static void main(String args[])
    {
        try
        {
            Writer reader = new FileWriter("");
            // throw an object of user defined exception
            throw new UserDefinedException("This is user-defined exception");
        }
        catch (Exception ude)
        {

            ude.printStackTrace();
            System.out.println("Caught the exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage());

        }
    }
}

