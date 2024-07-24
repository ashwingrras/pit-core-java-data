package org.example.jdbc;

import java.sql.*;
import java.util.ArrayList;

public class GetStudentExample
{
    private static final String URL = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "ashwin1234";


    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(1, "Amit", 20, "amit@grrassolutions.in");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<Student> arrayList = new ArrayList<>();
            while (resultSet.next())
            {
             Student student1 = new Student(
                     resultSet.getInt("id"),
                     resultSet.getString("name"),
                     resultSet.getInt("age"),
                     resultSet.getString("email")
                     );
             arrayList.add(student1);
            }
            System.out.println(arrayList);
            for(Student student1 : arrayList)
            {
                System.out.println(student1.getName());
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally {
            try {
                // Close resources
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
