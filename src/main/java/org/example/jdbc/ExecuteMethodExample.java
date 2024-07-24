package org.example.jdbc;

import java.sql.*;

public class ExecuteMethodExample {

    private static final String URL = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "ashwin1234";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            statement = connection.createStatement();

            String sql = "SELECT * FROM students";
            boolean hasResultSet = statement.execute(sql);

            if (hasResultSet)
            {
                resultSet = statement.getResultSet();
                System.out.println("Query Result:");
                while (resultSet.next())
                {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    String email = resultSet.getString("email");

                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Email: " + email);
                    System.out.println();
                }
            } else
            {
                int updateCount = statement.getUpdateCount();
                System.out.println("Update Count: " + updateCount);
            }

            String updateSql = "UPDATE students SET age = 23 WHERE name = 'Raju'";
            boolean hasUpdateCount = statement.execute(updateSql);

            if (!hasUpdateCount) {
                int updateCount = statement.getUpdateCount();
                System.out.println("Update Count after Update: " + updateCount);
            }

            // DDL statement
            String ddlSql = "ALTER TABLE students ADD COLUMN address VARCHAR(200)";
            boolean hasDdlResult = statement.execute(ddlSql);

            if (!hasDdlResult) {
                int ddlUpdateCount = statement.getUpdateCount();
                System.out.println("DDL Update Count: " + ddlUpdateCount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close resources
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

