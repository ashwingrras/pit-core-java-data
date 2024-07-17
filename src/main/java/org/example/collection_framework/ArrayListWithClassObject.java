package org.example.collection_framework;

import java.util.ArrayList;

public class ArrayListWithClassObject
{
    public static void main(String[] args)
    {

        ArrayList<Student> arrayList = new ArrayList<>();
        for(int i =0; i < 5; i++)
        {
            StudentAddress studentAddress = new StudentAddress();
            studentAddress.setId(500 + i);
            studentAddress.setStudentId(i);
            studentAddress.setPlotNo("A "+i);
            studentAddress.setArea("gopal pura");
            studentAddress.setCity("jaipur");
            studentAddress.setState("rajasthan");
            studentAddress.setCountry("india");
            Student student = new Student(i, "Devesh"+i,
                    "999999999"+i,i+"devesh@gmail.com", studentAddress);
            arrayList.add(student);
        }
        System.out.println(arrayList);
        Student student = arrayList.getFirst();
        System.out.println(student.getId());
        System.out.println(student.getName());
        for(Student student1 : arrayList)
        {
            System.out.println(student1.getId());
            System.out.println(student1.getName());
            StudentAddress studentAddress = student1.getStudentAddress();
            System.out.println(studentAddress.getId());
            System.out.println(studentAddress.getPlotNo());
        }
    }
}
