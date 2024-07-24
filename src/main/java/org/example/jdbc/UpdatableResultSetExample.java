package org.example.jdbc;

import java.sql.*;

public class UpdatableResultSetExample {

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

            // statement
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            // retrieve data
            resultSet = statement.executeQuery("SELECT * FROM students");

            // Update data in the ResultSet
            if (resultSet.next())
            { // Move to the first row
                resultSet.updateString("name", "Amit New");
                resultSet.updateInt("age", 21);
                resultSet.updateRow(); // Commit changes to the database
            }

            /////inserting new row into the ResultSet
            resultSet.moveToInsertRow();
            resultSet.updateInt("id", 2);
            resultSet.updateString("name", "Raju");
            resultSet.updateInt("age", 23);
            resultSet.updateString("email", "raju@grrassolutions.com");
            resultSet.insertRow();
            /////

            ////// Deleting a row
            //resultSet.absolute(3); // Move to the third row
            //resultSet.deleteRow();
            //////

            //updated ResultSet
            resultSet.beforeFirst();
            while (resultSet.next()) {
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

