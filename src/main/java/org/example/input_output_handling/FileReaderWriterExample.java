package org.example.input_output_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriterExample
{
    public static void main(String[] args)
    {
        try
        {
            //Reading
            Reader reader = new FileReader("src/main/java/test.txt");
            int value = reader.read();
            while(value != -1)
            {
                //System.out.println(value);
                System.out.println((char)value);
                value = reader.read();
            }
            reader.close();
            //Writing
            Writer writer = new FileWriter("src/main/java/test.txt",true);
            writer.write(" Poornima ");
            writer.flush();
            writer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
