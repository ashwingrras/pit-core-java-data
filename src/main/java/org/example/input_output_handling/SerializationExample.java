package org.example.input_output_handling;


/*


    FileReader
    FileWriter
    BufferReader
    BufferWriter
    PrintWriter
    PrintStream
    FileInputStream
    FileOutputStream
    Serialization
    DeSerialization


    primitive data type
    1. PrintWriter
    2. FileOutputStream

    Today task
    1. ByteArrayOutputStream
    2. ByteArrayInputStream
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample
{

    public static void main(String[] args)
    {
        {
            try
            {
                //serialization
                Student student1 = new Student(101,"Harshit",20);
                Student student2 = new Student(101,"Devesh",20);
                Student student3 = new Student(101,"Yogam",20);
                Student student4 = new Student(101,"Ansh",20);
                Student student5 = new Student(101,"Lalit",20);
                Student student6 = new Student(101,"Himani",20);
                Student student7 = new Student(101,"Nandini",20);
                FileOutputStream fos = new FileOutputStream("devesh/himani.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(student1);
                oos.writeObject(student2);
                oos.writeObject(student3);
                oos.writeObject(student4);
                oos.writeObject(student5);
                oos.writeObject(student6);
                oos.writeObject(student7);
                oos.flush();
                oos.close();
                fos.close();
                System.out.println("Serialization success");
                //DeSerialization
                FileInputStream fis = new FileInputStream("devesh/himani.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                while(true)
                {
                    try
                    {
                        Student studentRead1 = (Student) ois.readObject();
                        if(null != studentRead1 && null != studentRead1.name)
                        {
                            System.out.println("deserialize student : "+studentRead1.name);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        break;
                    }
                }
                ois.close();
                System.out.println("DeSerialization success");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
