package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        String sql = "INSERT INTO voters (id, name, age) VALUES (?, ?, ?)";

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = connection.prepareStatement(sql);

            // First set of parameters
            pstmt.setInt(1, 201);
            pstmt.setString(2, "Raju");
            pstmt.setInt(3, 30);
            pstmt.executeUpdate();

            // error

            // Second set of parameters
            pstmt.setInt(1, 202);
            pstmt.setString(2, "Amit");
            pstmt.setInt(3, 25);
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

