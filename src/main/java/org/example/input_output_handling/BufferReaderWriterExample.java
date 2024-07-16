package org.example.input_output_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReaderWriterExample
{
    public static void main(String[] args)
    {
        try
        {
            //With Buffer Reader
            FileReader fileReader = new FileReader("src/main/java/test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            /*int readCharacter = bufferedReader.read();
            System.out.println("readCharacter: "+(char) readCharacter);*/
            String readLine = bufferedReader.readLine();
            System.out.println("readLine: "+readLine);
            int valueBuffer = bufferedReader.read();
            while(valueBuffer != -1)
            {
                System.out.print((char)valueBuffer);
                valueBuffer = bufferedReader.read();
            }
            bufferedReader.close();
            fileReader.close();

            //With BufferWriter
            FileWriter fileWriter = new FileWriter("src/main/java/test-new.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Welcome To ");
            bufferedWriter.write("Poornima Institute");
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
