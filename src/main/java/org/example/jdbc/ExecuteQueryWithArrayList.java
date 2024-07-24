package org.example.jdbc;

import org.example.jdbc.modal.Student;

import java.sql.*;
import java.util.ArrayList;

public class ExecuteQueryWithArrayList
{
    public static void main(String[] args)
    {
        try
        {
            Connection connection = new DbHelper().getSqlConnection();
            if(null != connection)
            {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from student");
                ArrayList<Student> arrayList = new ArrayList<>();
                while (resultSet.next())
                {
                    Student student = new Student();
                    student.setId(resultSet.getInt("id"));
                    student.setName(resultSet.getString("name"));
                    student.setMobileNo(resultSet.getString("mobileno"));
                    student.setEmailId(resultSet.getString("emailid"));
                    student.setAge(resultSet.getInt("age"));
                    arrayList.add(student);
                }
                System.out.println("student list: "+arrayList);
                System.out.println("now print data using list");
                for(Student student : arrayList)
                {
                    System.out.println("name: "+student.getName() +", age: "+student.getAge());
                }
                connection.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
