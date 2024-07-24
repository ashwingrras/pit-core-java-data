package org.example.jdbc;

import java.sql.*;

public class ScrollableResultSetExample {

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

            //statement
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            resultSet = statement.executeQuery("SELECT * FROM students");

            // Move to the last row
            if (resultSet.last()) {
                System.out.println("Last row: ");
                printCurrentRow(resultSet);
            }

            // Move to the first row
            if (resultSet.first()) {
                System.out.println("First row: ");
                printCurrentRow(resultSet);
            }

            // Move to the second row
            if (resultSet.absolute(2)) {
                System.out.println("Second row: ");
                printCurrentRow(resultSet);
            }

            // Move to the previous row
            if (resultSet.relative(-1)) {
                System.out.println("Previous row from current position: ");
                printCurrentRow(resultSet);
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

    //TODO here we printing current row of cursor
    private static void printCurrentRow(ResultSet resultSet) throws SQLException {
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
}

