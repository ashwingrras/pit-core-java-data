package org.example.input_output_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStreamReaderWriterExample
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("src/main/java/test.txt");
            System.out.println((char) fileInputStream.read());
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            System.out.println((char) inputStreamReader.read());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
