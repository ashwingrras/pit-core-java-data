package org.example.input_output_handling;

import java.io.File;

public class FileHandlingExample
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("src/main/java/poornima-student-data.txt");
            //System.out.println(file.mkdirs());
            System.out.println(file.delete());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
