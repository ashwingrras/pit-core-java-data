package org.example.input_output_handling;


import java.io.*;

/*
    import java.io.*

    Stream: sequence of bytes, continuous
    file, socket, api, network
    audio, video, text, image

    1 GB:  10 mb, 10 mb :
     4:17
     3:30 to 4:17 to 5:00

    Buffer:

    File

    1. Reader
    2. Writer
    3. FileReader
    4. FileWriter
    5. InputStreamReader
    6. OutputStreamReader
    7. BufferReader
    8. BufferWriter
    9. BufferInputStreamReader
    10. BufferOutputStreamWriter
    11. PrintStream
    12. PrintWriter
    13. SequenceInput
    14. PushbackReader


 */
public class InputOutputExample
{
    public static void main(String[] args)
    {
        try
        {
            /*
            //Reading
            Reader reader = new FileReader("src/main/java/test.txt");
            int value = reader.read();
            while(value != -1)
            {
                //System.out.println(value);
                System.out.print((char)value);
                value = reader.read();
            }
            reader.close();
            //Writing
            Writer writer = new FileWriter("src/main/java/test-new.txt",true);
            writer.write(" Institute");
            writer.write(" , Sitapura");
            writer.flush();
            writer.close();
            */
            //
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

