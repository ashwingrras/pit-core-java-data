package org.example.jdbc;

import java.sql.*;

public class SaveStudentExample {


    private static final String URL = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "ashwin1234";

    // table create
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS students (" +
            "id INT PRIMARY KEY," +
            "name VARCHAR(100)," +
            "age INT," +
            "email VARCHAR(100))";
    // insert record
    private static final String INSERT_STUDENT_SQL = "INSERT INTO students (id, name, age, email) VALUES (?, ?, ?, ?)";

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
            statement.execute(CREATE_TABLE_SQL);

            //Save the student object
            preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setString(4, student.getEmail());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0)
            {
                System.out.println("Student inserted successfully.");
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

