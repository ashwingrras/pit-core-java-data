package org.example.exception_handling;

/*

    exception:
    1. checked exception: compile time checked / unhandled : FileNotFound, IOException, SQLException,
    2. un-checked exception: run time exception: NullPointer, ArrayIndexOutOfBound, Parse,
        NumberFormatException
    3. error: OutOfMemory, StackOverFlow, memoryoutofbound

 */

import java.io.*;
import java.sql.SQLException;
import java.util.zip.InflaterInputStream;

public class ExceptionHandlingExample
{
    static String exceptionDetails = "";
    public static void main(String[] args) throws IOException {

        try (
                FileReader inputStream = new FileReader("");
                FileReader inputStrea2 = new FileReader("")
        ) {



        }
        catch (ArrayIndexOutOfBoundsException | SecurityException |
               FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {

            exceptionDetails = null;
            System.out.println(" at try block");
            readFile();
            Reader reader = new FileReader("");
            reader.read();
            readFile();
            writeFile();

        }/*
        catch (IOException e) {
            // API CALL
            // DATA BASE CREATE EXCEPTION LOG
            throw new RuntimeException(e);
        }*/
        catch (Exception e) {
            System.out.println("inside catch block");
            exceptionDetails = e.getMessage();
            //e.printStackTrace();
            //throw new RuntimeException(e);
            throw  new NullPointerException("here we give null pointer exception");
        }


        finally
        {
            System.out.println(" at finally block main method");
            /*
                payload:
                {
                exception: exceptionDetails
                }

             */
        }

    }

    // Logs / Activity Logs
    public static void readFile() throws FileNotFoundException {

            try
            {
                Reader reader = new FileReader("");
            }
            catch (Exception e)
            {
                System.out.println(" at catch block");
            }
            finally
            {
                System.out.println("at finally method readFile");
            }


    }

    public static void writeFile() throws IOException {

        Writer reader = new FileWriter("");

    }

}
